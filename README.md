# tesla-api-client

Java library for interfacing with the Tesla Owner API. 

This library is generated using [swagger-codegen](https://github.com/swagger-api/swagger-codegen).
See [swagger.yml](swagger.yml) to view the Swagger document used to generate the library.

## Building Library from Swagger
2. If not already installed, install or obtain a release of `swagger-codegen`
   If on Mac and using Homebrew, you can use `brew install swagger-codegen`
3. Generate the library
   ```bash
   swagger-codegen generate \
   -i swagger.yml -l java -o . \
   --library retrofit2 --api-package com.github.jonahwh.tesla-api-client \
   --model-package com.github.jonahwh.tesla-api-client.model
   ```
   This will generate the library.
4. Build the library
   ```bash
   gradle assemble # or `chmod +x ./gradlew && ./gradlew assemble`
   ``` 
5. The library will be built in `build/libs/`
   
## Installation
### Gradle
    compile 'com.github.jonahwh:tesla-api-client:1.14.0'

### Maven
    <dependency>
        <groupId>com.github.jonahwh</groupId>
        <artifactId>tesla-api-client</artifactId>
        <version>1.14.0</version>
    </dependency>
    

## Usage

Here is an example of how this library can be used to make requests to the Tesla API.

```java
import com.github.jonahwh.ApiClient;
import com.github.jonahwh.tesla_api_client.AuthenticationApi;
import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;
import com.github.jonahwh.tesla_api_client.VehiclesApi;
import com.github.jonahwh.tesla_api_client.model.CreateAccessTokenRequest;
import com.github.jonahwh.tesla_api_client.model.CreateAccessTokenResponse;
import com.github.jonahwh.tesla_api_client.model.GetVehiclesResponse;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

class TeslaApiClientExample {
    public static void main(String[] args) throws IOException {
        // Anonymous API Client for Authentication
        ApiClient anonymousApiClient = new ApiClient();
        anonymousApiClient.createDefaultAdapter();
        anonymousApiClient.configureFromOkclient(new OkHttpClient.Builder().build());

        // Authenticated API Client
        ApiClient authedApiClient = new ApiClient();
        authedApiClient.createDefaultAdapter();
        authedApiClient.configureFromOkclient(
                new OkHttpClient.Builder().addInterceptor(new AuthenticationInterceptor()).build()
        );

        AuthenticationApi authApi = anonymousApiClient.createService(AuthenticationApi.class);
        VehiclesApi vehiclesApi = authedApiClient.createService(VehiclesApi.class);
        VehicleCommandsApi commandsApi = authedApiClient.createService(VehicleCommandsApi.class);

        // TESLA_CLIENT_ID and TESLA_CLIENT_SECRET are available here: https://pastebin.com/YiLPDggh
        CreateAccessTokenRequest request = new CreateAccessTokenRequest()
                .grantType("password") // Do not change
                .clientId("TESLA_CLIENT_ID")
                .clientSecret("TESLA_CLIENT_SECRET")
                .email("email@example.com") // Tesla API User's email
                .password("password123"); // Tesla API User's password


        CreateAccessTokenResponse body = authApi.createOauthToken(request).execute().body();
        if (body != null) {
            // Tesla API Access Token for this account. You'll need to make this available to the
            // AuthenticationInterceptor
            String accessToken = body.getAccessToken();

            // Get the list of vehicles in the user's account
            GetVehiclesResponse vehicles = vehiclesApi.getVehicles().execute().body();
            if (vehicles != null) {
                // Get the ID of the first vehicle in the user's account.
                String vehicleId = vehicles.getResponse().get(0).getVehicleId();

                // Flash that vehicle's headlights
                commandsApi.flashLights(vehicleId);
            }
        }
    }
}

class AuthenticationInterceptor implements Interceptor {
    @NotNull
    @Override
    public Response intercept(@NotNull Chain chain) {
        Request.Builder builder = chain.request().newBuilder();

        // TODO: Get accessToken from CreateAccessTokenResponse here
        String accessToken = "";

        builder.addHeader("Authorization", String.format("Bearer %s", accessToken));
    }
}
```
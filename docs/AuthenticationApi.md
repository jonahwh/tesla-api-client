# AuthenticationApi

All URIs are relative to *https://owner-api.teslamotors.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOauthToken**](AuthenticationApi.md#createOauthToken) | **POST** oauth/token | Get an Access Token

<a name="createOauthToken"></a>
# **createOauthToken**
> CreateAccessTokenResponse createOauthToken(body)

Get an Access Token

Performs the login. Takes in an plain text email and password, matching the owner&#x27;s login information for [https://my.teslamotors.com/user/login](https://my.teslamotors.com/user/login). Returns a &#x60;access_token&#x60; which is passed along as a header with all future requests to authenticate the user. You must provide the &#x60;Authorization: Bearer {access_token}&#x60; header in all other requests. The current client ID and secret are [available here](http://pastebin.com/YiLPDggh)

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.AuthenticationApi;


AuthenticationApi apiInstance = new AuthenticationApi();
CreateAccessTokenRequest body = new CreateAccessTokenRequest(); // CreateAccessTokenRequest | 
try {
    CreateAccessTokenResponse result = apiInstance.createOauthToken(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#createOauthToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateAccessTokenRequest**](CreateAccessTokenRequest.md)|  |

### Return type

[**CreateAccessTokenResponse**](CreateAccessTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


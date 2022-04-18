package com.github.jonahwh.tesla_api_client;

import com.github.jonahwh.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import com.github.jonahwh.tesla_api_client.model.CreateAccessTokenRequest;
import com.github.jonahwh.tesla_api_client.model.CreateAccessTokenResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface AuthenticationApi {
  /**
   * Get an Access Token
   * Performs the login. Takes in an plain text email and password, matching the owner&#x27;s login information for [https://my.teslamotors.com/user/login](https://my.teslamotors.com/user/login). Returns a &#x60;access_token&#x60; which is passed along as a header with all future requests to authenticate the user. You must provide the &#x60;Authorization: Bearer {access_token}&#x60; header in all other requests. The current client ID and secret are [available here](http://pastebin.com/YiLPDggh)
   * @param body  (required)
   * @return Call&lt;CreateAccessTokenResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("oauth/token")
  Call<CreateAccessTokenResponse> createOauthToken(
    @retrofit2.http.Body CreateAccessTokenRequest body
  );

}

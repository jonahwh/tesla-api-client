package com.github.jonahwh.tesla_api_client;

import com.github.jonahwh.ApiClient;
import com.github.jonahwh.tesla_api_client.model.CreateAccessTokenRequest;
import com.github.jonahwh.tesla_api_client.model.CreateAccessTokenResponse;
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for AuthenticationApi
 */
public class AuthenticationApiTest {

    private AuthenticationApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AuthenticationApi.class);
    }


    /**
     * Get an Access Token
     *
     * Performs the login. Takes in an plain text email and password, matching the owner&#x27;s login information for [https://my.teslamotors.com/user/login](https://my.teslamotors.com/user/login). Returns a &#x60;access_token&#x60; which is passed along as a header with all future requests to authenticate the user. You must provide the &#x60;Authorization: Bearer {access_token}&#x60; header in all other requests. The current client ID and secret are [available here](http://pastebin.com/YiLPDggh)
     */
    @Test
    public void createOauthTokenTest() {
        CreateAccessTokenRequest body = null;
        // CreateAccessTokenResponse response = api.createOauthToken(body);

        // TODO: test validations
    }
}

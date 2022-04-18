/*
 * Tesla Model S JSON API
 * TODO: Add a description
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.github.jonahwh.tesla_api_client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * CreateAccessTokenRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-04-17T20:08:58.619-07:00[America/Los_Angeles]")
public class CreateAccessTokenRequest {
  @SerializedName("grant_type")
  private String grantType = null;

  @SerializedName("client_id")
  private String clientId = null;

  @SerializedName("client_secret")
  private String clientSecret = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("refresh_token")
  private String refreshToken = null;

  public CreateAccessTokenRequest grantType(String grantType) {
    this.grantType = grantType;
    return this;
  }

   /**
   * The type of oAuth grant. \&quot;password\&quot; or \&quot;refresh_token\&quot;
   * @return grantType
  **/
  @Schema(example = "password", description = "The type of oAuth grant. \"password\" or \"refresh_token\"")
  public String getGrantType() {
    return grantType;
  }

  public void setGrantType(String grantType) {
    this.grantType = grantType;
  }

  public CreateAccessTokenRequest clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * The oAuth client ID
   * @return clientId
  **/
  @Schema(example = "abc", description = "The oAuth client ID")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public CreateAccessTokenRequest clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * The oAuth client secret
   * @return clientSecret
  **/
  @Schema(example = "123", description = "The oAuth client secret")
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public CreateAccessTokenRequest email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email for my.teslamotors.com. Only used with \&quot;password\&quot; grant type.
   * @return email
  **/
  @Schema(example = "elon@teslamotors.com", description = "The email for my.teslamotors.com. Only used with \"password\" grant type.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CreateAccessTokenRequest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The password for my.teslamotors.com. Only used with \&quot;password\&quot; grant type.
   * @return password
  **/
  @Schema(example = "edisonsux", description = "The password for my.teslamotors.com. Only used with \"password\" grant type.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public CreateAccessTokenRequest refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * A refresh token from a previous CreateAccessTokenResponse
   * @return refreshToken
  **/
  @Schema(example = "0f0f0f0f0f0ff0f0f0f0f0f0f0f0f0f0f0f0f0f0f0ff0f0f0f0f0f0f0f0f0f", description = "A refresh token from a previous CreateAccessTokenResponse")
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAccessTokenRequest createAccessTokenRequest = (CreateAccessTokenRequest) o;
    return Objects.equals(this.grantType, createAccessTokenRequest.grantType) &&
        Objects.equals(this.clientId, createAccessTokenRequest.clientId) &&
        Objects.equals(this.clientSecret, createAccessTokenRequest.clientSecret) &&
        Objects.equals(this.email, createAccessTokenRequest.email) &&
        Objects.equals(this.password, createAccessTokenRequest.password) &&
        Objects.equals(this.refreshToken, createAccessTokenRequest.refreshToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grantType, clientId, clientSecret, email, password, refreshToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAccessTokenRequest {\n");
    
    sb.append("    grantType: ").append(toIndentedString(grantType)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

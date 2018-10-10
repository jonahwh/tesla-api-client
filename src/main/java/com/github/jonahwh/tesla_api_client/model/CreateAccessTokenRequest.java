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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreateAccessTokenRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-09T18:52:51.199-07:00")
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

  public CreateAccessTokenRequest grantType(String grantType) {
    this.grantType = grantType;
    return this;
  }

   /**
   * The type of oAuth grant. Always \&quot;password\&quot;
   * @return grantType
  **/
  @ApiModelProperty(example = "password", value = "The type of oAuth grant. Always \"password\"")
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
  @ApiModelProperty(example = "abc", value = "The oAuth client ID")
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
  @ApiModelProperty(example = "123", value = "The oAuth client secret")
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
   * The email for my.teslamotors.com
   * @return email
  **/
  @ApiModelProperty(example = "elon@teslamotors.com", value = "The email for my.teslamotors.com")
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
   * The password for my.teslamotors.com
   * @return password
  **/
  @ApiModelProperty(example = "edisonsux", value = "The password for my.teslamotors.com")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
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
        Objects.equals(this.password, createAccessTokenRequest.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grantType, clientId, clientSecret, email, password);
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


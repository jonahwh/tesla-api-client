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
import com.github.jonahwh.tesla_api_client.model.NavigationRequestRequestValue;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * NavigationRequestRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-10-21T23:18:16.119-07:00")
public class NavigationRequestRequest {
  @SerializedName("type")
  private String type = "share_ext_content_raw";

  @SerializedName("value")
  private NavigationRequestRequestValue value = null;

  @SerializedName("locale")
  private String locale = "en-us";

  @SerializedName("timestamp_ms")
  private String timestampMs = null;

  public NavigationRequestRequest type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Do not change
   * @return type
  **/
  @ApiModelProperty(example = "share_ext_content_raw", value = "Do not change")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public NavigationRequestRequest value(NavigationRequestRequestValue value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public NavigationRequestRequestValue getValue() {
    return value;
  }

  public void setValue(NavigationRequestRequestValue value) {
    this.value = value;
  }

  public NavigationRequestRequest locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Do not change
   * @return locale
  **/
  @ApiModelProperty(example = "en-us", value = "Do not change")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public NavigationRequestRequest timestampMs(String timestampMs) {
    this.timestampMs = timestampMs;
    return this;
  }

   /**
   * Unix timestamp
   * @return timestampMs
  **/
  @ApiModelProperty(value = "Unix timestamp")
  public String getTimestampMs() {
    return timestampMs;
  }

  public void setTimestampMs(String timestampMs) {
    this.timestampMs = timestampMs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NavigationRequestRequest navigationRequestRequest = (NavigationRequestRequest) o;
    return Objects.equals(this.type, navigationRequestRequest.type) &&
        Objects.equals(this.value, navigationRequestRequest.value) &&
        Objects.equals(this.locale, navigationRequestRequest.locale) &&
        Objects.equals(this.timestampMs, navigationRequestRequest.timestampMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value, locale, timestampMs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NavigationRequestRequest {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    timestampMs: ").append(toIndentedString(timestampMs)).append("\n");
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


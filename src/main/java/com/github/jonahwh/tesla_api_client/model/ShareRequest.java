/*
 * Tesla JSON API
 * API for controlling Tesla vehicles
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
import com.github.jonahwh.tesla_api_client.model.ShareRequestValue;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * ShareRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-11-13T20:41:51.979-08:00[America/Los_Angeles]")
public class ShareRequest {
  @SerializedName("type")
  private String type = "share_ext_content_raw";

  @SerializedName("value")
  private ShareRequestValue value = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("timestamp")
  private BigDecimal timestamp = null;

  public ShareRequest type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Change to \&quot;share_dest_content_coords\&quot; if using lat/long
   * @return type
  **/
  @Schema(example = "share_ext_content_raw", description = "Change to \"share_dest_content_coords\" if using lat/long")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ShareRequest value(ShareRequestValue value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Schema(description = "")
  public ShareRequestValue getValue() {
    return value;
  }

  public void setValue(ShareRequestValue value) {
    this.value = value;
  }

  public ShareRequest locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Locale this request should be treated as
   * @return locale
  **/
  @Schema(example = "en-US", description = "Locale this request should be treated as")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public ShareRequest timestamp(BigDecimal timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * UNIX timestamp indicating when this request was sent
   * @return timestamp
  **/
  @Schema(example = "1574041714569", description = "UNIX timestamp indicating when this request was sent")
  public BigDecimal getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(BigDecimal timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShareRequest shareRequest = (ShareRequest) o;
    return Objects.equals(this.type, shareRequest.type) &&
        Objects.equals(this.value, shareRequest.value) &&
        Objects.equals(this.locale, shareRequest.locale) &&
        Objects.equals(this.timestamp, shareRequest.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value, locale, timestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShareRequest {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

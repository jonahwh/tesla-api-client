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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * SentryModeRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-11-13T20:41:51.979-08:00[America/Los_Angeles]")
public class SentryModeRequest {
  @SerializedName("on")
  private Boolean on = null;

  public SentryModeRequest on(Boolean on) {
    this.on = on;
    return this;
  }

   /**
   * Get on
   * @return on
  **/
  @Schema(description = "")
  public Boolean isOn() {
    return on;
  }

  public void setOn(Boolean on) {
    this.on = on;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SentryModeRequest sentryModeRequest = (SentryModeRequest) o;
    return Objects.equals(this.on, sentryModeRequest.on);
  }

  @Override
  public int hashCode() {
    return Objects.hash(on);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SentryModeRequest {\n");
    
    sb.append("    on: ").append(toIndentedString(on)).append("\n");
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

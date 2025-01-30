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
 * ScheduledChargingRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-01-30T09:29:07.245033-08:00[America/Los_Angeles]")
public class ScheduledChargingRequest {
  @SerializedName("time")
  private Integer time = null;

  @SerializedName("enable")
  private Boolean enable = null;

  public ScheduledChargingRequest time(Integer time) {
    this.time = time;
    return this;
  }

   /**
   * Integer representing the desired charging start time. Value is number of minutes from midnight in intervals of 15
   * @return time
  **/
  @Schema(description = "Integer representing the desired charging start time. Value is number of minutes from midnight in intervals of 15")
  public Integer getTime() {
    return time;
  }

  public void setTime(Integer time) {
    this.time = time;
  }

  public ScheduledChargingRequest enable(Boolean enable) {
    this.enable = enable;
    return this;
  }

   /**
   * Get enable
   * @return enable
  **/
  @Schema(description = "")
  public Boolean isEnable() {
    return enable;
  }

  public void setEnable(Boolean enable) {
    this.enable = enable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduledChargingRequest scheduledChargingRequest = (ScheduledChargingRequest) o;
    return Objects.equals(this.time, scheduledChargingRequest.time) &&
        Objects.equals(this.enable, scheduledChargingRequest.enable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, enable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduledChargingRequest {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
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

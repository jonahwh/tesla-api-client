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
 * ScheduledDepartureRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-04-17T20:40:14.443-07:00[America/Los_Angeles]")
public class ScheduledDepartureRequest {
  @SerializedName("departure_time")
  private Integer departureTime = null;

  @SerializedName("enable")
  private Boolean enable = null;

  @SerializedName("preconditioning_enabled")
  private Boolean preconditioningEnabled = null;

  @SerializedName("preconditioning_weekdays_only")
  private Boolean preconditioningWeekdaysOnly = null;

  @SerializedName("off_peak_charging_enabled")
  private Boolean offPeakChargingEnabled = null;

  @SerializedName("off_peak_charging_weekdays_only")
  private Boolean offPeakChargingWeekdaysOnly = null;

  @SerializedName("end_off_peak_time")
  private Integer endOffPeakTime = null;

  public ScheduledDepartureRequest departureTime(Integer departureTime) {
    this.departureTime = departureTime;
    return this;
  }

   /**
   * Integer representing the desired departure time. Value is number of minutes from midnight in intervals of 15
   * @return departureTime
  **/
  @Schema(description = "Integer representing the desired departure time. Value is number of minutes from midnight in intervals of 15")
  public Integer getDepartureTime() {
    return departureTime;
  }

  public void setDepartureTime(Integer departureTime) {
    this.departureTime = departureTime;
  }

  public ScheduledDepartureRequest enable(Boolean enable) {
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

  public ScheduledDepartureRequest preconditioningEnabled(Boolean preconditioningEnabled) {
    this.preconditioningEnabled = preconditioningEnabled;
    return this;
  }

   /**
   * Get preconditioningEnabled
   * @return preconditioningEnabled
  **/
  @Schema(description = "")
  public Boolean isPreconditioningEnabled() {
    return preconditioningEnabled;
  }

  public void setPreconditioningEnabled(Boolean preconditioningEnabled) {
    this.preconditioningEnabled = preconditioningEnabled;
  }

  public ScheduledDepartureRequest preconditioningWeekdaysOnly(Boolean preconditioningWeekdaysOnly) {
    this.preconditioningWeekdaysOnly = preconditioningWeekdaysOnly;
    return this;
  }

   /**
   * Get preconditioningWeekdaysOnly
   * @return preconditioningWeekdaysOnly
  **/
  @Schema(description = "")
  public Boolean isPreconditioningWeekdaysOnly() {
    return preconditioningWeekdaysOnly;
  }

  public void setPreconditioningWeekdaysOnly(Boolean preconditioningWeekdaysOnly) {
    this.preconditioningWeekdaysOnly = preconditioningWeekdaysOnly;
  }

  public ScheduledDepartureRequest offPeakChargingEnabled(Boolean offPeakChargingEnabled) {
    this.offPeakChargingEnabled = offPeakChargingEnabled;
    return this;
  }

   /**
   * Get offPeakChargingEnabled
   * @return offPeakChargingEnabled
  **/
  @Schema(description = "")
  public Boolean isOffPeakChargingEnabled() {
    return offPeakChargingEnabled;
  }

  public void setOffPeakChargingEnabled(Boolean offPeakChargingEnabled) {
    this.offPeakChargingEnabled = offPeakChargingEnabled;
  }

  public ScheduledDepartureRequest offPeakChargingWeekdaysOnly(Boolean offPeakChargingWeekdaysOnly) {
    this.offPeakChargingWeekdaysOnly = offPeakChargingWeekdaysOnly;
    return this;
  }

   /**
   * Get offPeakChargingWeekdaysOnly
   * @return offPeakChargingWeekdaysOnly
  **/
  @Schema(description = "")
  public Boolean isOffPeakChargingWeekdaysOnly() {
    return offPeakChargingWeekdaysOnly;
  }

  public void setOffPeakChargingWeekdaysOnly(Boolean offPeakChargingWeekdaysOnly) {
    this.offPeakChargingWeekdaysOnly = offPeakChargingWeekdaysOnly;
  }

  public ScheduledDepartureRequest endOffPeakTime(Integer endOffPeakTime) {
    this.endOffPeakTime = endOffPeakTime;
    return this;
  }

   /**
   * Integer representing the desired off peak end time. Value is number of minutes from midnight in intervals of 15
   * @return endOffPeakTime
  **/
  @Schema(description = "Integer representing the desired off peak end time. Value is number of minutes from midnight in intervals of 15")
  public Integer getEndOffPeakTime() {
    return endOffPeakTime;
  }

  public void setEndOffPeakTime(Integer endOffPeakTime) {
    this.endOffPeakTime = endOffPeakTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduledDepartureRequest scheduledDepartureRequest = (ScheduledDepartureRequest) o;
    return Objects.equals(this.departureTime, scheduledDepartureRequest.departureTime) &&
        Objects.equals(this.enable, scheduledDepartureRequest.enable) &&
        Objects.equals(this.preconditioningEnabled, scheduledDepartureRequest.preconditioningEnabled) &&
        Objects.equals(this.preconditioningWeekdaysOnly, scheduledDepartureRequest.preconditioningWeekdaysOnly) &&
        Objects.equals(this.offPeakChargingEnabled, scheduledDepartureRequest.offPeakChargingEnabled) &&
        Objects.equals(this.offPeakChargingWeekdaysOnly, scheduledDepartureRequest.offPeakChargingWeekdaysOnly) &&
        Objects.equals(this.endOffPeakTime, scheduledDepartureRequest.endOffPeakTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(departureTime, enable, preconditioningEnabled, preconditioningWeekdaysOnly, offPeakChargingEnabled, offPeakChargingWeekdaysOnly, endOffPeakTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduledDepartureRequest {\n");
    
    sb.append("    departureTime: ").append(toIndentedString(departureTime)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    preconditioningEnabled: ").append(toIndentedString(preconditioningEnabled)).append("\n");
    sb.append("    preconditioningWeekdaysOnly: ").append(toIndentedString(preconditioningWeekdaysOnly)).append("\n");
    sb.append("    offPeakChargingEnabled: ").append(toIndentedString(offPeakChargingEnabled)).append("\n");
    sb.append("    offPeakChargingWeekdaysOnly: ").append(toIndentedString(offPeakChargingWeekdaysOnly)).append("\n");
    sb.append("    endOffPeakTime: ").append(toIndentedString(endOffPeakTime)).append("\n");
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
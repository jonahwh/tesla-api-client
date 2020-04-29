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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VehicleStateSpeedLimitMode
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-28T21:46:07.171-07:00")
public class VehicleStateSpeedLimitMode {
  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("current_limit_mph")
  private Double currentLimitMph = null;

  @SerializedName("max_limit_mph")
  private Double maxLimitMph = null;

  @SerializedName("min_limit_mph")
  private Double minLimitMph = null;

  @SerializedName("pin_code_set")
  private Boolean pinCodeSet = null;

  public VehicleStateSpeedLimitMode active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public VehicleStateSpeedLimitMode currentLimitMph(Double currentLimitMph) {
    this.currentLimitMph = currentLimitMph;
    return this;
  }

   /**
   * Get currentLimitMph
   * @return currentLimitMph
  **/
  @ApiModelProperty(value = "")
  public Double getCurrentLimitMph() {
    return currentLimitMph;
  }

  public void setCurrentLimitMph(Double currentLimitMph) {
    this.currentLimitMph = currentLimitMph;
  }

  public VehicleStateSpeedLimitMode maxLimitMph(Double maxLimitMph) {
    this.maxLimitMph = maxLimitMph;
    return this;
  }

   /**
   * Get maxLimitMph
   * @return maxLimitMph
  **/
  @ApiModelProperty(value = "")
  public Double getMaxLimitMph() {
    return maxLimitMph;
  }

  public void setMaxLimitMph(Double maxLimitMph) {
    this.maxLimitMph = maxLimitMph;
  }

  public VehicleStateSpeedLimitMode minLimitMph(Double minLimitMph) {
    this.minLimitMph = minLimitMph;
    return this;
  }

   /**
   * Get minLimitMph
   * @return minLimitMph
  **/
  @ApiModelProperty(value = "")
  public Double getMinLimitMph() {
    return minLimitMph;
  }

  public void setMinLimitMph(Double minLimitMph) {
    this.minLimitMph = minLimitMph;
  }

  public VehicleStateSpeedLimitMode pinCodeSet(Boolean pinCodeSet) {
    this.pinCodeSet = pinCodeSet;
    return this;
  }

   /**
   * Get pinCodeSet
   * @return pinCodeSet
  **/
  @ApiModelProperty(value = "")
  public Boolean isPinCodeSet() {
    return pinCodeSet;
  }

  public void setPinCodeSet(Boolean pinCodeSet) {
    this.pinCodeSet = pinCodeSet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleStateSpeedLimitMode vehicleStateSpeedLimitMode = (VehicleStateSpeedLimitMode) o;
    return Objects.equals(this.active, vehicleStateSpeedLimitMode.active) &&
        Objects.equals(this.currentLimitMph, vehicleStateSpeedLimitMode.currentLimitMph) &&
        Objects.equals(this.maxLimitMph, vehicleStateSpeedLimitMode.maxLimitMph) &&
        Objects.equals(this.minLimitMph, vehicleStateSpeedLimitMode.minLimitMph) &&
        Objects.equals(this.pinCodeSet, vehicleStateSpeedLimitMode.pinCodeSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, currentLimitMph, maxLimitMph, minLimitMph, pinCodeSet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleStateSpeedLimitMode {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    currentLimitMph: ").append(toIndentedString(currentLimitMph)).append("\n");
    sb.append("    maxLimitMph: ").append(toIndentedString(maxLimitMph)).append("\n");
    sb.append("    minLimitMph: ").append(toIndentedString(minLimitMph)).append("\n");
    sb.append("    pinCodeSet: ").append(toIndentedString(pinCodeSet)).append("\n");
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


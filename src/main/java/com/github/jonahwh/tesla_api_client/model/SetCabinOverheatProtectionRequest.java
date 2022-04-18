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
 * SetCabinOverheatProtectionRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-04-17T20:40:14.443-07:00[America/Los_Angeles]")
public class SetCabinOverheatProtectionRequest {
  @SerializedName("on")
  private Boolean on = null;

  @SerializedName("fan_only")
  private Boolean fanOnly = null;

  public SetCabinOverheatProtectionRequest on(Boolean on) {
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

  public SetCabinOverheatProtectionRequest fanOnly(Boolean fanOnly) {
    this.fanOnly = fanOnly;
    return this;
  }

   /**
   * Only supported by some vehicles. Must be false on unsupported vehicles.
   * @return fanOnly
  **/
  @Schema(description = "Only supported by some vehicles. Must be false on unsupported vehicles.")
  public Boolean isFanOnly() {
    return fanOnly;
  }

  public void setFanOnly(Boolean fanOnly) {
    this.fanOnly = fanOnly;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetCabinOverheatProtectionRequest setCabinOverheatProtectionRequest = (SetCabinOverheatProtectionRequest) o;
    return Objects.equals(this.on, setCabinOverheatProtectionRequest.on) &&
        Objects.equals(this.fanOnly, setCabinOverheatProtectionRequest.fanOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(on, fanOnly);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetCabinOverheatProtectionRequest {\n");
    
    sb.append("    on: ").append(toIndentedString(on)).append("\n");
    sb.append("    fanOnly: ").append(toIndentedString(fanOnly)).append("\n");
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
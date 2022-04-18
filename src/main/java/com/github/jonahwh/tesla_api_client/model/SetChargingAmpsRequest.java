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
 * SetChargingAmpsRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-04-17T20:40:14.443-07:00[America/Los_Angeles]")
public class SetChargingAmpsRequest {
  @SerializedName("charging_amps")
  private Integer chargingAmps = null;

  public SetChargingAmpsRequest chargingAmps(Integer chargingAmps) {
    this.chargingAmps = chargingAmps;
    return this;
  }

   /**
   * Charging Current in Amps
   * @return chargingAmps
  **/
  @Schema(description = "Charging Current in Amps")
  public Integer getChargingAmps() {
    return chargingAmps;
  }

  public void setChargingAmps(Integer chargingAmps) {
    this.chargingAmps = chargingAmps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetChargingAmpsRequest setChargingAmpsRequest = (SetChargingAmpsRequest) o;
    return Objects.equals(this.chargingAmps, setChargingAmpsRequest.chargingAmps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargingAmps);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetChargingAmpsRequest {\n");
    
    sb.append("    chargingAmps: ").append(toIndentedString(chargingAmps)).append("\n");
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
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
 * TriggerHomelinkRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-01-30T09:29:07.245033-08:00[America/Los_Angeles]")
public class TriggerHomelinkRequest {
  @SerializedName("lat")
  private Double lat = null;

  @SerializedName("lon")
  private Double lon = null;

  public TriggerHomelinkRequest lat(Double lat) {
    this.lat = lat;
    return this;
  }

   /**
   * Get lat
   * @return lat
  **/
  @Schema(description = "")
  public Double getLat() {
    return lat;
  }

  public void setLat(Double lat) {
    this.lat = lat;
  }

  public TriggerHomelinkRequest lon(Double lon) {
    this.lon = lon;
    return this;
  }

   /**
   * Get lon
   * @return lon
  **/
  @Schema(description = "")
  public Double getLon() {
    return lon;
  }

  public void setLon(Double lon) {
    this.lon = lon;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TriggerHomelinkRequest triggerHomelinkRequest = (TriggerHomelinkRequest) o;
    return Objects.equals(this.lat, triggerHomelinkRequest.lat) &&
        Objects.equals(this.lon, triggerHomelinkRequest.lon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lat, lon);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TriggerHomelinkRequest {\n");
    
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lon: ").append(toIndentedString(lon)).append("\n");
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

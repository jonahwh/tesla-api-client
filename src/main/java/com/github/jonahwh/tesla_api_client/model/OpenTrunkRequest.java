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
 * OpenTrunkRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-22T21:54:48.185-07:00[America/Los_Angeles]")
public class OpenTrunkRequest {
  @SerializedName("which_trunk")
  private String whichTrunk = null;

  public OpenTrunkRequest whichTrunk(String whichTrunk) {
    this.whichTrunk = whichTrunk;
    return this;
  }

   /**
   * The trunk to open. &#x60;front&#x60; or &#x60;rear
   * @return whichTrunk
  **/
  @Schema(description = "The trunk to open. `front` or `rear")
  public String getWhichTrunk() {
    return whichTrunk;
  }

  public void setWhichTrunk(String whichTrunk) {
    this.whichTrunk = whichTrunk;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenTrunkRequest openTrunkRequest = (OpenTrunkRequest) o;
    return Objects.equals(this.whichTrunk, openTrunkRequest.whichTrunk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(whichTrunk);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenTrunkRequest {\n");
    
    sb.append("    whichTrunk: ").append(toIndentedString(whichTrunk)).append("\n");
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

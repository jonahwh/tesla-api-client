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
import com.github.jonahwh.tesla_api_client.model.VehicleConfig;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VehicleConfigResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-01T15:39:52.863-07:00")
public class VehicleConfigResponse {
  @SerializedName("response")
  private VehicleConfig response = null;

  public VehicleConfigResponse response(VehicleConfig response) {
    this.response = response;
    return this;
  }

   /**
   * Get response
   * @return response
  **/
  @ApiModelProperty(required = true, value = "")
  public VehicleConfig getResponse() {
    return response;
  }

  public void setResponse(VehicleConfig response) {
    this.response = response;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleConfigResponse vehicleConfigResponse = (VehicleConfigResponse) o;
    return Objects.equals(this.response, vehicleConfigResponse.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(response);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleConfigResponse {\n");
    
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
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


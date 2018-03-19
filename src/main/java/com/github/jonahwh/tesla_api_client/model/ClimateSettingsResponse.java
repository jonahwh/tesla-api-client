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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ClimateSettingsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-18T19:12:38.015-07:00")
public class ClimateSettingsResponse {
  @SerializedName("response")
  private Object response = null;

  public ClimateSettingsResponse response(Object response) {
    this.response = response;
    return this;
  }

   /**
   * 
   * @return response
  **/
  @ApiModelProperty(example = "{\"inside_temp\":17,\"outside_temp\":9.5,\"driver_temp_setting\":22.6,\"passenger_temp_setting\":22.6,\"is_auto_conditioning_on\":false,\"is_front_defroster_on\":null,\"is_rear_defroster_on\":false,\"fan_status\":0}", required = true, value = "")
  public Object getResponse() {
    return response;
  }

  public void setResponse(Object response) {
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
    ClimateSettingsResponse climateSettingsResponse = (ClimateSettingsResponse) o;
    return Objects.equals(this.response, climateSettingsResponse.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(response);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClimateSettingsResponse {\n");
    
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


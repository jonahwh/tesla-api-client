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
import com.github.jonahwh.tesla_api_client.model.GuiState;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * GuistateResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-01-30T09:29:07.245033-08:00[America/Los_Angeles]")
public class GuistateResponse {
  @SerializedName("response")
  private GuiState response = null;

  public GuistateResponse response(GuiState response) {
    this.response = response;
    return this;
  }

   /**
   * Get response
   * @return response
  **/
  @Schema(required = true, description = "")
  public GuiState getResponse() {
    return response;
  }

  public void setResponse(GuiState response) {
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
    GuistateResponse guistateResponse = (GuistateResponse) o;
    return Objects.equals(this.response, guistateResponse.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(response);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuistateResponse {\n");
    
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

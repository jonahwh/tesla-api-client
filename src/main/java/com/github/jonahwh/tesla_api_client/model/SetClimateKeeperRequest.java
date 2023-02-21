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
 * SetClimateKeeperRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-20T17:21:45.734-08:00[America/Los_Angeles]")
public class SetClimateKeeperRequest {
  /**
   * 0 &#x3D; off, 1 &#x3D; Climate Keeper, 2 &#x3D; Dog Mode, 3 &#x3D; Camp Mode
   */
  @JsonAdapter(ClimateKeeperModeEnum.Adapter.class)
  public enum ClimateKeeperModeEnum {
    NUMBER_0(0),
    NUMBER_1(1),
    NUMBER_2(2),
    NUMBER_3(3);

    private Integer value;

    ClimateKeeperModeEnum(Integer value) {
      this.value = value;
    }
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ClimateKeeperModeEnum fromValue(Integer input) {
      for (ClimateKeeperModeEnum b : ClimateKeeperModeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ClimateKeeperModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ClimateKeeperModeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ClimateKeeperModeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextInt();
        return ClimateKeeperModeEnum.fromValue((Integer)(value));
      }
    }
  }  @SerializedName("climate_keeper_mode")
  private ClimateKeeperModeEnum climateKeeperMode = null;

  public SetClimateKeeperRequest climateKeeperMode(ClimateKeeperModeEnum climateKeeperMode) {
    this.climateKeeperMode = climateKeeperMode;
    return this;
  }

   /**
   * 0 &#x3D; off, 1 &#x3D; Climate Keeper, 2 &#x3D; Dog Mode, 3 &#x3D; Camp Mode
   * @return climateKeeperMode
  **/
  @Schema(description = "0 = off, 1 = Climate Keeper, 2 = Dog Mode, 3 = Camp Mode")
  public ClimateKeeperModeEnum getClimateKeeperMode() {
    return climateKeeperMode;
  }

  public void setClimateKeeperMode(ClimateKeeperModeEnum climateKeeperMode) {
    this.climateKeeperMode = climateKeeperMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetClimateKeeperRequest setClimateKeeperRequest = (SetClimateKeeperRequest) o;
    return Objects.equals(this.climateKeeperMode, setClimateKeeperRequest.climateKeeperMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(climateKeeperMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetClimateKeeperRequest {\n");
    
    sb.append("    climateKeeperMode: ").append(toIndentedString(climateKeeperMode)).append("\n");
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

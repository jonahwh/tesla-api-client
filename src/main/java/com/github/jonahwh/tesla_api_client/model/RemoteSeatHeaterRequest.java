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
 * RemoteSeatHeaterRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-01-30T09:29:07.245033-08:00[America/Los_Angeles]")
public class RemoteSeatHeaterRequest {
  /**
   * The desired seat to adjust the heater for.  SeatHeaterFrontLeft: 0, SeatHeaterFrontRight: 1, SeatHeaterRearLeft: 2, SeatHeaterRearLeftBack: 3, SeatHeaterRearCenter: 4, SeatHeaterRearRight: 5, SeatHeaterRearRightBack: 6, SeatHeater3rdRowLeft: 7, SeatHeater3rdRowRight: 8
   */
  @JsonAdapter(HeaterEnum.Adapter.class)
  public enum HeaterEnum {
    NUMBER_0(0),
    NUMBER_1(1),
    NUMBER_2(2),
    NUMBER_3(3),
    NUMBER_4(4),
    NUMBER_5(5),
    NUMBER_6(6),
    NUMBER_7(7),
    NUMBER_8(8);

    private Integer value;

    HeaterEnum(Integer value) {
      this.value = value;
    }
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static HeaterEnum fromValue(Integer input) {
      for (HeaterEnum b : HeaterEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<HeaterEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HeaterEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public HeaterEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextInt();
        return HeaterEnum.fromValue((Integer)(value));
      }
    }
  }  @SerializedName("heater")
  private HeaterEnum heater = null;

  /**
   * Seat heater level
   */
  @JsonAdapter(LevelEnum.Adapter.class)
  public enum LevelEnum {
    NUMBER_1(1),
    NUMBER_2(2),
    NUMBER_3(3);

    private Integer value;

    LevelEnum(Integer value) {
      this.value = value;
    }
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static LevelEnum fromValue(Integer input) {
      for (LevelEnum b : LevelEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<LevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LevelEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public LevelEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextInt();
        return LevelEnum.fromValue((Integer)(value));
      }
    }
  }  @SerializedName("level")
  private LevelEnum level = null;

  public RemoteSeatHeaterRequest heater(HeaterEnum heater) {
    this.heater = heater;
    return this;
  }

   /**
   * The desired seat to adjust the heater for.  SeatHeaterFrontLeft: 0, SeatHeaterFrontRight: 1, SeatHeaterRearLeft: 2, SeatHeaterRearLeftBack: 3, SeatHeaterRearCenter: 4, SeatHeaterRearRight: 5, SeatHeaterRearRightBack: 6, SeatHeater3rdRowLeft: 7, SeatHeater3rdRowRight: 8
   * @return heater
  **/
  @Schema(description = "The desired seat to adjust the heater for.  SeatHeaterFrontLeft: 0, SeatHeaterFrontRight: 1, SeatHeaterRearLeft: 2, SeatHeaterRearLeftBack: 3, SeatHeaterRearCenter: 4, SeatHeaterRearRight: 5, SeatHeaterRearRightBack: 6, SeatHeater3rdRowLeft: 7, SeatHeater3rdRowRight: 8")
  public HeaterEnum getHeater() {
    return heater;
  }

  public void setHeater(HeaterEnum heater) {
    this.heater = heater;
  }

  public RemoteSeatHeaterRequest level(LevelEnum level) {
    this.level = level;
    return this;
  }

   /**
   * Seat heater level
   * @return level
  **/
  @Schema(description = "Seat heater level")
  public LevelEnum getLevel() {
    return level;
  }

  public void setLevel(LevelEnum level) {
    this.level = level;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteSeatHeaterRequest remoteSeatHeaterRequest = (RemoteSeatHeaterRequest) o;
    return Objects.equals(this.heater, remoteSeatHeaterRequest.heater) &&
        Objects.equals(this.level, remoteSeatHeaterRequest.level);
  }

  @Override
  public int hashCode() {
    return Objects.hash(heater, level);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteSeatHeaterRequest {\n");
    
    sb.append("    heater: ").append(toIndentedString(heater)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
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

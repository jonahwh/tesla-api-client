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
import java.math.BigDecimal;
/**
 * DriveState
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-05-22T15:27:38.085-07:00[America/Los_Angeles]")
public class DriveState {
  @SerializedName("shift_state")
  private String shiftState = null;

  @SerializedName("speed")
  private Double speed = null;

  @SerializedName("power")
  private Double power = null;

  @SerializedName("latitude")
  private Double latitude = null;

  @SerializedName("longitude")
  private Double longitude = null;

  @SerializedName("heading")
  private Integer heading = null;

  @SerializedName("gps_as_of")
  private BigDecimal gpsAsOf = null;

  @SerializedName("native_location_supported")
  private Integer nativeLocationSupported = null;

  @SerializedName("native_latitude")
  private Double nativeLatitude = null;

  @SerializedName("native_longitude")
  private Double nativeLongitude = null;

  @SerializedName("native_type")
  private String nativeType = null;

  @SerializedName("timestamp")
  private BigDecimal timestamp = null;

  public DriveState shiftState(String shiftState) {
    this.shiftState = shiftState;
    return this;
  }

   /**
   * Get shiftState
   * @return shiftState
  **/
  @Schema(description = "")
  public String getShiftState() {
    return shiftState;
  }

  public void setShiftState(String shiftState) {
    this.shiftState = shiftState;
  }

  public DriveState speed(Double speed) {
    this.speed = speed;
    return this;
  }

   /**
   * Get speed
   * @return speed
  **/
  @Schema(description = "")
  public Double getSpeed() {
    return speed;
  }

  public void setSpeed(Double speed) {
    this.speed = speed;
  }

  public DriveState power(Double power) {
    this.power = power;
    return this;
  }

   /**
   * Get power
   * @return power
  **/
  @Schema(description = "")
  public Double getPower() {
    return power;
  }

  public void setPower(Double power) {
    this.power = power;
  }

  public DriveState latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @Schema(description = "")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public DriveState longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @Schema(description = "")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public DriveState heading(Integer heading) {
    this.heading = heading;
    return this;
  }

   /**
   * Get heading
   * @return heading
  **/
  @Schema(description = "")
  public Integer getHeading() {
    return heading;
  }

  public void setHeading(Integer heading) {
    this.heading = heading;
  }

  public DriveState gpsAsOf(BigDecimal gpsAsOf) {
    this.gpsAsOf = gpsAsOf;
    return this;
  }

   /**
   * Get gpsAsOf
   * @return gpsAsOf
  **/
  @Schema(description = "")
  public BigDecimal getGpsAsOf() {
    return gpsAsOf;
  }

  public void setGpsAsOf(BigDecimal gpsAsOf) {
    this.gpsAsOf = gpsAsOf;
  }

  public DriveState nativeLocationSupported(Integer nativeLocationSupported) {
    this.nativeLocationSupported = nativeLocationSupported;
    return this;
  }

   /**
   * Get nativeLocationSupported
   * @return nativeLocationSupported
  **/
  @Schema(description = "")
  public Integer getNativeLocationSupported() {
    return nativeLocationSupported;
  }

  public void setNativeLocationSupported(Integer nativeLocationSupported) {
    this.nativeLocationSupported = nativeLocationSupported;
  }

  public DriveState nativeLatitude(Double nativeLatitude) {
    this.nativeLatitude = nativeLatitude;
    return this;
  }

   /**
   * Get nativeLatitude
   * @return nativeLatitude
  **/
  @Schema(description = "")
  public Double getNativeLatitude() {
    return nativeLatitude;
  }

  public void setNativeLatitude(Double nativeLatitude) {
    this.nativeLatitude = nativeLatitude;
  }

  public DriveState nativeLongitude(Double nativeLongitude) {
    this.nativeLongitude = nativeLongitude;
    return this;
  }

   /**
   * Get nativeLongitude
   * @return nativeLongitude
  **/
  @Schema(description = "")
  public Double getNativeLongitude() {
    return nativeLongitude;
  }

  public void setNativeLongitude(Double nativeLongitude) {
    this.nativeLongitude = nativeLongitude;
  }

  public DriveState nativeType(String nativeType) {
    this.nativeType = nativeType;
    return this;
  }

   /**
   * Get nativeType
   * @return nativeType
  **/
  @Schema(description = "")
  public String getNativeType() {
    return nativeType;
  }

  public void setNativeType(String nativeType) {
    this.nativeType = nativeType;
  }

  public DriveState timestamp(BigDecimal timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @Schema(description = "")
  public BigDecimal getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(BigDecimal timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriveState driveState = (DriveState) o;
    return Objects.equals(this.shiftState, driveState.shiftState) &&
        Objects.equals(this.speed, driveState.speed) &&
        Objects.equals(this.power, driveState.power) &&
        Objects.equals(this.latitude, driveState.latitude) &&
        Objects.equals(this.longitude, driveState.longitude) &&
        Objects.equals(this.heading, driveState.heading) &&
        Objects.equals(this.gpsAsOf, driveState.gpsAsOf) &&
        Objects.equals(this.nativeLocationSupported, driveState.nativeLocationSupported) &&
        Objects.equals(this.nativeLatitude, driveState.nativeLatitude) &&
        Objects.equals(this.nativeLongitude, driveState.nativeLongitude) &&
        Objects.equals(this.nativeType, driveState.nativeType) &&
        Objects.equals(this.timestamp, driveState.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shiftState, speed, power, latitude, longitude, heading, gpsAsOf, nativeLocationSupported, nativeLatitude, nativeLongitude, nativeType, timestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriveState {\n");
    
    sb.append("    shiftState: ").append(toIndentedString(shiftState)).append("\n");
    sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
    sb.append("    power: ").append(toIndentedString(power)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    heading: ").append(toIndentedString(heading)).append("\n");
    sb.append("    gpsAsOf: ").append(toIndentedString(gpsAsOf)).append("\n");
    sb.append("    nativeLocationSupported: ").append(toIndentedString(nativeLocationSupported)).append("\n");
    sb.append("    nativeLatitude: ").append(toIndentedString(nativeLatitude)).append("\n");
    sb.append("    nativeLongitude: ").append(toIndentedString(nativeLongitude)).append("\n");
    sb.append("    nativeType: ").append(toIndentedString(nativeType)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

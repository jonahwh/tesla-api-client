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
 * ClimateState
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-01-30T09:29:07.245033-08:00[America/Los_Angeles]")
public class ClimateState {
  @SerializedName("inside_temp")
  private Double insideTemp = null;

  @SerializedName("outside_temp")
  private Double outsideTemp = null;

  @SerializedName("driver_temp_setting")
  private Double driverTempSetting = null;

  @SerializedName("passenger_temp_setting")
  private Double passengerTempSetting = null;

  @SerializedName("left_temp_direction")
  private Integer leftTempDirection = null;

  @SerializedName("right_temp_direction")
  private Integer rightTempDirection = null;

  @SerializedName("is_front_defroster_on")
  private Boolean isFrontDefrosterOn = null;

  @SerializedName("is_rear_defroster_on")
  private Boolean isRearDefrosterOn = null;

  @SerializedName("fan_status")
  private Integer fanStatus = null;

  @SerializedName("is_climate_on")
  private Boolean isClimateOn = null;

  @SerializedName("min_avail_temp")
  private Integer minAvailTemp = null;

  @SerializedName("max_avail_temp")
  private Integer maxAvailTemp = null;

  @SerializedName("seat_heater_left")
  private String seatHeaterLeft = null;

  @SerializedName("seat_heater_right")
  private String seatHeaterRight = null;

  @SerializedName("seat_heater_rear_left")
  private String seatHeaterRearLeft = null;

  @SerializedName("seat_heater_rear_right")
  private String seatHeaterRearRight = null;

  @SerializedName("seat_heater_rear_center")
  private String seatHeaterRearCenter = null;

  @SerializedName("seat_heater_rear_right_back")
  private String seatHeaterRearRightBack = null;

  @SerializedName("seat_heater_rear_left_back")
  private String seatHeaterRearLeftBack = null;

  @SerializedName("battery_heater")
  private Boolean batteryHeater = null;

  @SerializedName("battery_heater_no_power")
  private Boolean batteryHeaterNoPower = null;

  @SerializedName("steering_wheel_heater")
  private Boolean steeringWheelHeater = null;

  @SerializedName("wiper_blade_heater")
  private Boolean wiperBladeHeater = null;

  @SerializedName("side_mirror_heaters")
  private Boolean sideMirrorHeaters = null;

  @SerializedName("is_preconditioning")
  private Boolean isPreconditioning = null;

  @SerializedName("smart_preconditioning")
  private Boolean smartPreconditioning = null;

  @SerializedName("is_auto_conditioning_on")
  private Boolean isAutoConditioningOn = null;

  @SerializedName("defrost_mode")
  private Integer defrostMode = null;

  @SerializedName("timestamp")
  private BigDecimal timestamp = null;

  public ClimateState insideTemp(Double insideTemp) {
    this.insideTemp = insideTemp;
    return this;
  }

   /**
   * Get insideTemp
   * @return insideTemp
  **/
  @Schema(description = "")
  public Double getInsideTemp() {
    return insideTemp;
  }

  public void setInsideTemp(Double insideTemp) {
    this.insideTemp = insideTemp;
  }

  public ClimateState outsideTemp(Double outsideTemp) {
    this.outsideTemp = outsideTemp;
    return this;
  }

   /**
   * Get outsideTemp
   * @return outsideTemp
  **/
  @Schema(description = "")
  public Double getOutsideTemp() {
    return outsideTemp;
  }

  public void setOutsideTemp(Double outsideTemp) {
    this.outsideTemp = outsideTemp;
  }

  public ClimateState driverTempSetting(Double driverTempSetting) {
    this.driverTempSetting = driverTempSetting;
    return this;
  }

   /**
   * Get driverTempSetting
   * @return driverTempSetting
  **/
  @Schema(description = "")
  public Double getDriverTempSetting() {
    return driverTempSetting;
  }

  public void setDriverTempSetting(Double driverTempSetting) {
    this.driverTempSetting = driverTempSetting;
  }

  public ClimateState passengerTempSetting(Double passengerTempSetting) {
    this.passengerTempSetting = passengerTempSetting;
    return this;
  }

   /**
   * Get passengerTempSetting
   * @return passengerTempSetting
  **/
  @Schema(description = "")
  public Double getPassengerTempSetting() {
    return passengerTempSetting;
  }

  public void setPassengerTempSetting(Double passengerTempSetting) {
    this.passengerTempSetting = passengerTempSetting;
  }

  public ClimateState leftTempDirection(Integer leftTempDirection) {
    this.leftTempDirection = leftTempDirection;
    return this;
  }

   /**
   * Get leftTempDirection
   * @return leftTempDirection
  **/
  @Schema(description = "")
  public Integer getLeftTempDirection() {
    return leftTempDirection;
  }

  public void setLeftTempDirection(Integer leftTempDirection) {
    this.leftTempDirection = leftTempDirection;
  }

  public ClimateState rightTempDirection(Integer rightTempDirection) {
    this.rightTempDirection = rightTempDirection;
    return this;
  }

   /**
   * Get rightTempDirection
   * @return rightTempDirection
  **/
  @Schema(description = "")
  public Integer getRightTempDirection() {
    return rightTempDirection;
  }

  public void setRightTempDirection(Integer rightTempDirection) {
    this.rightTempDirection = rightTempDirection;
  }

  public ClimateState isFrontDefrosterOn(Boolean isFrontDefrosterOn) {
    this.isFrontDefrosterOn = isFrontDefrosterOn;
    return this;
  }

   /**
   * Get isFrontDefrosterOn
   * @return isFrontDefrosterOn
  **/
  @Schema(description = "")
  public Boolean isIsFrontDefrosterOn() {
    return isFrontDefrosterOn;
  }

  public void setIsFrontDefrosterOn(Boolean isFrontDefrosterOn) {
    this.isFrontDefrosterOn = isFrontDefrosterOn;
  }

  public ClimateState isRearDefrosterOn(Boolean isRearDefrosterOn) {
    this.isRearDefrosterOn = isRearDefrosterOn;
    return this;
  }

   /**
   * Get isRearDefrosterOn
   * @return isRearDefrosterOn
  **/
  @Schema(description = "")
  public Boolean isIsRearDefrosterOn() {
    return isRearDefrosterOn;
  }

  public void setIsRearDefrosterOn(Boolean isRearDefrosterOn) {
    this.isRearDefrosterOn = isRearDefrosterOn;
  }

  public ClimateState fanStatus(Integer fanStatus) {
    this.fanStatus = fanStatus;
    return this;
  }

   /**
   * Get fanStatus
   * @return fanStatus
  **/
  @Schema(description = "")
  public Integer getFanStatus() {
    return fanStatus;
  }

  public void setFanStatus(Integer fanStatus) {
    this.fanStatus = fanStatus;
  }

  public ClimateState isClimateOn(Boolean isClimateOn) {
    this.isClimateOn = isClimateOn;
    return this;
  }

   /**
   * Get isClimateOn
   * @return isClimateOn
  **/
  @Schema(description = "")
  public Boolean isIsClimateOn() {
    return isClimateOn;
  }

  public void setIsClimateOn(Boolean isClimateOn) {
    this.isClimateOn = isClimateOn;
  }

  public ClimateState minAvailTemp(Integer minAvailTemp) {
    this.minAvailTemp = minAvailTemp;
    return this;
  }

   /**
   * Get minAvailTemp
   * @return minAvailTemp
  **/
  @Schema(description = "")
  public Integer getMinAvailTemp() {
    return minAvailTemp;
  }

  public void setMinAvailTemp(Integer minAvailTemp) {
    this.minAvailTemp = minAvailTemp;
  }

  public ClimateState maxAvailTemp(Integer maxAvailTemp) {
    this.maxAvailTemp = maxAvailTemp;
    return this;
  }

   /**
   * Get maxAvailTemp
   * @return maxAvailTemp
  **/
  @Schema(description = "")
  public Integer getMaxAvailTemp() {
    return maxAvailTemp;
  }

  public void setMaxAvailTemp(Integer maxAvailTemp) {
    this.maxAvailTemp = maxAvailTemp;
  }

  public ClimateState seatHeaterLeft(String seatHeaterLeft) {
    this.seatHeaterLeft = seatHeaterLeft;
    return this;
  }

   /**
   * Get seatHeaterLeft
   * @return seatHeaterLeft
  **/
  @Schema(description = "")
  public String getSeatHeaterLeft() {
    return seatHeaterLeft;
  }

  public void setSeatHeaterLeft(String seatHeaterLeft) {
    this.seatHeaterLeft = seatHeaterLeft;
  }

  public ClimateState seatHeaterRight(String seatHeaterRight) {
    this.seatHeaterRight = seatHeaterRight;
    return this;
  }

   /**
   * Get seatHeaterRight
   * @return seatHeaterRight
  **/
  @Schema(description = "")
  public String getSeatHeaterRight() {
    return seatHeaterRight;
  }

  public void setSeatHeaterRight(String seatHeaterRight) {
    this.seatHeaterRight = seatHeaterRight;
  }

  public ClimateState seatHeaterRearLeft(String seatHeaterRearLeft) {
    this.seatHeaterRearLeft = seatHeaterRearLeft;
    return this;
  }

   /**
   * Get seatHeaterRearLeft
   * @return seatHeaterRearLeft
  **/
  @Schema(description = "")
  public String getSeatHeaterRearLeft() {
    return seatHeaterRearLeft;
  }

  public void setSeatHeaterRearLeft(String seatHeaterRearLeft) {
    this.seatHeaterRearLeft = seatHeaterRearLeft;
  }

  public ClimateState seatHeaterRearRight(String seatHeaterRearRight) {
    this.seatHeaterRearRight = seatHeaterRearRight;
    return this;
  }

   /**
   * Get seatHeaterRearRight
   * @return seatHeaterRearRight
  **/
  @Schema(description = "")
  public String getSeatHeaterRearRight() {
    return seatHeaterRearRight;
  }

  public void setSeatHeaterRearRight(String seatHeaterRearRight) {
    this.seatHeaterRearRight = seatHeaterRearRight;
  }

  public ClimateState seatHeaterRearCenter(String seatHeaterRearCenter) {
    this.seatHeaterRearCenter = seatHeaterRearCenter;
    return this;
  }

   /**
   * Get seatHeaterRearCenter
   * @return seatHeaterRearCenter
  **/
  @Schema(description = "")
  public String getSeatHeaterRearCenter() {
    return seatHeaterRearCenter;
  }

  public void setSeatHeaterRearCenter(String seatHeaterRearCenter) {
    this.seatHeaterRearCenter = seatHeaterRearCenter;
  }

  public ClimateState seatHeaterRearRightBack(String seatHeaterRearRightBack) {
    this.seatHeaterRearRightBack = seatHeaterRearRightBack;
    return this;
  }

   /**
   * Get seatHeaterRearRightBack
   * @return seatHeaterRearRightBack
  **/
  @Schema(description = "")
  public String getSeatHeaterRearRightBack() {
    return seatHeaterRearRightBack;
  }

  public void setSeatHeaterRearRightBack(String seatHeaterRearRightBack) {
    this.seatHeaterRearRightBack = seatHeaterRearRightBack;
  }

  public ClimateState seatHeaterRearLeftBack(String seatHeaterRearLeftBack) {
    this.seatHeaterRearLeftBack = seatHeaterRearLeftBack;
    return this;
  }

   /**
   * Get seatHeaterRearLeftBack
   * @return seatHeaterRearLeftBack
  **/
  @Schema(description = "")
  public String getSeatHeaterRearLeftBack() {
    return seatHeaterRearLeftBack;
  }

  public void setSeatHeaterRearLeftBack(String seatHeaterRearLeftBack) {
    this.seatHeaterRearLeftBack = seatHeaterRearLeftBack;
  }

  public ClimateState batteryHeater(Boolean batteryHeater) {
    this.batteryHeater = batteryHeater;
    return this;
  }

   /**
   * Get batteryHeater
   * @return batteryHeater
  **/
  @Schema(description = "")
  public Boolean isBatteryHeater() {
    return batteryHeater;
  }

  public void setBatteryHeater(Boolean batteryHeater) {
    this.batteryHeater = batteryHeater;
  }

  public ClimateState batteryHeaterNoPower(Boolean batteryHeaterNoPower) {
    this.batteryHeaterNoPower = batteryHeaterNoPower;
    return this;
  }

   /**
   * Get batteryHeaterNoPower
   * @return batteryHeaterNoPower
  **/
  @Schema(description = "")
  public Boolean isBatteryHeaterNoPower() {
    return batteryHeaterNoPower;
  }

  public void setBatteryHeaterNoPower(Boolean batteryHeaterNoPower) {
    this.batteryHeaterNoPower = batteryHeaterNoPower;
  }

  public ClimateState steeringWheelHeater(Boolean steeringWheelHeater) {
    this.steeringWheelHeater = steeringWheelHeater;
    return this;
  }

   /**
   * Get steeringWheelHeater
   * @return steeringWheelHeater
  **/
  @Schema(description = "")
  public Boolean isSteeringWheelHeater() {
    return steeringWheelHeater;
  }

  public void setSteeringWheelHeater(Boolean steeringWheelHeater) {
    this.steeringWheelHeater = steeringWheelHeater;
  }

  public ClimateState wiperBladeHeater(Boolean wiperBladeHeater) {
    this.wiperBladeHeater = wiperBladeHeater;
    return this;
  }

   /**
   * Get wiperBladeHeater
   * @return wiperBladeHeater
  **/
  @Schema(description = "")
  public Boolean isWiperBladeHeater() {
    return wiperBladeHeater;
  }

  public void setWiperBladeHeater(Boolean wiperBladeHeater) {
    this.wiperBladeHeater = wiperBladeHeater;
  }

  public ClimateState sideMirrorHeaters(Boolean sideMirrorHeaters) {
    this.sideMirrorHeaters = sideMirrorHeaters;
    return this;
  }

   /**
   * Get sideMirrorHeaters
   * @return sideMirrorHeaters
  **/
  @Schema(description = "")
  public Boolean isSideMirrorHeaters() {
    return sideMirrorHeaters;
  }

  public void setSideMirrorHeaters(Boolean sideMirrorHeaters) {
    this.sideMirrorHeaters = sideMirrorHeaters;
  }

  public ClimateState isPreconditioning(Boolean isPreconditioning) {
    this.isPreconditioning = isPreconditioning;
    return this;
  }

   /**
   * Get isPreconditioning
   * @return isPreconditioning
  **/
  @Schema(description = "")
  public Boolean isIsPreconditioning() {
    return isPreconditioning;
  }

  public void setIsPreconditioning(Boolean isPreconditioning) {
    this.isPreconditioning = isPreconditioning;
  }

  public ClimateState smartPreconditioning(Boolean smartPreconditioning) {
    this.smartPreconditioning = smartPreconditioning;
    return this;
  }

   /**
   * Get smartPreconditioning
   * @return smartPreconditioning
  **/
  @Schema(description = "")
  public Boolean isSmartPreconditioning() {
    return smartPreconditioning;
  }

  public void setSmartPreconditioning(Boolean smartPreconditioning) {
    this.smartPreconditioning = smartPreconditioning;
  }

  public ClimateState isAutoConditioningOn(Boolean isAutoConditioningOn) {
    this.isAutoConditioningOn = isAutoConditioningOn;
    return this;
  }

   /**
   * Get isAutoConditioningOn
   * @return isAutoConditioningOn
  **/
  @Schema(description = "")
  public Boolean isIsAutoConditioningOn() {
    return isAutoConditioningOn;
  }

  public void setIsAutoConditioningOn(Boolean isAutoConditioningOn) {
    this.isAutoConditioningOn = isAutoConditioningOn;
  }

  public ClimateState defrostMode(Integer defrostMode) {
    this.defrostMode = defrostMode;
    return this;
  }

   /**
   * Get defrostMode
   * @return defrostMode
  **/
  @Schema(description = "")
  public Integer getDefrostMode() {
    return defrostMode;
  }

  public void setDefrostMode(Integer defrostMode) {
    this.defrostMode = defrostMode;
  }

  public ClimateState timestamp(BigDecimal timestamp) {
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
    ClimateState climateState = (ClimateState) o;
    return Objects.equals(this.insideTemp, climateState.insideTemp) &&
        Objects.equals(this.outsideTemp, climateState.outsideTemp) &&
        Objects.equals(this.driverTempSetting, climateState.driverTempSetting) &&
        Objects.equals(this.passengerTempSetting, climateState.passengerTempSetting) &&
        Objects.equals(this.leftTempDirection, climateState.leftTempDirection) &&
        Objects.equals(this.rightTempDirection, climateState.rightTempDirection) &&
        Objects.equals(this.isFrontDefrosterOn, climateState.isFrontDefrosterOn) &&
        Objects.equals(this.isRearDefrosterOn, climateState.isRearDefrosterOn) &&
        Objects.equals(this.fanStatus, climateState.fanStatus) &&
        Objects.equals(this.isClimateOn, climateState.isClimateOn) &&
        Objects.equals(this.minAvailTemp, climateState.minAvailTemp) &&
        Objects.equals(this.maxAvailTemp, climateState.maxAvailTemp) &&
        Objects.equals(this.seatHeaterLeft, climateState.seatHeaterLeft) &&
        Objects.equals(this.seatHeaterRight, climateState.seatHeaterRight) &&
        Objects.equals(this.seatHeaterRearLeft, climateState.seatHeaterRearLeft) &&
        Objects.equals(this.seatHeaterRearRight, climateState.seatHeaterRearRight) &&
        Objects.equals(this.seatHeaterRearCenter, climateState.seatHeaterRearCenter) &&
        Objects.equals(this.seatHeaterRearRightBack, climateState.seatHeaterRearRightBack) &&
        Objects.equals(this.seatHeaterRearLeftBack, climateState.seatHeaterRearLeftBack) &&
        Objects.equals(this.batteryHeater, climateState.batteryHeater) &&
        Objects.equals(this.batteryHeaterNoPower, climateState.batteryHeaterNoPower) &&
        Objects.equals(this.steeringWheelHeater, climateState.steeringWheelHeater) &&
        Objects.equals(this.wiperBladeHeater, climateState.wiperBladeHeater) &&
        Objects.equals(this.sideMirrorHeaters, climateState.sideMirrorHeaters) &&
        Objects.equals(this.isPreconditioning, climateState.isPreconditioning) &&
        Objects.equals(this.smartPreconditioning, climateState.smartPreconditioning) &&
        Objects.equals(this.isAutoConditioningOn, climateState.isAutoConditioningOn) &&
        Objects.equals(this.defrostMode, climateState.defrostMode) &&
        Objects.equals(this.timestamp, climateState.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(insideTemp, outsideTemp, driverTempSetting, passengerTempSetting, leftTempDirection, rightTempDirection, isFrontDefrosterOn, isRearDefrosterOn, fanStatus, isClimateOn, minAvailTemp, maxAvailTemp, seatHeaterLeft, seatHeaterRight, seatHeaterRearLeft, seatHeaterRearRight, seatHeaterRearCenter, seatHeaterRearRightBack, seatHeaterRearLeftBack, batteryHeater, batteryHeaterNoPower, steeringWheelHeater, wiperBladeHeater, sideMirrorHeaters, isPreconditioning, smartPreconditioning, isAutoConditioningOn, defrostMode, timestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClimateState {\n");
    
    sb.append("    insideTemp: ").append(toIndentedString(insideTemp)).append("\n");
    sb.append("    outsideTemp: ").append(toIndentedString(outsideTemp)).append("\n");
    sb.append("    driverTempSetting: ").append(toIndentedString(driverTempSetting)).append("\n");
    sb.append("    passengerTempSetting: ").append(toIndentedString(passengerTempSetting)).append("\n");
    sb.append("    leftTempDirection: ").append(toIndentedString(leftTempDirection)).append("\n");
    sb.append("    rightTempDirection: ").append(toIndentedString(rightTempDirection)).append("\n");
    sb.append("    isFrontDefrosterOn: ").append(toIndentedString(isFrontDefrosterOn)).append("\n");
    sb.append("    isRearDefrosterOn: ").append(toIndentedString(isRearDefrosterOn)).append("\n");
    sb.append("    fanStatus: ").append(toIndentedString(fanStatus)).append("\n");
    sb.append("    isClimateOn: ").append(toIndentedString(isClimateOn)).append("\n");
    sb.append("    minAvailTemp: ").append(toIndentedString(minAvailTemp)).append("\n");
    sb.append("    maxAvailTemp: ").append(toIndentedString(maxAvailTemp)).append("\n");
    sb.append("    seatHeaterLeft: ").append(toIndentedString(seatHeaterLeft)).append("\n");
    sb.append("    seatHeaterRight: ").append(toIndentedString(seatHeaterRight)).append("\n");
    sb.append("    seatHeaterRearLeft: ").append(toIndentedString(seatHeaterRearLeft)).append("\n");
    sb.append("    seatHeaterRearRight: ").append(toIndentedString(seatHeaterRearRight)).append("\n");
    sb.append("    seatHeaterRearCenter: ").append(toIndentedString(seatHeaterRearCenter)).append("\n");
    sb.append("    seatHeaterRearRightBack: ").append(toIndentedString(seatHeaterRearRightBack)).append("\n");
    sb.append("    seatHeaterRearLeftBack: ").append(toIndentedString(seatHeaterRearLeftBack)).append("\n");
    sb.append("    batteryHeater: ").append(toIndentedString(batteryHeater)).append("\n");
    sb.append("    batteryHeaterNoPower: ").append(toIndentedString(batteryHeaterNoPower)).append("\n");
    sb.append("    steeringWheelHeater: ").append(toIndentedString(steeringWheelHeater)).append("\n");
    sb.append("    wiperBladeHeater: ").append(toIndentedString(wiperBladeHeater)).append("\n");
    sb.append("    sideMirrorHeaters: ").append(toIndentedString(sideMirrorHeaters)).append("\n");
    sb.append("    isPreconditioning: ").append(toIndentedString(isPreconditioning)).append("\n");
    sb.append("    smartPreconditioning: ").append(toIndentedString(smartPreconditioning)).append("\n");
    sb.append("    isAutoConditioningOn: ").append(toIndentedString(isAutoConditioningOn)).append("\n");
    sb.append("    defrostMode: ").append(toIndentedString(defrostMode)).append("\n");
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

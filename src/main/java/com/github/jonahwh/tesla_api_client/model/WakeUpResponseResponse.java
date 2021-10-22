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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * WakeUpResponseResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-10-21T23:18:16.119-07:00")
public class WakeUpResponseResponse {
  @SerializedName("id")
  private String id = null;

  @SerializedName("user_id")
  private BigDecimal userId = null;

  @SerializedName("vehicle_id")
  private BigDecimal vehicleId = null;

  @SerializedName("vin")
  private String vin = null;

  @SerializedName("display_name")
  private String displayName = null;

  @SerializedName("option_codes")
  private String optionCodes = null;

  @SerializedName("color")
  private String color = null;

  @SerializedName("tokens")
  private List<String> tokens = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("in_service")
  private Boolean inService = null;

  @SerializedName("id_s")
  private String idS = null;

  @SerializedName("calendar_enabled")
  private Boolean calendarEnabled = null;

  @SerializedName("api_version")
  private String apiVersion = null;

  @SerializedName("backseat_token")
  private String backseatToken = null;

  @SerializedName("backseat_token_updated_at")
  private BigDecimal backseatTokenUpdatedAt = null;

  public WakeUpResponseResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public WakeUpResponseResponse userId(BigDecimal userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getUserId() {
    return userId;
  }

  public void setUserId(BigDecimal userId) {
    this.userId = userId;
  }

  public WakeUpResponseResponse vehicleId(BigDecimal vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

   /**
   * Get vehicleId
   * @return vehicleId
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(BigDecimal vehicleId) {
    this.vehicleId = vehicleId;
  }

  public WakeUpResponseResponse vin(String vin) {
    this.vin = vin;
    return this;
  }

   /**
   * Get vin
   * @return vin
  **/
  @ApiModelProperty(value = "")
  public String getVin() {
    return vin;
  }

  public void setVin(String vin) {
    this.vin = vin;
  }

  public WakeUpResponseResponse displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(value = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public WakeUpResponseResponse optionCodes(String optionCodes) {
    this.optionCodes = optionCodes;
    return this;
  }

   /**
   * Get optionCodes
   * @return optionCodes
  **/
  @ApiModelProperty(value = "")
  public String getOptionCodes() {
    return optionCodes;
  }

  public void setOptionCodes(String optionCodes) {
    this.optionCodes = optionCodes;
  }

  public WakeUpResponseResponse color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @ApiModelProperty(value = "")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public WakeUpResponseResponse tokens(List<String> tokens) {
    this.tokens = tokens;
    return this;
  }

  public WakeUpResponseResponse addTokensItem(String tokensItem) {
    if (this.tokens == null) {
      this.tokens = new ArrayList<String>();
    }
    this.tokens.add(tokensItem);
    return this;
  }

   /**
   * Get tokens
   * @return tokens
  **/
  @ApiModelProperty(value = "")
  public List<String> getTokens() {
    return tokens;
  }

  public void setTokens(List<String> tokens) {
    this.tokens = tokens;
  }

  public WakeUpResponseResponse state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public WakeUpResponseResponse inService(Boolean inService) {
    this.inService = inService;
    return this;
  }

   /**
   * Get inService
   * @return inService
  **/
  @ApiModelProperty(value = "")
  public Boolean isInService() {
    return inService;
  }

  public void setInService(Boolean inService) {
    this.inService = inService;
  }

  public WakeUpResponseResponse idS(String idS) {
    this.idS = idS;
    return this;
  }

   /**
   * Get idS
   * @return idS
  **/
  @ApiModelProperty(value = "")
  public String getIdS() {
    return idS;
  }

  public void setIdS(String idS) {
    this.idS = idS;
  }

  public WakeUpResponseResponse calendarEnabled(Boolean calendarEnabled) {
    this.calendarEnabled = calendarEnabled;
    return this;
  }

   /**
   * Get calendarEnabled
   * @return calendarEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isCalendarEnabled() {
    return calendarEnabled;
  }

  public void setCalendarEnabled(Boolean calendarEnabled) {
    this.calendarEnabled = calendarEnabled;
  }

  public WakeUpResponseResponse apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * Get apiVersion
   * @return apiVersion
  **/
  @ApiModelProperty(value = "")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public WakeUpResponseResponse backseatToken(String backseatToken) {
    this.backseatToken = backseatToken;
    return this;
  }

   /**
   * Get backseatToken
   * @return backseatToken
  **/
  @ApiModelProperty(value = "")
  public String getBackseatToken() {
    return backseatToken;
  }

  public void setBackseatToken(String backseatToken) {
    this.backseatToken = backseatToken;
  }

  public WakeUpResponseResponse backseatTokenUpdatedAt(BigDecimal backseatTokenUpdatedAt) {
    this.backseatTokenUpdatedAt = backseatTokenUpdatedAt;
    return this;
  }

   /**
   * Get backseatTokenUpdatedAt
   * @return backseatTokenUpdatedAt
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getBackseatTokenUpdatedAt() {
    return backseatTokenUpdatedAt;
  }

  public void setBackseatTokenUpdatedAt(BigDecimal backseatTokenUpdatedAt) {
    this.backseatTokenUpdatedAt = backseatTokenUpdatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WakeUpResponseResponse wakeUpResponseResponse = (WakeUpResponseResponse) o;
    return Objects.equals(this.id, wakeUpResponseResponse.id) &&
        Objects.equals(this.userId, wakeUpResponseResponse.userId) &&
        Objects.equals(this.vehicleId, wakeUpResponseResponse.vehicleId) &&
        Objects.equals(this.vin, wakeUpResponseResponse.vin) &&
        Objects.equals(this.displayName, wakeUpResponseResponse.displayName) &&
        Objects.equals(this.optionCodes, wakeUpResponseResponse.optionCodes) &&
        Objects.equals(this.color, wakeUpResponseResponse.color) &&
        Objects.equals(this.tokens, wakeUpResponseResponse.tokens) &&
        Objects.equals(this.state, wakeUpResponseResponse.state) &&
        Objects.equals(this.inService, wakeUpResponseResponse.inService) &&
        Objects.equals(this.idS, wakeUpResponseResponse.idS) &&
        Objects.equals(this.calendarEnabled, wakeUpResponseResponse.calendarEnabled) &&
        Objects.equals(this.apiVersion, wakeUpResponseResponse.apiVersion) &&
        Objects.equals(this.backseatToken, wakeUpResponseResponse.backseatToken) &&
        Objects.equals(this.backseatTokenUpdatedAt, wakeUpResponseResponse.backseatTokenUpdatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, vehicleId, vin, displayName, optionCodes, color, tokens, state, inService, idS, calendarEnabled, apiVersion, backseatToken, backseatTokenUpdatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WakeUpResponseResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
    sb.append("    vin: ").append(toIndentedString(vin)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    optionCodes: ").append(toIndentedString(optionCodes)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    inService: ").append(toIndentedString(inService)).append("\n");
    sb.append("    idS: ").append(toIndentedString(idS)).append("\n");
    sb.append("    calendarEnabled: ").append(toIndentedString(calendarEnabled)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    backseatToken: ").append(toIndentedString(backseatToken)).append("\n");
    sb.append("    backseatTokenUpdatedAt: ").append(toIndentedString(backseatTokenUpdatedAt)).append("\n");
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


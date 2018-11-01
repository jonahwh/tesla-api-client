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
 * NavigationRequestRequestValue
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-01T15:39:52.863-07:00")
public class NavigationRequestRequestValue {
  @SerializedName("android.intent.extra.TEXT")
  private String androidIntentExtraTEXT = null;

  public NavigationRequestRequestValue androidIntentExtraTEXT(String androidIntentExtraTEXT) {
    this.androidIntentExtraTEXT = androidIntentExtraTEXT;
    return this;
  }

   /**
   * Must match this syntax \&quot;DATA_TO_SEND_TO_NAV_SYSTEM\\n\\nhttps://goo.gl/maps/X\&quot;
   * @return androidIntentExtraTEXT
  **/
  @ApiModelProperty(example = "45500 Fremont Blvd, Fremont, CA 94538  https://goo.gl/maps/X", value = "Must match this syntax \"DATA_TO_SEND_TO_NAV_SYSTEM\\n\\nhttps://goo.gl/maps/X\"")
  public String getAndroidIntentExtraTEXT() {
    return androidIntentExtraTEXT;
  }

  public void setAndroidIntentExtraTEXT(String androidIntentExtraTEXT) {
    this.androidIntentExtraTEXT = androidIntentExtraTEXT;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NavigationRequestRequestValue navigationRequestRequestValue = (NavigationRequestRequestValue) o;
    return Objects.equals(this.androidIntentExtraTEXT, navigationRequestRequestValue.androidIntentExtraTEXT);
  }

  @Override
  public int hashCode() {
    return Objects.hash(androidIntentExtraTEXT);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NavigationRequestRequestValue {\n");
    
    sb.append("    androidIntentExtraTEXT: ").append(toIndentedString(androidIntentExtraTEXT)).append("\n");
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

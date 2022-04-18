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
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets State
 */
@JsonAdapter(State.Adapter.class)
public enum State {
  OPEN("open"),
  CLOSE("close"),
  COMFORT("comfort"),
  VENT("vent"),
  MOVE("move");

  private String value;

  State(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static State fromValue(String input) {
    for (State b : State.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<State> {
    @Override
    public void write(final JsonWriter jsonWriter, final State enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public State read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return State.fromValue((String)(value));
    }
  }
}

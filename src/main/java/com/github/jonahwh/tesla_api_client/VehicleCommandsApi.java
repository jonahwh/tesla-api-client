package com.github.jonahwh.tesla_api_client;

import com.github.jonahwh.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import com.github.jonahwh.tesla_api_client.model.FlashLightsResponse;
import com.github.jonahwh.tesla_api_client.model.HonkHornResponse;
import com.github.jonahwh.tesla_api_client.model.LockDoorsResponse;
import com.github.jonahwh.tesla_api_client.model.MovePanoRoofRequest;
import com.github.jonahwh.tesla_api_client.model.MovePanoRoofResponse;
import com.github.jonahwh.tesla_api_client.model.OpenChargePortResponse;
import com.github.jonahwh.tesla_api_client.model.OpenTrunkRequest;
import com.github.jonahwh.tesla_api_client.model.OpenTrunkResponse;
import com.github.jonahwh.tesla_api_client.model.RemoteStartRequest;
import com.github.jonahwh.tesla_api_client.model.RemoteStartResponse;
import com.github.jonahwh.tesla_api_client.model.ResetValetPinResponse;
import com.github.jonahwh.tesla_api_client.model.SetChargeLimitRequest;
import com.github.jonahwh.tesla_api_client.model.SetChargeLimitResponse;
import com.github.jonahwh.tesla_api_client.model.SetChargeLimitToMaxRangeResponse;
import com.github.jonahwh.tesla_api_client.model.SetChargeLimitToStandardResponse;
import com.github.jonahwh.tesla_api_client.model.SetTemperatureResponse;
import com.github.jonahwh.tesla_api_client.model.SetTempsRequest;
import com.github.jonahwh.tesla_api_client.model.SetValetModeResponse;
import com.github.jonahwh.tesla_api_client.model.SetValetRequest;
import com.github.jonahwh.tesla_api_client.model.StartChargingResponse;
import com.github.jonahwh.tesla_api_client.model.StartHvacSystemResponse;
import com.github.jonahwh.tesla_api_client.model.StopChargingResponse;
import com.github.jonahwh.tesla_api_client.model.StopHvacSystemResponse;
import com.github.jonahwh.tesla_api_client.model.UnlockDoorsResponse;
import com.github.jonahwh.tesla_api_client.model.WakeUpCarResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface VehicleCommandsApi {
  /**
   * Flash Lights
   * Flash the lights once.
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;FlashLightsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/flash_lights")
  Call<FlashLightsResponse> flashLights(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Honk Horn
   * Honk the horn once.
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;HonkHornResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/honk_horn")
  Call<HonkHornResponse> honkHorn(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Lock Doors
   * Lock the car&#39;s doors.
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;LockDoorsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/door_lock")
  Call<LockDoorsResponse> lockDoors(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Move Pano Roof
   * Controls the car&#39;s panoramic roof, if installed.
   * @param vehicleId The id of the Vehicle. (required)
   * @param body  (required)
   * @return Call&lt;MovePanoRoofResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/sun_roof_control")
  Call<MovePanoRoofResponse> openSunroof(
    @retrofit2.http.Path("vehicle_id") String vehicleId, @retrofit2.http.Body MovePanoRoofRequest body
  );

  /**
   * Open Trunk/Frunk
   * Open the trunk or frunk. Currently inoperable.
   * @param vehicleId The id of the Vehicle. (required)
   * @param body  (required)
   * @return Call&lt;OpenTrunkResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/trunk_open")
  Call<OpenTrunkResponse> openTrunk(
    @retrofit2.http.Path("vehicle_id") String vehicleId, @retrofit2.http.Body OpenTrunkRequest body
  );

  /**
   * Remote Start
   * Start the car for keyless driving. Must start driving within 2 minutes of issuing this request.
   * @param vehicleId The id of the Vehicle. (required)
   * @param body  (required)
   * @return Call&lt;RemoteStartResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/remote_start_drive")
  Call<RemoteStartResponse> remoteStart(
    @retrofit2.http.Path("vehicle_id") String vehicleId, @retrofit2.http.Body RemoteStartRequest body
  );

  /**
   * Reset Valet PIN
   * Resets the PIN set for valet mode, if set.
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;ResetValetPinResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/reset_valet_pin")
  Call<ResetValetPinResponse> resetValetPin(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Set Charge Limit to Standard
   * Set the charge mode to standard (90% under the new percentage system introduced in 4.5).
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;SetChargeLimitToStandardResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/charge_standard")
  Call<SetChargeLimitToStandardResponse> sendStandardChargeLimit(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Set Charge Limit
   * Set the charge limit to a custom percentage.
   * @param vehicleId The id of the Vehicle. (required)
   * @param body  (required)
   * @return Call&lt;SetChargeLimitResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/set_charge_limit")
  Call<SetChargeLimitResponse> setChargeLimit(
    @retrofit2.http.Path("vehicle_id") String vehicleId, @retrofit2.http.Body SetChargeLimitRequest body
  );

  /**
   * Set Charge Limit to Max Range
   * Set the charge mode to max range (100% under the new percentage system introduced in 4.5). Use sparingly!
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;SetChargeLimitToMaxRangeResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/charge_max_range")
  Call<SetChargeLimitToMaxRangeResponse> setMaxChargeLimit(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Set Temperature
   * Set the temperature target for the HVAC system.
   * @param vehicleId The id of the Vehicle. (required)
   * @param body  (required)
   * @return Call&lt;SetTemperatureResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/set_temps")
  Call<SetTemperatureResponse> setTemperatures(
    @retrofit2.http.Path("vehicle_id") String vehicleId, @retrofit2.http.Body SetTempsRequest body
  );

  /**
   * Start Charging
   * Start charging. Must be plugged in, have power available, and not have reached your charge limit.
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;StartChargingResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/charge_start")
  Call<StartChargingResponse> startCharge(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Start HVAC System
   * Start the climate control system. Will cool or heat automatically, depending on set temperature.
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;StartHvacSystemResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/auto_conditioning_start")
  Call<StartHvacSystemResponse> startHVAC(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Stop Charging
   * Stop charging. Must already be charging.
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;StopChargingResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/charge_stop")
  Call<StopChargingResponse> stopCharge(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Stop HVAC System
   * Stop the climate control system.
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;StopHvacSystemResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/auto_conditioning_stop")
  Call<StopHvacSystemResponse> stopHVAC(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Open Charge Port
   * Opens the charge port. Does not close the charge port (for now...). This endpoint also unlocks the charge port if it&#39;s locked.
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;OpenChargePortResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/charge_port_door_open")
  Call<OpenChargePortResponse> toggleChargePort(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Set Valet Mode
   * Sets valet mode on or off with a PIN to disable it from within the car. Reuses last PIN from previous valet session. Valet Mode limits the car&#39;s top speed to 70MPH and 80kW of acceleration power. It also disables Homelink, Bluetooth and Wifi settings, and the ability to disable mobile access to the car. It also hides your favorites, home, and work locations in navigation.
   * @param vehicleId The id of the Vehicle. (required)
   * @param body  (required)
   * @return Call&lt;SetValetModeResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/set_valet_mode")
  Call<SetValetModeResponse> toggleValetMode(
    @retrofit2.http.Path("vehicle_id") String vehicleId, @retrofit2.http.Body SetValetRequest body
  );

  /**
   * Unlock Doors
   * Unlock the car&#39;s doors.
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;UnlockDoorsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/door_unlock")
  Call<UnlockDoorsResponse> unlockDoors(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Wake Up Car
   * Wakes up the car from the sleep state. Necessary to get some data from the car.
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;WakeUpCarResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/wake_up")
  Call<WakeUpCarResponse> wakeUpVehicle(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

}

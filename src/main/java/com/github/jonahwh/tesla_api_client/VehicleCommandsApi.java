package com.github.jonahwh.tesla_api_client;

import com.github.jonahwh.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.github.jonahwh.tesla_api_client.model.CommandResponse;
import com.github.jonahwh.tesla_api_client.model.MaxDefrostRequest;
import com.github.jonahwh.tesla_api_client.model.MovePanoRoofRequest;
import com.github.jonahwh.tesla_api_client.model.NavigationRequestRequest;
import com.github.jonahwh.tesla_api_client.model.OpenTrunkRequest;
import com.github.jonahwh.tesla_api_client.model.RemoteSeatHeaterRequest;
import com.github.jonahwh.tesla_api_client.model.RemoteStartRequest;
import com.github.jonahwh.tesla_api_client.model.RemoteSteeringWheelHeaterRequest;
import com.github.jonahwh.tesla_api_client.model.SentryModeRequest;
import com.github.jonahwh.tesla_api_client.model.SetChargeLimitRequest;
import com.github.jonahwh.tesla_api_client.model.SetSpeedLimitRequest;
import com.github.jonahwh.tesla_api_client.model.SetTempsRequest;
import com.github.jonahwh.tesla_api_client.model.SetValetRequest;
import com.github.jonahwh.tesla_api_client.model.ShareRequest;
import com.github.jonahwh.tesla_api_client.model.SpeedLimitRequest;
import com.github.jonahwh.tesla_api_client.model.TriggerHomelinkRequest;
import com.github.jonahwh.tesla_api_client.model.WakeUpResponse;
import com.github.jonahwh.tesla_api_client.model.WindowControlRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface VehicleCommandsApi {
  /**
   * Activate Speed Limit
   * Activates Speed Limit
   * @param vehicleId The id of the Vehicle. (required)
   * @param body  (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/speed_limit_activate")
  Call<CommandResponse> activateSpeedLimit(
    @retrofit2.http.Path("vehicle_id") String vehicleId, @retrofit2.http.Body SpeedLimitRequest body
  );

  /**
   * Cancel Software Update
   * Cancel Software Update
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/cancel_software_update")
  Call<CommandResponse> cancelSoftwareUpdate(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Clear Speed Limit Pin
   * Clears Speed Limit Pin
   * @param vehicleId The id of the Vehicle. (required)
   * @param body  (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/speed_limit_clear_pin")
  Call<CommandResponse> clearSpeedLimitPin(
    @retrofit2.http.Path("vehicle_id") String vehicleId, @retrofit2.http.Body SpeedLimitRequest body
  );

  /**
   * Close Charge Port
   * Closes the charge port.
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/charge_port_door_close")
  Call<CommandResponse> closeChargePort(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Deactivate Speed Limit
   * Deactivates Speed Limit
   * @param vehicleId The id of the Vehicle. (required)
   * @param body  (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/speed_limit_deactivate")
  Call<CommandResponse> deactivateSpeedLimit(
    @retrofit2.http.Path("vehicle_id") String vehicleId, @retrofit2.http.Body SpeedLimitRequest body
  );

  /**
   * Flash Lights
   * Flash the lights once.
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/flash_lights")
  Call<CommandResponse> flashLights(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Honk Horn
   * Honk the horn once.
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/honk_horn")
  Call<CommandResponse> honkHorn(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Lock Doors
   * Lock the car&#39;s doors.
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/door_lock")
  Call<CommandResponse> lockDoors(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Send Navigation Request
   * Sends Navigation Request to Vehicle
   * @param vehicleId The id of the Vehicle. (required)
   * @param body  (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/navigation_request")
  Call<CommandResponse> navigationRequest(
    @retrofit2.http.Path("vehicle_id") String vehicleId, @retrofit2.http.Body NavigationRequestRequest body
  );

  /**
   * Open Charge Port
   * Opens the charge port. Does not close the charge port (for now...). This endpoint also unlocks the charge port if it&#39;s locked.
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/charge_port_door_open")
  Call<CommandResponse> openChargePort(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Move Pano Roof
   * Controls the car&#39;s panoramic roof, if installed.
   * @param vehicleId The id of the Vehicle. (required)
   * @param body  (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/sun_roof_control")
  Call<CommandResponse> openSunroof(
    @retrofit2.http.Path("vehicle_id") String vehicleId, @retrofit2.http.Body MovePanoRoofRequest body
  );

  /**
   * Open Trunk/Frunk
   * Open the trunk or frunk. Currently inoperable.
   * @param vehicleId The id of the Vehicle. (required)
   * @param body  (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/actuate_trunk")
  Call<CommandResponse> openTrunk(
    @retrofit2.http.Path("vehicle_id") String vehicleId, @retrofit2.http.Body OpenTrunkRequest body
  );

  /**
   * Set Seat Heater Level
   * Set the heating level of a seat heater
   * @param vehicleId The id of the Vehicle. (required)
   * @param body  (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/remote_seat_heater_request")
  Call<CommandResponse> remoteSeatHeaterRequest(
    @retrofit2.http.Path("vehicle_id") String vehicleId, @retrofit2.http.Body RemoteSeatHeaterRequest body
  );

  /**
   * Remote Start
   * Start the car for keyless driving. Must start driving within 2 minutes of issuing this request.
   * @param vehicleId The id of the Vehicle. (required)
   * @param body  (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/remote_start_drive")
  Call<CommandResponse> remoteStart(
    @retrofit2.http.Path("vehicle_id") String vehicleId, @retrofit2.http.Body RemoteStartRequest body
  );

  /**
   * Toggle Steering Wheel Heater
   * Toggle the steering wheel heater
   * @param vehicleId The id of the Vehicle. (required)
   * @param body  (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/remote_steering_wheel_heater_request")
  Call<CommandResponse> remoteSteeringWheelHeaterRequest(
    @retrofit2.http.Path("vehicle_id") String vehicleId, @retrofit2.http.Body RemoteSteeringWheelHeaterRequest body
  );

  /**
   * Reset Valet PIN
   * Resets the PIN set for valet mode, if set.
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/reset_valet_pin")
  Call<CommandResponse> resetValetPin(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Set Charge Limit to Standard
   * Set the charge mode to standard (90% under the new percentage system introduced in 4.5).
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/charge_standard")
  Call<CommandResponse> sendStandardChargeLimit(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Set Charge Limit
   * Set the charge limit to a custom percentage.
   * @param vehicleId The id of the Vehicle. (required)
   * @param body  (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/set_charge_limit")
  Call<CommandResponse> setChargeLimit(
    @retrofit2.http.Path("vehicle_id") String vehicleId, @retrofit2.http.Body SetChargeLimitRequest body
  );

  /**
   * Set Charge Limit to Max Range
   * Set the charge mode to max range (100% under the new percentage system introduced in 4.5). Use sparingly!
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/charge_max_range")
  Call<CommandResponse> setMaxChargeLimit(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Set Max Defrost
   * Set Max Defrost
   * @param vehicleId The id of the Vehicle. (required)
   * @param body  (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/set_preconditioning_max")
  Call<CommandResponse> setMaxDefrost(
    @retrofit2.http.Path("vehicle_id") String vehicleId, @retrofit2.http.Body MaxDefrostRequest body
  );

  /**
   * Toggle Sentry Mode
   * Toggle Sentry Mode
   * @param vehicleId The id of the Vehicle. (required)
   * @param body  (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/set_sentry_mode")
  Call<CommandResponse> setSentryMode(
    @retrofit2.http.Path("vehicle_id") String vehicleId, @retrofit2.http.Body SentryModeRequest body
  );

  /**
   * Set Speed Limit
   * Sets Speed Limit
   * @param vehicleId The id of the Vehicle. (required)
   * @param body  (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/speed_limit_set_limit")
  Call<CommandResponse> setSpeedLimit(
    @retrofit2.http.Path("vehicle_id") String vehicleId, @retrofit2.http.Body SetSpeedLimitRequest body
  );

  /**
   * Set Temperature
   * Set the temperature target for the HVAC system.
   * @param vehicleId The id of the Vehicle. (required)
   * @param body  (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/set_temps")
  Call<CommandResponse> setTemperatures(
    @retrofit2.http.Path("vehicle_id") String vehicleId, @retrofit2.http.Body SetTempsRequest body
  );

  /**
   * Share data to Vehicle
   * Sends Data to Vehicle (v10 only)
   * @param vehicleId The id of the Vehicle. (required)
   * @param body  (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/share")
  Call<CommandResponse> sharetoVehicle(
    @retrofit2.http.Path("vehicle_id") String vehicleId, @retrofit2.http.Body ShareRequest body
  );

  /**
   * Start Charging
   * Start charging. Must be plugged in, have power available, and not have reached your charge limit.
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/charge_start")
  Call<CommandResponse> startCharge(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Start HVAC System
   * Start the climate control system. Will cool or heat automatically, depending on set temperature.
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/auto_conditioning_start")
  Call<CommandResponse> startHVAC(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Start Software Update
   * Start Software Update
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/schedule_software_update")
  Call<CommandResponse> startSoftwareUpdate(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Stop Charging
   * Stop charging. Must already be charging.
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/charge_stop")
  Call<CommandResponse> stopCharge(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Stop HVAC System
   * Stop the climate control system.
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/auto_conditioning_stop")
  Call<CommandResponse> stopHVAC(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Set Valet Mode
   * Sets valet mode on or off with a PIN to disable it from within the car. Reuses last PIN from previous valet session. Valet Mode limits the car&#39;s top speed to 70MPH and 80kW of acceleration power. It also disables Homelink, Bluetooth and Wifi settings, and the ability to disable mobile access to the car. It also hides your favorites, home, and work locations in navigation.
   * @param vehicleId The id of the Vehicle. (required)
   * @param body  (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/set_valet_mode")
  Call<CommandResponse> toggleValetMode(
    @retrofit2.http.Path("vehicle_id") String vehicleId, @retrofit2.http.Body SetValetRequest body
  );

  /**
   * Trigger Homelink
   * Trigger Homelink
   * @param vehicleId The id of the Vehicle. (required)
   * @param body  (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/trigger_homelink")
  Call<CommandResponse> triggerHomelink(
    @retrofit2.http.Path("vehicle_id") String vehicleId, @retrofit2.http.Body TriggerHomelinkRequest body
  );

  /**
   * Unlock Doors
   * Unlock the car&#39;s doors.
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/door_unlock")
  Call<CommandResponse> unlockDoors(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Wake Up Car
   * Wakes up the car from the sleep state. Necessary to get some data from the car.
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;WakeUpResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/wake_up")
  Call<WakeUpResponse> wakeUpVehicle(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Wake Up Car
   * Wakes up the car from the sleep state. Necessary to get some data from the car.
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/wake_up")
  Call<CommandResponse> wakeUpVehicleCommand(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Window Control
   * Window Control
   * @param vehicleId The id of the Vehicle. (required)
   * @param body  (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/window_control")
  Call<CommandResponse> windowControl(
    @retrofit2.http.Path("vehicle_id") String vehicleId, @retrofit2.http.Body WindowControlRequest body
  );

}

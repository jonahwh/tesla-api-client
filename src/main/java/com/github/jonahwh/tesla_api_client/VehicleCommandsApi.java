package com.github.jonahwh.tesla_api_client;

import com.github.jonahwh.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import com.github.jonahwh.tesla_api_client.model.CommandResponse;
import com.github.jonahwh.tesla_api_client.model.MaxDefrostRequest;
import com.github.jonahwh.tesla_api_client.model.MovePanoRoofRequest;
import com.github.jonahwh.tesla_api_client.model.NavigationRequestRequest;
import com.github.jonahwh.tesla_api_client.model.OpenTrunkRequest;
import com.github.jonahwh.tesla_api_client.model.RemoteAutoSeatClimateRequest;
import com.github.jonahwh.tesla_api_client.model.RemoteSeatCoolerRequest;
import com.github.jonahwh.tesla_api_client.model.RemoteSeatHeaterRequest;
import com.github.jonahwh.tesla_api_client.model.RemoteStartRequest;
import com.github.jonahwh.tesla_api_client.model.RemoteSteeringWheelHeaterRequest;
import com.github.jonahwh.tesla_api_client.model.ScheduledChargingRequest;
import com.github.jonahwh.tesla_api_client.model.ScheduledDepartureRequest;
import com.github.jonahwh.tesla_api_client.model.SentryModeRequest;
import com.github.jonahwh.tesla_api_client.model.SetBioweaponModeRequest;
import com.github.jonahwh.tesla_api_client.model.SetCabinOverheatProtectionRequest;
import com.github.jonahwh.tesla_api_client.model.SetChargeLimitRequest;
import com.github.jonahwh.tesla_api_client.model.SetChargingAmpsRequest;
import com.github.jonahwh.tesla_api_client.model.SetClimateKeeperRequest;
import com.github.jonahwh.tesla_api_client.model.SetSpeedLimitRequest;
import com.github.jonahwh.tesla_api_client.model.SetTempsRequest;
import com.github.jonahwh.tesla_api_client.model.SetValetRequest;
import com.github.jonahwh.tesla_api_client.model.SetVehicleNameRequest;
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
   * @param body  (required)
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/speed_limit_activate")
  Call<CommandResponse> activateSpeedLimit(
    @retrofit2.http.Body SpeedLimitRequest body, @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Toggle Bioweapon Defense Mode
   * Enable or Disable Bioweapon Defense Mode on equipped vehicles.
   * @param body  (required)
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/set_bioweapon_mode")
  Call<CommandResponse> bioweaponDefense(
    @retrofit2.http.Body SetBioweaponModeRequest body, @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Enable or Disable Cabin Overheat Protection
   * Enable or Disable Cabin Overheat Protection
   * @param body  (required)
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/set_cabin_overheat_protection")
  Call<CommandResponse> cabinOverheatProtection(
    @retrofit2.http.Body SetCabinOverheatProtectionRequest body, @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Cancel Software Update
   * Cancel Software Update
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @POST("api/1/vehicles/{vehicle_id}/command/cancel_software_update")
  Call<CommandResponse> cancelSoftwareUpdate(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Clear Speed Limit Pin
   * Clears Speed Limit Pin
   * @param body  (required)
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/speed_limit_clear_pin")
  Call<CommandResponse> clearSpeedLimitPin(
    @retrofit2.http.Body SpeedLimitRequest body, @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Set the Climate Keeper mode
   * Set the Climate Keeper mode.
   * @param body  (required)
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/set_climate_keeper_mode")
  Call<CommandResponse> climateKeeper(
    @retrofit2.http.Body SetClimateKeeperRequest body, @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Close Charge Port
   * Closes the charge port.
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @POST("api/1/vehicles/{vehicle_id}/command/charge_port_door_close")
  Call<CommandResponse> closeChargePort(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Deactivate Speed Limit
   * Deactivates Speed Limit
   * @param body  (required)
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/speed_limit_deactivate")
  Call<CommandResponse> deactivateSpeedLimit(
    @retrofit2.http.Body SpeedLimitRequest body, @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Flash Lights
   * Flash the lights once.
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
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
  @POST("api/1/vehicles/{vehicle_id}/command/honk_horn")
  Call<CommandResponse> honkHorn(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Lock Doors
   * Lock the car&#x27;s doors.
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @POST("api/1/vehicles/{vehicle_id}/command/door_lock")
  Call<CommandResponse> lockDoors(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Send Navigation Request
   * Sends Navigation Request to Vehicle
   * @param body  (required)
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/navigation_request")
  Call<CommandResponse> navigationRequest(
    @retrofit2.http.Body NavigationRequestRequest body, @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Open Charge Port
   * Opens and unlocks the charge port.
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @POST("api/1/vehicles/{vehicle_id}/command/charge_port_door_open")
  Call<CommandResponse> openChargePort(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Move Pano Roof
   * Controls the car&#x27;s panoramic roof, if installed.
   * @param body  (required)
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/sun_roof_control")
  Call<CommandResponse> openSunroof(
    @retrofit2.http.Body MovePanoRoofRequest body, @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Open Trunk/Frunk
   * Open the trunk or frunk. Currently inoperable.
   * @param body  (required)
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/actuate_trunk")
  Call<CommandResponse> openTrunk(
    @retrofit2.http.Body OpenTrunkRequest body, @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Toggle Automatic Seat Heater/Cooler
   * Enables or disables automatic control of a seat heater/coooler
   * @param body  (required)
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/remote_auto_seat_climate_request")
  Call<CommandResponse> remoteAutoSeatClimateRequest(
    @retrofit2.http.Body RemoteAutoSeatClimateRequest body, @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Remote Boombox
   * Remote Boombox
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @POST("api/1/vehicles/{vehicle_id}/command/remote_boombox")
  Call<CommandResponse> remoteBoombox(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Set Seat Cooler Level
   * Set the cooling level of a seat heater
   * @param body  (required)
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/remote_seat_cooler_request")
  Call<CommandResponse> remoteSeatCoolerRequest(
    @retrofit2.http.Body RemoteSeatCoolerRequest body, @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Set Seat Heater Level
   * Set the heating level of a seat heater
   * @param body  (required)
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/remote_seat_heater_request")
  Call<CommandResponse> remoteSeatHeaterRequest(
    @retrofit2.http.Body RemoteSeatHeaterRequest body, @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Remote Start
   * Start the car for keyless driving. Must start driving within 2 minutes of issuing this request.
   * @param body  (required)
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/remote_start_drive")
  Call<CommandResponse> remoteStart(
    @retrofit2.http.Body RemoteStartRequest body, @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Toggle Steering Wheel Heater
   * Toggle the steering wheel heater
   * @param body  (required)
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/remote_steering_wheel_heater_request")
  Call<CommandResponse> remoteSteeringWheelHeaterRequest(
    @retrofit2.http.Body RemoteSteeringWheelHeaterRequest body, @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Reset Valet PIN
   * Resets the PIN set for valet mode, if set.
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
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
  @POST("api/1/vehicles/{vehicle_id}/command/charge_standard")
  Call<CommandResponse> sendStandardChargeLimit(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Set Charge Limit
   * Set the charge limit to a custom percentage.
   * @param body  (required)
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/set_charge_limit")
  Call<CommandResponse> setChargeLimit(
    @retrofit2.http.Body SetChargeLimitRequest body, @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Set Charge Current
   * Set the maximum Charge Current in Amps
   * @param body  (required)
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/set_charging_amps")
  Call<CommandResponse> setChargingAmps(
    @retrofit2.http.Body SetChargingAmpsRequest body, @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Set Charge Limit to Max Range
   * Set the charge mode to max range (100% under the new percentage system introduced in 4.5). Use sparingly!
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @POST("api/1/vehicles/{vehicle_id}/command/charge_max_range")
  Call<CommandResponse> setMaxChargeLimit(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Set Max Defrost
   * Set Max Defrost
   * @param body  (required)
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/set_preconditioning_max")
  Call<CommandResponse> setMaxDefrost(
    @retrofit2.http.Body MaxDefrostRequest body, @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Set Scheduled Charging
   * Set Scheduled Charging settings
   * @param body  (required)
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/set_scheduled_charging")
  Call<CommandResponse> setScheduledCharging(
    @retrofit2.http.Body ScheduledChargingRequest body, @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Set Scheduled Departure
   * Set Scheduled Departure settings
   * @param body  (required)
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/set_scheduled_departure")
  Call<CommandResponse> setScheduledDeparture(
    @retrofit2.http.Body ScheduledDepartureRequest body, @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Toggle Sentry Mode
   * Toggle Sentry Mode
   * @param body  (required)
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/set_sentry_mode")
  Call<CommandResponse> setSentryMode(
    @retrofit2.http.Body SentryModeRequest body, @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Set Speed Limit
   * Sets Speed Limit
   * @param body  (required)
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/speed_limit_set_limit")
  Call<CommandResponse> setSpeedLimit(
    @retrofit2.http.Body SetSpeedLimitRequest body, @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Set Temperature
   * Set the temperature target for the HVAC system.
   * @param body  (required)
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/set_temps")
  Call<CommandResponse> setTemperatures(
    @retrofit2.http.Body SetTempsRequest body, @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Set Vehicle Name
   * Set Vehicle Name
   * @param body  (required)
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/set_vehicle_name")
  Call<CommandResponse> setVehicleName(
    @retrofit2.http.Body SetVehicleNameRequest body, @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Share data to Vehicle
   * Sends Data to Vehicle (v10 only)
   * @param body  (required)
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/share")
  Call<CommandResponse> sharetoVehicle(
    @retrofit2.http.Body ShareRequest body, @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Start Charging
   * Start charging. Must be plugged in, have power available, and not have reached your charge limit.
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
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
  @POST("api/1/vehicles/{vehicle_id}/command/auto_conditioning_stop")
  Call<CommandResponse> stopHVAC(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Set Valet Mode
   * Sets valet mode on or off with a PIN to disable it from within the car. Reuses last PIN from previous valet session. Valet Mode limits the car&#x27;s top speed to 70MPH and 80kW of acceleration power. It also disables Homelink, Bluetooth and Wifi settings, and the ability to disable mobile access to the car. It also hides your favorites, home, and work locations in navigation.
   * @param body  (required)
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/set_valet_mode")
  Call<CommandResponse> toggleValetMode(
    @retrofit2.http.Body SetValetRequest body, @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Trigger Homelink
   * Trigger Homelink
   * @param body  (required)
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/trigger_homelink")
  Call<CommandResponse> triggerHomelink(
    @retrofit2.http.Body TriggerHomelinkRequest body, @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Unlock Doors
   * Unlock the car&#x27;s doors.
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
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
  @POST("api/1/vehicles/{vehicle_id}/command/wake_up")
  Call<CommandResponse> wakeUpVehicleCommand(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Window Control
   * Window Control
   * @param body  (required)
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/window_control")
  Call<CommandResponse> windowControl(
    @retrofit2.http.Body WindowControlRequest body, @retrofit2.http.Path("vehicle_id") String vehicleId
  );

}

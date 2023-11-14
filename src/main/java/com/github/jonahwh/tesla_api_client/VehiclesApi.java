package com.github.jonahwh.tesla_api_client;

import com.github.jonahwh.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import com.github.jonahwh.tesla_api_client.model.ChargeStateResponse;
import com.github.jonahwh.tesla_api_client.model.ClimateSettingsResponse;
import com.github.jonahwh.tesla_api_client.model.DriveStateResponse;
import com.github.jonahwh.tesla_api_client.model.GetVehiclesResponse;
import com.github.jonahwh.tesla_api_client.model.GuistateResponse;
import com.github.jonahwh.tesla_api_client.model.MobileAccessResponse;
import com.github.jonahwh.tesla_api_client.model.NearbyChargerResponse;
import com.github.jonahwh.tesla_api_client.model.VehicleConfigResponse;
import com.github.jonahwh.tesla_api_client.model.VehicleDataResponse;
import com.github.jonahwh.tesla_api_client.model.VehicleResponse;
import com.github.jonahwh.tesla_api_client.model.VehicleStateResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface VehiclesApi {
  /**
   * Retrieve a vehicle
   * Retrieve a specific vehicle
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;VehicleResponse&gt;
   */
  @GET("api/1/vehicles/{vehicle_id}")
  Call<VehicleResponse> getVehicle(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Charge State
   * Returns the state of charge in the battery.
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;ChargeStateResponse&gt;
   */
  @GET("api/1/vehicles/{vehicle_id}/data_request/charge_state")
  Call<ChargeStateResponse> getVehicleChargeState(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Climate Settings
   * Returns the current temperature and climate control state.
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;ClimateSettingsResponse&gt;
   */
  @GET("api/1/vehicles/{vehicle_id}/data_request/climate_state")
  Call<ClimateSettingsResponse> getVehicleClimateState(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Vehicle Config
   * Returns the vehicle&#x27;s configuration
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;VehicleConfigResponse&gt;
   */
  @GET("api/1/vehicles/{vehicle_id}/data_request/vehicle_config")
  Call<VehicleConfigResponse> getVehicleConfig(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Vehicle Data
   * Returns all vehicle ∂ata, potentially cached
   * @param vehicleId The id of the Vehicle. (required)
   * @param endpoints  (optional)
   * @return Call&lt;VehicleDataResponse&gt;
   */
  @GET("api/1/vehicles/{vehicle_id}/vehicle_data")
  Call<VehicleDataResponse> getVehicleData(
    @retrofit2.http.Path("vehicle_id") String vehicleId, @retrofit2.http.Query("endpoints") String endpoints
  );

  /**
   * Driving and Position
   * Returns the driving and position state of the vehicle.
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;DriveStateResponse&gt;
   */
  @GET("api/1/vehicles/{vehicle_id}/data_request/drive_state")
  Call<DriveStateResponse> getVehicleDriveState(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Mobile Access
   * Determines if mobile access to the vehicle is enabled.
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;MobileAccessResponse&gt;
   */
  @GET("api/1/vehicles/{vehicle_id}/mobile_enabled")
  Call<MobileAccessResponse> getVehicleMobileEnabled(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Vehicle State
   * Returns the vehicle&#x27;s physical state, such as which doors are open.
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;VehicleStateResponse&gt;
   */
  @GET("api/1/vehicles/{vehicle_id}/data_request/vehicle_state")
  Call<VehicleStateResponse> getVehicleState(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * List all Vehicles
   * Retrieve a list of your owned vehicles (includes vehicles not yet shipped!)
   * @return Call&lt;GetVehiclesResponse&gt;
   */
  @GET("api/1/vehicles")
  Call<GetVehiclesResponse> getVehicles();
    

  /**
   * GUI Settings
   * Returns various information about the GUI settings of the car, such as unit format and range display.
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;GuistateResponse&gt;
   */
  @GET("api/1/vehicles/{vehicle_id}/data_request/gui_settings")
  Call<GuistateResponse> getVehilceGuiSettings(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Get Nearby Chargers
   * Get a list of nearby charging sites
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;NearbyChargerResponse&gt;
   */
  @GET("api/1/vehicles/{vehicle_id}/nearby_charging_sites")
  Call<NearbyChargerResponse> nearbyChargers(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

}

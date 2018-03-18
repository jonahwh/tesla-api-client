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
  @Headers({
    "Content-Type:application/json"
  })
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
  @Headers({
    "Content-Type:application/json"
  })
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
  @Headers({
    "Content-Type:application/json"
  })
  @GET("api/1/vehicles/{vehicle_id}/data_request/climate_state")
  Call<ClimateSettingsResponse> getVehicleClimateState(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Driving and Position
   * Returns the driving and position state of the vehicle.
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;DriveStateResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
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
  @Headers({
    "Content-Type:application/json"
  })
  @GET("api/1/vehicles/{vehicle_id}/mobile_enabled")
  Call<MobileAccessResponse> getVehicleMobileEnabled(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Vehicle State
   * Returns the vehicle&#39;s physical state, such as which doors are open.
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;VehicleStateResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("api/1/vehicles/{vehicle_id}/data_request/vehicle_state")
  Call<VehicleStateResponse> getVehicleState(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * List all Vehicles
   * Retrieve a list of your owned vehicles (includes vehicles not yet shipped!)
   * @return Call&lt;GetVehiclesResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("api/1/vehicles")
  Call<GetVehiclesResponse> getVehicles();
    

  /**
   * GUI Settings
   * Returns various information about the GUI settings of the car, such as unit format and range display.
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;GuistateResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("api/1/vehicles/{vehicle_id}/data_request/gui_settings")
  Call<GuistateResponse> getVehilceGuiSettings(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

}

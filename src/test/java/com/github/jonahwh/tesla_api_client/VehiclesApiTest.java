package com.github.jonahwh.tesla_api_client;

import com.github.jonahwh.ApiClient;
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
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for VehiclesApi
 */
public class VehiclesApiTest {

    private VehiclesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(VehiclesApi.class);
    }


    /**
     * Retrieve a vehicle
     *
     * Retrieve a specific vehicle
     */
    @Test
    public void getVehicleTest() {
        String vehicleId = null;
        // VehicleResponse response = api.getVehicle(vehicleId);

        // TODO: test validations
    }

    /**
     * Charge State
     *
     * Returns the state of charge in the battery.
     */
    @Test
    public void getVehicleChargeStateTest() {
        String vehicleId = null;
        // ChargeStateResponse response = api.getVehicleChargeState(vehicleId);

        // TODO: test validations
    }

    /**
     * Climate Settings
     *
     * Returns the current temperature and climate control state.
     */
    @Test
    public void getVehicleClimateStateTest() {
        String vehicleId = null;
        // ClimateSettingsResponse response = api.getVehicleClimateState(vehicleId);

        // TODO: test validations
    }

    /**
     * Vehicle Config
     *
     * Returns the vehicle&#x27;s configuration
     */
    @Test
    public void getVehicleConfigTest() {
        String vehicleId = null;
        // VehicleConfigResponse response = api.getVehicleConfig(vehicleId);

        // TODO: test validations
    }

    /**
     * Vehicle Data
     *
     * Returns all vehicle ∂ata, potentially cached
     */
    @Test
    public void getVehicleDataTest() {
        String vehicleId = null;
        // VehicleDataResponse response = api.getVehicleData(vehicleId);

        // TODO: test validations
    }

    /**
     * Driving and Position
     *
     * Returns the driving and position state of the vehicle.
     */
    @Test
    public void getVehicleDriveStateTest() {
        String vehicleId = null;
        // DriveStateResponse response = api.getVehicleDriveState(vehicleId);

        // TODO: test validations
    }

    /**
     * Mobile Access
     *
     * Determines if mobile access to the vehicle is enabled.
     */
    @Test
    public void getVehicleMobileEnabledTest() {
        String vehicleId = null;
        // MobileAccessResponse response = api.getVehicleMobileEnabled(vehicleId);

        // TODO: test validations
    }

    /**
     * Vehicle State
     *
     * Returns the vehicle&#x27;s physical state, such as which doors are open.
     */
    @Test
    public void getVehicleStateTest() {
        String vehicleId = null;
        // VehicleStateResponse response = api.getVehicleState(vehicleId);

        // TODO: test validations
    }

    /**
     * List all Vehicles
     *
     * Retrieve a list of your owned vehicles (includes vehicles not yet shipped!)
     */
    @Test
    public void getVehiclesTest() {
        // GetVehiclesResponse response = api.getVehicles();

        // TODO: test validations
    }

    /**
     * GUI Settings
     *
     * Returns various information about the GUI settings of the car, such as unit format and range display.
     */
    @Test
    public void getVehilceGuiSettingsTest() {
        String vehicleId = null;
        // GuistateResponse response = api.getVehilceGuiSettings(vehicleId);

        // TODO: test validations
    }

    /**
     * Get Nearby Chargers
     *
     * Get a list of nearby charging sites
     */
    @Test
    public void nearbyChargersTest() {
        String vehicleId = null;
        // NearbyChargerResponse response = api.nearbyChargers(vehicleId);

        // TODO: test validations
    }
}

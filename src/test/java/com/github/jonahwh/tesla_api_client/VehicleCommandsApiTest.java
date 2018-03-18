package com.github.jonahwh.tesla_api_client;

import com.github.jonahwh.ApiClient;
import com.github.jonahwh.tesla_api_client.model.FlashLightsResponse;
import com.github.jonahwh.tesla_api_client.model.HonkHornResponse;
import com.github.jonahwh.tesla_api_client.model.LockDoorsResponse;
import com.github.jonahwh.tesla_api_client.model.MovePanoRoofRequest;
import com.github.jonahwh.tesla_api_client.model.MovePanoRoofResponse;
import com.github.jonahwh.tesla_api_client.model.OpenChargePortResponse;
import com.github.jonahwh.tesla_api_client.model.OpenTrunkResponse;
import com.github.jonahwh.tesla_api_client.model.RemoteStartResponse;
import com.github.jonahwh.tesla_api_client.model.ResetValetPinResponse;
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
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VehicleCommandsApi
 */
public class VehicleCommandsApiTest {

    private VehicleCommandsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(VehicleCommandsApi.class);
    }

    /**
     * Flash Lights
     *
     * Flash the lights once.
     */
    @Test
    public void flashLightsTest() {
        String vehicleId = null;
        // FlashLightsResponse response = api.flashLights(vehicleId);

        // TODO: test validations
    }
    /**
     * Honk Horn
     *
     * Honk the horn once.
     */
    @Test
    public void honkHornTest() {
        String vehicleId = null;
        // HonkHornResponse response = api.honkHorn(vehicleId);

        // TODO: test validations
    }
    /**
     * Lock Doors
     *
     * Lock the car&#39;s doors.
     */
    @Test
    public void lockDoorsTest() {
        String vehicleId = null;
        // LockDoorsResponse response = api.lockDoors(vehicleId);

        // TODO: test validations
    }
    /**
     * Move Pano Roof
     *
     * Controls the car&#39;s panoramic roof, if installed.
     */
    @Test
    public void openSunroofTest() {
        String vehicleId = null;
        MovePanoRoofRequest body = null;
        // MovePanoRoofResponse response = api.openSunroof(vehicleId, body);

        // TODO: test validations
    }
    /**
     * Open Trunk/Frunk
     *
     * Open the trunk or frunk. Currently inoperable.
     */
    @Test
    public void openTrunkTest() {
        String vehicleId = null;
        String whichTrunk = null;
        // OpenTrunkResponse response = api.openTrunk(vehicleId, whichTrunk);

        // TODO: test validations
    }
    /**
     * Remote Start
     *
     * Start the car for keyless driving. Must start driving within 2 minutes of issuing this request.
     */
    @Test
    public void remoteStartTest() {
        String vehicleId = null;
        String password = null;
        // RemoteStartResponse response = api.remoteStart(vehicleId, password);

        // TODO: test validations
    }
    /**
     * Reset Valet PIN
     *
     * Resets the PIN set for valet mode, if set.
     */
    @Test
    public void resetValetPinTest() {
        String vehicleId = null;
        // ResetValetPinResponse response = api.resetValetPin(vehicleId);

        // TODO: test validations
    }
    /**
     * Set Charge Limit to Standard
     *
     * Set the charge mode to standard (90% under the new percentage system introduced in 4.5).
     */
    @Test
    public void sendStandardChargeLimitTest() {
        String vehicleId = null;
        // SetChargeLimitToStandardResponse response = api.sendStandardChargeLimit(vehicleId);

        // TODO: test validations
    }
    /**
     * Set Charge Limit
     *
     * Set the charge limit to a custom percentage.
     */
    @Test
    public void setChargeLimitTest() {
        String vehicleId = null;
        Double percent = null;
        // SetChargeLimitResponse response = api.setChargeLimit(vehicleId, percent);

        // TODO: test validations
    }
    /**
     * Set Charge Limit to Max Range
     *
     * Set the charge mode to max range (100% under the new percentage system introduced in 4.5). Use sparingly!
     */
    @Test
    public void setMaxChargeLimitTest() {
        String vehicleId = null;
        // SetChargeLimitToMaxRangeResponse response = api.setMaxChargeLimit(vehicleId);

        // TODO: test validations
    }
    /**
     * Set Temperature
     *
     * Set the temperature target for the HVAC system.
     */
    @Test
    public void setTemperaturesTest() {
        String vehicleId = null;
        SetTempsRequest body = null;
        // SetTemperatureResponse response = api.setTemperatures(vehicleId, body);

        // TODO: test validations
    }
    /**
     * Start Charging
     *
     * Start charging. Must be plugged in, have power available, and not have reached your charge limit.
     */
    @Test
    public void startChargeTest() {
        String vehicleId = null;
        // StartChargingResponse response = api.startCharge(vehicleId);

        // TODO: test validations
    }
    /**
     * Start HVAC System
     *
     * Start the climate control system. Will cool or heat automatically, depending on set temperature.
     */
    @Test
    public void startHVACTest() {
        String vehicleId = null;
        // StartHvacSystemResponse response = api.startHVAC(vehicleId);

        // TODO: test validations
    }
    /**
     * Stop Charging
     *
     * Stop charging. Must already be charging.
     */
    @Test
    public void stopChargeTest() {
        String vehicleId = null;
        // StopChargingResponse response = api.stopCharge(vehicleId);

        // TODO: test validations
    }
    /**
     * Stop HVAC System
     *
     * Stop the climate control system.
     */
    @Test
    public void stopHVACTest() {
        String vehicleId = null;
        // StopHvacSystemResponse response = api.stopHVAC(vehicleId);

        // TODO: test validations
    }
    /**
     * Open Charge Port
     *
     * Opens the charge port. Does not close the charge port (for now...). This endpoint also unlocks the charge port if it&#39;s locked.
     */
    @Test
    public void toggleChargePortTest() {
        String vehicleId = null;
        // OpenChargePortResponse response = api.toggleChargePort(vehicleId);

        // TODO: test validations
    }
    /**
     * Set Valet Mode
     *
     * Sets valet mode on or off with a PIN to disable it from within the car. Reuses last PIN from previous valet session. Valet Mode limits the car&#39;s top speed to 70MPH and 80kW of acceleration power. It also disables Homelink, Bluetooth and Wifi settings, and the ability to disable mobile access to the car. It also hides your favorites, home, and work locations in navigation.
     */
    @Test
    public void toggleValetModeTest() {
        String vehicleId = null;
        SetValetRequest body = null;
        // SetValetModeResponse response = api.toggleValetMode(vehicleId, body);

        // TODO: test validations
    }
    /**
     * Unlock Doors
     *
     * Unlock the car&#39;s doors.
     */
    @Test
    public void unlockDoorsTest() {
        String vehicleId = null;
        // UnlockDoorsResponse response = api.unlockDoors(vehicleId);

        // TODO: test validations
    }
    /**
     * Wake Up Car
     *
     * Wakes up the car from the sleep state. Necessary to get some data from the car.
     */
    @Test
    public void wakeUpVehicleTest() {
        String vehicleId = null;
        // WakeUpCarResponse response = api.wakeUpVehicle(vehicleId);

        // TODO: test validations
    }
}

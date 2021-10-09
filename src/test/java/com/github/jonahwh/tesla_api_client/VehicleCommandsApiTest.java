package com.github.jonahwh.tesla_api_client;

import com.github.jonahwh.ApiClient;
import com.github.jonahwh.tesla_api_client.model.CommandResponse;
import com.github.jonahwh.tesla_api_client.model.MaxDefrostRequest;
import com.github.jonahwh.tesla_api_client.model.MovePanoRoofRequest;
import com.github.jonahwh.tesla_api_client.model.NavigationRequestRequest;
import com.github.jonahwh.tesla_api_client.model.OpenTrunkRequest;
import com.github.jonahwh.tesla_api_client.model.RemoteSeatHeaterRequest;
import com.github.jonahwh.tesla_api_client.model.RemoteStartRequest;
import com.github.jonahwh.tesla_api_client.model.RemoteSteeringWheelHeaterRequest;
import com.github.jonahwh.tesla_api_client.model.ScheduledChargingRequest;
import com.github.jonahwh.tesla_api_client.model.ScheduledDepartureRequest;
import com.github.jonahwh.tesla_api_client.model.SentryModeRequest;
import com.github.jonahwh.tesla_api_client.model.SetBioweaponModeRequest;
import com.github.jonahwh.tesla_api_client.model.SetChargeLimitRequest;
import com.github.jonahwh.tesla_api_client.model.SetChargingAmpsRequest;
import com.github.jonahwh.tesla_api_client.model.SetSpeedLimitRequest;
import com.github.jonahwh.tesla_api_client.model.SetTempsRequest;
import com.github.jonahwh.tesla_api_client.model.SetValetRequest;
import com.github.jonahwh.tesla_api_client.model.ShareRequest;
import com.github.jonahwh.tesla_api_client.model.SpeedLimitRequest;
import com.github.jonahwh.tesla_api_client.model.TriggerHomelinkRequest;
import com.github.jonahwh.tesla_api_client.model.WakeUpResponse;
import com.github.jonahwh.tesla_api_client.model.WindowControlRequest;
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
     * Activate Speed Limit
     *
     * Activates Speed Limit
     */
    @Test
    public void activateSpeedLimitTest() {
        String vehicleId = null;
        SpeedLimitRequest body = null;
        // CommandResponse response = api.activateSpeedLimit(vehicleId, body);

        // TODO: test validations
    }
    /**
     * Toggle Bioweapon Defense Mode
     *
     * Enable or Disable Bioweapon Defense Mode on equipped vehicles.
     */
    @Test
    public void bioweaponDefenseTest() {
        String vehicleId = null;
        SetBioweaponModeRequest body = null;
        // CommandResponse response = api.bioweaponDefense(vehicleId, body);

        // TODO: test validations
    }
    /**
     * Cancel Software Update
     *
     * Cancel Software Update
     */
    @Test
    public void cancelSoftwareUpdateTest() {
        String vehicleId = null;
        // CommandResponse response = api.cancelSoftwareUpdate(vehicleId);

        // TODO: test validations
    }
    /**
     * Clear Speed Limit Pin
     *
     * Clears Speed Limit Pin
     */
    @Test
    public void clearSpeedLimitPinTest() {
        String vehicleId = null;
        SpeedLimitRequest body = null;
        // CommandResponse response = api.clearSpeedLimitPin(vehicleId, body);

        // TODO: test validations
    }
    /**
     * Close Charge Port
     *
     * Closes the charge port.
     */
    @Test
    public void closeChargePortTest() {
        String vehicleId = null;
        // CommandResponse response = api.closeChargePort(vehicleId);

        // TODO: test validations
    }
    /**
     * Deactivate Speed Limit
     *
     * Deactivates Speed Limit
     */
    @Test
    public void deactivateSpeedLimitTest() {
        String vehicleId = null;
        SpeedLimitRequest body = null;
        // CommandResponse response = api.deactivateSpeedLimit(vehicleId, body);

        // TODO: test validations
    }
    /**
     * Flash Lights
     *
     * Flash the lights once.
     */
    @Test
    public void flashLightsTest() {
        String vehicleId = null;
        // CommandResponse response = api.flashLights(vehicleId);

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
        // CommandResponse response = api.honkHorn(vehicleId);

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
        // CommandResponse response = api.lockDoors(vehicleId);

        // TODO: test validations
    }
    /**
     * Send Navigation Request
     *
     * Sends Navigation Request to Vehicle
     */
    @Test
    public void navigationRequestTest() {
        String vehicleId = null;
        NavigationRequestRequest body = null;
        // CommandResponse response = api.navigationRequest(vehicleId, body);

        // TODO: test validations
    }
    /**
     * Open Charge Port
     *
     * Opens and unlocks the charge port.
     */
    @Test
    public void openChargePortTest() {
        String vehicleId = null;
        // CommandResponse response = api.openChargePort(vehicleId);

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
        // CommandResponse response = api.openSunroof(vehicleId, body);

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
        OpenTrunkRequest body = null;
        // CommandResponse response = api.openTrunk(vehicleId, body);

        // TODO: test validations
    }
    /**
     * Set Seat Heater Level
     *
     * Set the heating level of a seat heater
     */
    @Test
    public void remoteSeatHeaterRequestTest() {
        String vehicleId = null;
        RemoteSeatHeaterRequest body = null;
        // CommandResponse response = api.remoteSeatHeaterRequest(vehicleId, body);

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
        RemoteStartRequest body = null;
        // CommandResponse response = api.remoteStart(vehicleId, body);

        // TODO: test validations
    }
    /**
     * Toggle Steering Wheel Heater
     *
     * Toggle the steering wheel heater
     */
    @Test
    public void remoteSteeringWheelHeaterRequestTest() {
        String vehicleId = null;
        RemoteSteeringWheelHeaterRequest body = null;
        // CommandResponse response = api.remoteSteeringWheelHeaterRequest(vehicleId, body);

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
        // CommandResponse response = api.resetValetPin(vehicleId);

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
        // CommandResponse response = api.sendStandardChargeLimit(vehicleId);

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
        SetChargeLimitRequest body = null;
        // CommandResponse response = api.setChargeLimit(vehicleId, body);

        // TODO: test validations
    }
    /**
     * Set Charge Current
     *
     * Set the maximum Charge Current in Amps
     */
    @Test
    public void setChargingAmpsTest() {
        String vehicleId = null;
        SetChargingAmpsRequest body = null;
        // CommandResponse response = api.setChargingAmps(vehicleId, body);

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
        // CommandResponse response = api.setMaxChargeLimit(vehicleId);

        // TODO: test validations
    }
    /**
     * Set Max Defrost
     *
     * Set Max Defrost
     */
    @Test
    public void setMaxDefrostTest() {
        String vehicleId = null;
        MaxDefrostRequest body = null;
        // CommandResponse response = api.setMaxDefrost(vehicleId, body);

        // TODO: test validations
    }
    /**
     * Set Scheduled Charging
     *
     * Set Scheduled Charging settings
     */
    @Test
    public void setScheduledChargingTest() {
        String vehicleId = null;
        ScheduledChargingRequest body = null;
        // CommandResponse response = api.setScheduledCharging(vehicleId, body);

        // TODO: test validations
    }
    /**
     * Set Scheduled Departure
     *
     * Set Scheduled Departure settings
     */
    @Test
    public void setScheduledDepartureTest() {
        String vehicleId = null;
        ScheduledDepartureRequest body = null;
        // CommandResponse response = api.setScheduledDeparture(vehicleId, body);

        // TODO: test validations
    }
    /**
     * Toggle Sentry Mode
     *
     * Toggle Sentry Mode
     */
    @Test
    public void setSentryModeTest() {
        String vehicleId = null;
        SentryModeRequest body = null;
        // CommandResponse response = api.setSentryMode(vehicleId, body);

        // TODO: test validations
    }
    /**
     * Set Speed Limit
     *
     * Sets Speed Limit
     */
    @Test
    public void setSpeedLimitTest() {
        String vehicleId = null;
        SetSpeedLimitRequest body = null;
        // CommandResponse response = api.setSpeedLimit(vehicleId, body);

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
        // CommandResponse response = api.setTemperatures(vehicleId, body);

        // TODO: test validations
    }
    /**
     * Share data to Vehicle
     *
     * Sends Data to Vehicle (v10 only)
     */
    @Test
    public void sharetoVehicleTest() {
        String vehicleId = null;
        ShareRequest body = null;
        // CommandResponse response = api.sharetoVehicle(vehicleId, body);

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
        // CommandResponse response = api.startCharge(vehicleId);

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
        // CommandResponse response = api.startHVAC(vehicleId);

        // TODO: test validations
    }
    /**
     * Start Software Update
     *
     * Start Software Update
     */
    @Test
    public void startSoftwareUpdateTest() {
        String vehicleId = null;
        // CommandResponse response = api.startSoftwareUpdate(vehicleId);

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
        // CommandResponse response = api.stopCharge(vehicleId);

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
        // CommandResponse response = api.stopHVAC(vehicleId);

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
        // CommandResponse response = api.toggleValetMode(vehicleId, body);

        // TODO: test validations
    }
    /**
     * Trigger Homelink
     *
     * Trigger Homelink
     */
    @Test
    public void triggerHomelinkTest() {
        String vehicleId = null;
        TriggerHomelinkRequest body = null;
        // CommandResponse response = api.triggerHomelink(vehicleId, body);

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
        // CommandResponse response = api.unlockDoors(vehicleId);

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
        // WakeUpResponse response = api.wakeUpVehicle(vehicleId);

        // TODO: test validations
    }
    /**
     * Wake Up Car
     *
     * Wakes up the car from the sleep state. Necessary to get some data from the car.
     */
    @Test
    public void wakeUpVehicleCommandTest() {
        String vehicleId = null;
        // CommandResponse response = api.wakeUpVehicleCommand(vehicleId);

        // TODO: test validations
    }
    /**
     * Window Control
     *
     * Window Control
     */
    @Test
    public void windowControlTest() {
        String vehicleId = null;
        WindowControlRequest body = null;
        // CommandResponse response = api.windowControl(vehicleId, body);

        // TODO: test validations
    }
}

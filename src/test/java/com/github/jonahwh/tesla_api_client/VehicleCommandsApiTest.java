package com.github.jonahwh.tesla_api_client;

import com.github.jonahwh.ApiClient;
import com.github.jonahwh.tesla_api_client.model.CommandResponse;
import com.github.jonahwh.tesla_api_client.model.MaxDefrostRequest;
import com.github.jonahwh.tesla_api_client.model.MovePanoRoofRequest;
import com.github.jonahwh.tesla_api_client.model.NavigationRequestRequest;
import com.github.jonahwh.tesla_api_client.model.OpenTrunkRequest;
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
        SpeedLimitRequest body = null;
        String vehicleId = null;
        // CommandResponse response = api.activateSpeedLimit(body, vehicleId);

        // TODO: test validations
    }

    /**
     * Toggle Bioweapon Defense Mode
     *
     * Enable or Disable Bioweapon Defense Mode on equipped vehicles.
     */
    @Test
    public void bioweaponDefenseTest() {
        SetBioweaponModeRequest body = null;
        String vehicleId = null;
        // CommandResponse response = api.bioweaponDefense(body, vehicleId);

        // TODO: test validations
    }

    /**
     * Enable or Disable Cabin Overheat Protection
     *
     * Enable or Disable Cabin Overheat Protection
     */
    @Test
    public void cabinOverheatProtectionTest() {
        SetCabinOverheatProtectionRequest body = null;
        String vehicleId = null;
        // CommandResponse response = api.cabinOverheatProtection(body, vehicleId);

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
        SpeedLimitRequest body = null;
        String vehicleId = null;
        // CommandResponse response = api.clearSpeedLimitPin(body, vehicleId);

        // TODO: test validations
    }

    /**
     * Set the Climate Keeper mode
     *
     * Set the Climate Keeper mode.
     */
    @Test
    public void climateKeeperTest() {
        SetClimateKeeperRequest body = null;
        String vehicleId = null;
        // CommandResponse response = api.climateKeeper(body, vehicleId);

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
        SpeedLimitRequest body = null;
        String vehicleId = null;
        // CommandResponse response = api.deactivateSpeedLimit(body, vehicleId);

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
     * Lock the car&#x27;s doors.
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
        NavigationRequestRequest body = null;
        String vehicleId = null;
        // CommandResponse response = api.navigationRequest(body, vehicleId);

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
     * Controls the car&#x27;s panoramic roof, if installed.
     */
    @Test
    public void openSunroofTest() {
        MovePanoRoofRequest body = null;
        String vehicleId = null;
        // CommandResponse response = api.openSunroof(body, vehicleId);

        // TODO: test validations
    }

    /**
     * Open Trunk/Frunk
     *
     * Open the trunk or frunk. Currently inoperable.
     */
    @Test
    public void openTrunkTest() {
        OpenTrunkRequest body = null;
        String vehicleId = null;
        // CommandResponse response = api.openTrunk(body, vehicleId);

        // TODO: test validations
    }

    /**
     * Set Seat Cooler Level
     *
     * Set the cooling level of a seat heater
     */
    @Test
    public void remoteSeatCoolerRequestTest() {
        RemoteSeatCoolerRequest body = null;
        String vehicleId = null;
        // CommandResponse response = api.remoteSeatCoolerRequest(body, vehicleId);

        // TODO: test validations
    }

    /**
     * Set Seat Heater Level
     *
     * Set the heating level of a seat heater
     */
    @Test
    public void remoteSeatHeaterRequestTest() {
        RemoteSeatHeaterRequest body = null;
        String vehicleId = null;
        // CommandResponse response = api.remoteSeatHeaterRequest(body, vehicleId);

        // TODO: test validations
    }

    /**
     * Remote Start
     *
     * Start the car for keyless driving. Must start driving within 2 minutes of issuing this request.
     */
    @Test
    public void remoteStartTest() {
        RemoteStartRequest body = null;
        String vehicleId = null;
        // CommandResponse response = api.remoteStart(body, vehicleId);

        // TODO: test validations
    }

    /**
     * Toggle Steering Wheel Heater
     *
     * Toggle the steering wheel heater
     */
    @Test
    public void remoteSteeringWheelHeaterRequestTest() {
        RemoteSteeringWheelHeaterRequest body = null;
        String vehicleId = null;
        // CommandResponse response = api.remoteSteeringWheelHeaterRequest(body, vehicleId);

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
        SetChargeLimitRequest body = null;
        String vehicleId = null;
        // CommandResponse response = api.setChargeLimit(body, vehicleId);

        // TODO: test validations
    }

    /**
     * Set Charge Current
     *
     * Set the maximum Charge Current in Amps
     */
    @Test
    public void setChargingAmpsTest() {
        SetChargingAmpsRequest body = null;
        String vehicleId = null;
        // CommandResponse response = api.setChargingAmps(body, vehicleId);

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
        MaxDefrostRequest body = null;
        String vehicleId = null;
        // CommandResponse response = api.setMaxDefrost(body, vehicleId);

        // TODO: test validations
    }

    /**
     * Set Scheduled Charging
     *
     * Set Scheduled Charging settings
     */
    @Test
    public void setScheduledChargingTest() {
        ScheduledChargingRequest body = null;
        String vehicleId = null;
        // CommandResponse response = api.setScheduledCharging(body, vehicleId);

        // TODO: test validations
    }

    /**
     * Set Scheduled Departure
     *
     * Set Scheduled Departure settings
     */
    @Test
    public void setScheduledDepartureTest() {
        ScheduledDepartureRequest body = null;
        String vehicleId = null;
        // CommandResponse response = api.setScheduledDeparture(body, vehicleId);

        // TODO: test validations
    }

    /**
     * Toggle Sentry Mode
     *
     * Toggle Sentry Mode
     */
    @Test
    public void setSentryModeTest() {
        SentryModeRequest body = null;
        String vehicleId = null;
        // CommandResponse response = api.setSentryMode(body, vehicleId);

        // TODO: test validations
    }

    /**
     * Set Speed Limit
     *
     * Sets Speed Limit
     */
    @Test
    public void setSpeedLimitTest() {
        SetSpeedLimitRequest body = null;
        String vehicleId = null;
        // CommandResponse response = api.setSpeedLimit(body, vehicleId);

        // TODO: test validations
    }

    /**
     * Set Temperature
     *
     * Set the temperature target for the HVAC system.
     */
    @Test
    public void setTemperaturesTest() {
        SetTempsRequest body = null;
        String vehicleId = null;
        // CommandResponse response = api.setTemperatures(body, vehicleId);

        // TODO: test validations
    }

    /**
     * Share data to Vehicle
     *
     * Sends Data to Vehicle (v10 only)
     */
    @Test
    public void sharetoVehicleTest() {
        ShareRequest body = null;
        String vehicleId = null;
        // CommandResponse response = api.sharetoVehicle(body, vehicleId);

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
     * Sets valet mode on or off with a PIN to disable it from within the car. Reuses last PIN from previous valet session. Valet Mode limits the car&#x27;s top speed to 70MPH and 80kW of acceleration power. It also disables Homelink, Bluetooth and Wifi settings, and the ability to disable mobile access to the car. It also hides your favorites, home, and work locations in navigation.
     */
    @Test
    public void toggleValetModeTest() {
        SetValetRequest body = null;
        String vehicleId = null;
        // CommandResponse response = api.toggleValetMode(body, vehicleId);

        // TODO: test validations
    }

    /**
     * Trigger Homelink
     *
     * Trigger Homelink
     */
    @Test
    public void triggerHomelinkTest() {
        TriggerHomelinkRequest body = null;
        String vehicleId = null;
        // CommandResponse response = api.triggerHomelink(body, vehicleId);

        // TODO: test validations
    }

    /**
     * Unlock Doors
     *
     * Unlock the car&#x27;s doors.
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
        WindowControlRequest body = null;
        String vehicleId = null;
        // CommandResponse response = api.windowControl(body, vehicleId);

        // TODO: test validations
    }
}

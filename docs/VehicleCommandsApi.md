# VehicleCommandsApi

All URIs are relative to *https://owner-api.teslamotors.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateSpeedLimit**](VehicleCommandsApi.md#activateSpeedLimit) | **POST** api/1/vehicles/{vehicle_id}/command/speed_limit_activate | Activate Speed Limit
[**bioweaponDefense**](VehicleCommandsApi.md#bioweaponDefense) | **POST** api/1/vehicles/{vehicle_id}/command/set_bioweapon_mode | Toggle Bioweapon Defense Mode
[**cabinOverheatProtection**](VehicleCommandsApi.md#cabinOverheatProtection) | **POST** api/1/vehicles/{vehicle_id}/command/set_cabin_overheat_protection | Enable or Disable Cabin Overheat Protection
[**cancelSoftwareUpdate**](VehicleCommandsApi.md#cancelSoftwareUpdate) | **POST** api/1/vehicles/{vehicle_id}/command/cancel_software_update | Cancel Software Update
[**clearSpeedLimitPin**](VehicleCommandsApi.md#clearSpeedLimitPin) | **POST** api/1/vehicles/{vehicle_id}/command/speed_limit_clear_pin | Clear Speed Limit Pin
[**climateKeeper**](VehicleCommandsApi.md#climateKeeper) | **POST** api/1/vehicles/{vehicle_id}/command/set_climate_keeper_mode | Set the Climate Keeper mode
[**closeChargePort**](VehicleCommandsApi.md#closeChargePort) | **POST** api/1/vehicles/{vehicle_id}/command/charge_port_door_close | Close Charge Port
[**deactivateSpeedLimit**](VehicleCommandsApi.md#deactivateSpeedLimit) | **POST** api/1/vehicles/{vehicle_id}/command/speed_limit_deactivate | Deactivate Speed Limit
[**flashLights**](VehicleCommandsApi.md#flashLights) | **POST** api/1/vehicles/{vehicle_id}/command/flash_lights | Flash Lights
[**honkHorn**](VehicleCommandsApi.md#honkHorn) | **POST** api/1/vehicles/{vehicle_id}/command/honk_horn | Honk Horn
[**lockDoors**](VehicleCommandsApi.md#lockDoors) | **POST** api/1/vehicles/{vehicle_id}/command/door_lock | Lock Doors
[**navigationRequest**](VehicleCommandsApi.md#navigationRequest) | **POST** api/1/vehicles/{vehicle_id}/command/navigation_request | Send Navigation Request
[**openChargePort**](VehicleCommandsApi.md#openChargePort) | **POST** api/1/vehicles/{vehicle_id}/command/charge_port_door_open | Open Charge Port
[**openSunroof**](VehicleCommandsApi.md#openSunroof) | **POST** api/1/vehicles/{vehicle_id}/command/sun_roof_control | Move Pano Roof
[**openTrunk**](VehicleCommandsApi.md#openTrunk) | **POST** api/1/vehicles/{vehicle_id}/command/actuate_trunk | Open Trunk/Frunk
[**remoteAutoSeatClimateRequest**](VehicleCommandsApi.md#remoteAutoSeatClimateRequest) | **POST** api/1/vehicles/{vehicle_id}/command/remote_auto_seat_climate_request | Toggle Automatic Seat Heater/Cooler
[**remoteSeatCoolerRequest**](VehicleCommandsApi.md#remoteSeatCoolerRequest) | **POST** api/1/vehicles/{vehicle_id}/command/remote_seat_cooler_request | Set Seat Cooler Level
[**remoteSeatHeaterRequest**](VehicleCommandsApi.md#remoteSeatHeaterRequest) | **POST** api/1/vehicles/{vehicle_id}/command/remote_seat_heater_request | Set Seat Heater Level
[**remoteStart**](VehicleCommandsApi.md#remoteStart) | **POST** api/1/vehicles/{vehicle_id}/command/remote_start_drive | Remote Start
[**remoteSteeringWheelHeaterRequest**](VehicleCommandsApi.md#remoteSteeringWheelHeaterRequest) | **POST** api/1/vehicles/{vehicle_id}/command/remote_steering_wheel_heater_request | Toggle Steering Wheel Heater
[**resetValetPin**](VehicleCommandsApi.md#resetValetPin) | **POST** api/1/vehicles/{vehicle_id}/command/reset_valet_pin | Reset Valet PIN
[**sendStandardChargeLimit**](VehicleCommandsApi.md#sendStandardChargeLimit) | **POST** api/1/vehicles/{vehicle_id}/command/charge_standard | Set Charge Limit to Standard
[**setChargeLimit**](VehicleCommandsApi.md#setChargeLimit) | **POST** api/1/vehicles/{vehicle_id}/command/set_charge_limit | Set Charge Limit
[**setChargingAmps**](VehicleCommandsApi.md#setChargingAmps) | **POST** api/1/vehicles/{vehicle_id}/command/set_charging_amps | Set Charge Current
[**setMaxChargeLimit**](VehicleCommandsApi.md#setMaxChargeLimit) | **POST** api/1/vehicles/{vehicle_id}/command/charge_max_range | Set Charge Limit to Max Range
[**setMaxDefrost**](VehicleCommandsApi.md#setMaxDefrost) | **POST** api/1/vehicles/{vehicle_id}/command/set_preconditioning_max | Set Max Defrost
[**setScheduledCharging**](VehicleCommandsApi.md#setScheduledCharging) | **POST** api/1/vehicles/{vehicle_id}/command/set_scheduled_charging | Set Scheduled Charging
[**setScheduledDeparture**](VehicleCommandsApi.md#setScheduledDeparture) | **POST** api/1/vehicles/{vehicle_id}/command/set_scheduled_departure | Set Scheduled Departure
[**setSentryMode**](VehicleCommandsApi.md#setSentryMode) | **POST** api/1/vehicles/{vehicle_id}/command/set_sentry_mode | Toggle Sentry Mode
[**setSpeedLimit**](VehicleCommandsApi.md#setSpeedLimit) | **POST** api/1/vehicles/{vehicle_id}/command/speed_limit_set_limit | Set Speed Limit
[**setTemperatures**](VehicleCommandsApi.md#setTemperatures) | **POST** api/1/vehicles/{vehicle_id}/command/set_temps | Set Temperature
[**sharetoVehicle**](VehicleCommandsApi.md#sharetoVehicle) | **POST** api/1/vehicles/{vehicle_id}/command/share | Share data to Vehicle
[**startCharge**](VehicleCommandsApi.md#startCharge) | **POST** api/1/vehicles/{vehicle_id}/command/charge_start | Start Charging
[**startHVAC**](VehicleCommandsApi.md#startHVAC) | **POST** api/1/vehicles/{vehicle_id}/command/auto_conditioning_start | Start HVAC System
[**startSoftwareUpdate**](VehicleCommandsApi.md#startSoftwareUpdate) | **POST** api/1/vehicles/{vehicle_id}/command/schedule_software_update | Start Software Update
[**stopCharge**](VehicleCommandsApi.md#stopCharge) | **POST** api/1/vehicles/{vehicle_id}/command/charge_stop | Stop Charging
[**stopHVAC**](VehicleCommandsApi.md#stopHVAC) | **POST** api/1/vehicles/{vehicle_id}/command/auto_conditioning_stop | Stop HVAC System
[**toggleValetMode**](VehicleCommandsApi.md#toggleValetMode) | **POST** api/1/vehicles/{vehicle_id}/command/set_valet_mode | Set Valet Mode
[**triggerHomelink**](VehicleCommandsApi.md#triggerHomelink) | **POST** api/1/vehicles/{vehicle_id}/command/trigger_homelink | Trigger Homelink
[**unlockDoors**](VehicleCommandsApi.md#unlockDoors) | **POST** api/1/vehicles/{vehicle_id}/command/door_unlock | Unlock Doors
[**wakeUpVehicle**](VehicleCommandsApi.md#wakeUpVehicle) | **POST** api/1/vehicles/{vehicle_id}/wake_up | Wake Up Car
[**wakeUpVehicleCommand**](VehicleCommandsApi.md#wakeUpVehicleCommand) | **POST** api/1/vehicles/{vehicle_id}/command/wake_up | Wake Up Car
[**windowControl**](VehicleCommandsApi.md#windowControl) | **POST** api/1/vehicles/{vehicle_id}/command/window_control | Window Control

<a name="activateSpeedLimit"></a>
# **activateSpeedLimit**
> CommandResponse activateSpeedLimit(body, vehicleId)

Activate Speed Limit

Activates Speed Limit

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
SpeedLimitRequest body = new SpeedLimitRequest(); // SpeedLimitRequest | 
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.activateSpeedLimit(body, vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#activateSpeedLimit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SpeedLimitRequest**](SpeedLimitRequest.md)|  |
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="bioweaponDefense"></a>
# **bioweaponDefense**
> CommandResponse bioweaponDefense(body, vehicleId)

Toggle Bioweapon Defense Mode

Enable or Disable Bioweapon Defense Mode on equipped vehicles.

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
SetBioweaponModeRequest body = new SetBioweaponModeRequest(); // SetBioweaponModeRequest | 
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.bioweaponDefense(body, vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#bioweaponDefense");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SetBioweaponModeRequest**](SetBioweaponModeRequest.md)|  |
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cabinOverheatProtection"></a>
# **cabinOverheatProtection**
> CommandResponse cabinOverheatProtection(body, vehicleId)

Enable or Disable Cabin Overheat Protection

Enable or Disable Cabin Overheat Protection

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
SetCabinOverheatProtectionRequest body = new SetCabinOverheatProtectionRequest(); // SetCabinOverheatProtectionRequest | 
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.cabinOverheatProtection(body, vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#cabinOverheatProtection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SetCabinOverheatProtectionRequest**](SetCabinOverheatProtectionRequest.md)|  |
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cancelSoftwareUpdate"></a>
# **cancelSoftwareUpdate**
> CommandResponse cancelSoftwareUpdate(vehicleId)

Cancel Software Update

Cancel Software Update

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.cancelSoftwareUpdate(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#cancelSoftwareUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="clearSpeedLimitPin"></a>
# **clearSpeedLimitPin**
> CommandResponse clearSpeedLimitPin(body, vehicleId)

Clear Speed Limit Pin

Clears Speed Limit Pin

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
SpeedLimitRequest body = new SpeedLimitRequest(); // SpeedLimitRequest | 
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.clearSpeedLimitPin(body, vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#clearSpeedLimitPin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SpeedLimitRequest**](SpeedLimitRequest.md)|  |
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="climateKeeper"></a>
# **climateKeeper**
> CommandResponse climateKeeper(body, vehicleId)

Set the Climate Keeper mode

Set the Climate Keeper mode.

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
SetClimateKeeperRequest body = new SetClimateKeeperRequest(); // SetClimateKeeperRequest | 
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.climateKeeper(body, vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#climateKeeper");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SetClimateKeeperRequest**](SetClimateKeeperRequest.md)|  |
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="closeChargePort"></a>
# **closeChargePort**
> CommandResponse closeChargePort(vehicleId)

Close Charge Port

Closes the charge port.

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.closeChargePort(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#closeChargePort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deactivateSpeedLimit"></a>
# **deactivateSpeedLimit**
> CommandResponse deactivateSpeedLimit(body, vehicleId)

Deactivate Speed Limit

Deactivates Speed Limit

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
SpeedLimitRequest body = new SpeedLimitRequest(); // SpeedLimitRequest | 
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.deactivateSpeedLimit(body, vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#deactivateSpeedLimit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SpeedLimitRequest**](SpeedLimitRequest.md)|  |
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="flashLights"></a>
# **flashLights**
> CommandResponse flashLights(vehicleId)

Flash Lights

Flash the lights once.

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.flashLights(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#flashLights");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="honkHorn"></a>
# **honkHorn**
> CommandResponse honkHorn(vehicleId)

Honk Horn

Honk the horn once.

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.honkHorn(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#honkHorn");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="lockDoors"></a>
# **lockDoors**
> CommandResponse lockDoors(vehicleId)

Lock Doors

Lock the car&#x27;s doors.

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.lockDoors(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#lockDoors");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="navigationRequest"></a>
# **navigationRequest**
> CommandResponse navigationRequest(body, vehicleId)

Send Navigation Request

Sends Navigation Request to Vehicle

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
NavigationRequestRequest body = new NavigationRequestRequest(); // NavigationRequestRequest | 
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.navigationRequest(body, vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#navigationRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NavigationRequestRequest**](NavigationRequestRequest.md)|  |
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="openChargePort"></a>
# **openChargePort**
> CommandResponse openChargePort(vehicleId)

Open Charge Port

Opens and unlocks the charge port.

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.openChargePort(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#openChargePort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="openSunroof"></a>
# **openSunroof**
> CommandResponse openSunroof(body, vehicleId)

Move Pano Roof

Controls the car&#x27;s panoramic roof, if installed.

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
MovePanoRoofRequest body = new MovePanoRoofRequest(); // MovePanoRoofRequest | 
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.openSunroof(body, vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#openSunroof");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MovePanoRoofRequest**](MovePanoRoofRequest.md)|  |
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="openTrunk"></a>
# **openTrunk**
> CommandResponse openTrunk(body, vehicleId)

Open Trunk/Frunk

Open the trunk or frunk. Currently inoperable.

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
OpenTrunkRequest body = new OpenTrunkRequest(); // OpenTrunkRequest | 
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.openTrunk(body, vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#openTrunk");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OpenTrunkRequest**](OpenTrunkRequest.md)|  |
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="remoteAutoSeatClimateRequest"></a>
# **remoteAutoSeatClimateRequest**
> CommandResponse remoteAutoSeatClimateRequest(body, vehicleId)

Toggle Automatic Seat Heater/Cooler

Enables or disables automatic control of a seat heater/coooler

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
RemoteAutoSeatClimateRequest body = new RemoteAutoSeatClimateRequest(); // RemoteAutoSeatClimateRequest | 
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.remoteAutoSeatClimateRequest(body, vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#remoteAutoSeatClimateRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RemoteAutoSeatClimateRequest**](RemoteAutoSeatClimateRequest.md)|  |
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="remoteSeatCoolerRequest"></a>
# **remoteSeatCoolerRequest**
> CommandResponse remoteSeatCoolerRequest(body, vehicleId)

Set Seat Cooler Level

Set the cooling level of a seat heater

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
RemoteSeatCoolerRequest body = new RemoteSeatCoolerRequest(); // RemoteSeatCoolerRequest | 
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.remoteSeatCoolerRequest(body, vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#remoteSeatCoolerRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RemoteSeatCoolerRequest**](RemoteSeatCoolerRequest.md)|  |
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="remoteSeatHeaterRequest"></a>
# **remoteSeatHeaterRequest**
> CommandResponse remoteSeatHeaterRequest(body, vehicleId)

Set Seat Heater Level

Set the heating level of a seat heater

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
RemoteSeatHeaterRequest body = new RemoteSeatHeaterRequest(); // RemoteSeatHeaterRequest | 
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.remoteSeatHeaterRequest(body, vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#remoteSeatHeaterRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RemoteSeatHeaterRequest**](RemoteSeatHeaterRequest.md)|  |
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="remoteStart"></a>
# **remoteStart**
> CommandResponse remoteStart(body, vehicleId)

Remote Start

Start the car for keyless driving. Must start driving within 2 minutes of issuing this request.

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
RemoteStartRequest body = new RemoteStartRequest(); // RemoteStartRequest | 
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.remoteStart(body, vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#remoteStart");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RemoteStartRequest**](RemoteStartRequest.md)|  |
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="remoteSteeringWheelHeaterRequest"></a>
# **remoteSteeringWheelHeaterRequest**
> CommandResponse remoteSteeringWheelHeaterRequest(body, vehicleId)

Toggle Steering Wheel Heater

Toggle the steering wheel heater

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
RemoteSteeringWheelHeaterRequest body = new RemoteSteeringWheelHeaterRequest(); // RemoteSteeringWheelHeaterRequest | 
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.remoteSteeringWheelHeaterRequest(body, vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#remoteSteeringWheelHeaterRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RemoteSteeringWheelHeaterRequest**](RemoteSteeringWheelHeaterRequest.md)|  |
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resetValetPin"></a>
# **resetValetPin**
> CommandResponse resetValetPin(vehicleId)

Reset Valet PIN

Resets the PIN set for valet mode, if set.

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.resetValetPin(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#resetValetPin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sendStandardChargeLimit"></a>
# **sendStandardChargeLimit**
> CommandResponse sendStandardChargeLimit(vehicleId)

Set Charge Limit to Standard

Set the charge mode to standard (90% under the new percentage system introduced in 4.5).

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.sendStandardChargeLimit(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#sendStandardChargeLimit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setChargeLimit"></a>
# **setChargeLimit**
> CommandResponse setChargeLimit(body, vehicleId)

Set Charge Limit

Set the charge limit to a custom percentage.

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
SetChargeLimitRequest body = new SetChargeLimitRequest(); // SetChargeLimitRequest | 
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.setChargeLimit(body, vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#setChargeLimit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SetChargeLimitRequest**](SetChargeLimitRequest.md)|  |
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setChargingAmps"></a>
# **setChargingAmps**
> CommandResponse setChargingAmps(body, vehicleId)

Set Charge Current

Set the maximum Charge Current in Amps

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
SetChargingAmpsRequest body = new SetChargingAmpsRequest(); // SetChargingAmpsRequest | 
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.setChargingAmps(body, vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#setChargingAmps");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SetChargingAmpsRequest**](SetChargingAmpsRequest.md)|  |
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setMaxChargeLimit"></a>
# **setMaxChargeLimit**
> CommandResponse setMaxChargeLimit(vehicleId)

Set Charge Limit to Max Range

Set the charge mode to max range (100% under the new percentage system introduced in 4.5). Use sparingly!

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.setMaxChargeLimit(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#setMaxChargeLimit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setMaxDefrost"></a>
# **setMaxDefrost**
> CommandResponse setMaxDefrost(body, vehicleId)

Set Max Defrost

Set Max Defrost

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
MaxDefrostRequest body = new MaxDefrostRequest(); // MaxDefrostRequest | 
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.setMaxDefrost(body, vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#setMaxDefrost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MaxDefrostRequest**](MaxDefrostRequest.md)|  |
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setScheduledCharging"></a>
# **setScheduledCharging**
> CommandResponse setScheduledCharging(body, vehicleId)

Set Scheduled Charging

Set Scheduled Charging settings

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
ScheduledChargingRequest body = new ScheduledChargingRequest(); // ScheduledChargingRequest | 
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.setScheduledCharging(body, vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#setScheduledCharging");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ScheduledChargingRequest**](ScheduledChargingRequest.md)|  |
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setScheduledDeparture"></a>
# **setScheduledDeparture**
> CommandResponse setScheduledDeparture(body, vehicleId)

Set Scheduled Departure

Set Scheduled Departure settings

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
ScheduledDepartureRequest body = new ScheduledDepartureRequest(); // ScheduledDepartureRequest | 
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.setScheduledDeparture(body, vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#setScheduledDeparture");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ScheduledDepartureRequest**](ScheduledDepartureRequest.md)|  |
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setSentryMode"></a>
# **setSentryMode**
> CommandResponse setSentryMode(body, vehicleId)

Toggle Sentry Mode

Toggle Sentry Mode

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
SentryModeRequest body = new SentryModeRequest(); // SentryModeRequest | 
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.setSentryMode(body, vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#setSentryMode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SentryModeRequest**](SentryModeRequest.md)|  |
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setSpeedLimit"></a>
# **setSpeedLimit**
> CommandResponse setSpeedLimit(body, vehicleId)

Set Speed Limit

Sets Speed Limit

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
SetSpeedLimitRequest body = new SetSpeedLimitRequest(); // SetSpeedLimitRequest | 
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.setSpeedLimit(body, vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#setSpeedLimit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SetSpeedLimitRequest**](SetSpeedLimitRequest.md)|  |
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setTemperatures"></a>
# **setTemperatures**
> CommandResponse setTemperatures(body, vehicleId)

Set Temperature

Set the temperature target for the HVAC system.

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
SetTempsRequest body = new SetTempsRequest(); // SetTempsRequest | 
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.setTemperatures(body, vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#setTemperatures");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SetTempsRequest**](SetTempsRequest.md)|  |
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sharetoVehicle"></a>
# **sharetoVehicle**
> CommandResponse sharetoVehicle(body, vehicleId)

Share data to Vehicle

Sends Data to Vehicle (v10 only)

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
ShareRequest body = new ShareRequest(); // ShareRequest | 
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.sharetoVehicle(body, vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#sharetoVehicle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ShareRequest**](ShareRequest.md)|  |
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="startCharge"></a>
# **startCharge**
> CommandResponse startCharge(vehicleId)

Start Charging

Start charging. Must be plugged in, have power available, and not have reached your charge limit.

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.startCharge(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#startCharge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="startHVAC"></a>
# **startHVAC**
> CommandResponse startHVAC(vehicleId)

Start HVAC System

Start the climate control system. Will cool or heat automatically, depending on set temperature.

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.startHVAC(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#startHVAC");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="startSoftwareUpdate"></a>
# **startSoftwareUpdate**
> CommandResponse startSoftwareUpdate(vehicleId)

Start Software Update

Start Software Update

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.startSoftwareUpdate(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#startSoftwareUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stopCharge"></a>
# **stopCharge**
> CommandResponse stopCharge(vehicleId)

Stop Charging

Stop charging. Must already be charging.

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.stopCharge(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#stopCharge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stopHVAC"></a>
# **stopHVAC**
> CommandResponse stopHVAC(vehicleId)

Stop HVAC System

Stop the climate control system.

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.stopHVAC(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#stopHVAC");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="toggleValetMode"></a>
# **toggleValetMode**
> CommandResponse toggleValetMode(body, vehicleId)

Set Valet Mode

Sets valet mode on or off with a PIN to disable it from within the car. Reuses last PIN from previous valet session. Valet Mode limits the car&#x27;s top speed to 70MPH and 80kW of acceleration power. It also disables Homelink, Bluetooth and Wifi settings, and the ability to disable mobile access to the car. It also hides your favorites, home, and work locations in navigation.

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
SetValetRequest body = new SetValetRequest(); // SetValetRequest | 
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.toggleValetMode(body, vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#toggleValetMode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SetValetRequest**](SetValetRequest.md)|  |
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="triggerHomelink"></a>
# **triggerHomelink**
> CommandResponse triggerHomelink(body, vehicleId)

Trigger Homelink

Trigger Homelink

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
TriggerHomelinkRequest body = new TriggerHomelinkRequest(); // TriggerHomelinkRequest | 
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.triggerHomelink(body, vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#triggerHomelink");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TriggerHomelinkRequest**](TriggerHomelinkRequest.md)|  |
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unlockDoors"></a>
# **unlockDoors**
> CommandResponse unlockDoors(vehicleId)

Unlock Doors

Unlock the car&#x27;s doors.

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.unlockDoors(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#unlockDoors");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="wakeUpVehicle"></a>
# **wakeUpVehicle**
> WakeUpResponse wakeUpVehicle(vehicleId)

Wake Up Car

Wakes up the car from the sleep state. Necessary to get some data from the car.

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    WakeUpResponse result = apiInstance.wakeUpVehicle(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#wakeUpVehicle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**WakeUpResponse**](WakeUpResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="wakeUpVehicleCommand"></a>
# **wakeUpVehicleCommand**
> CommandResponse wakeUpVehicleCommand(vehicleId)

Wake Up Car

Wakes up the car from the sleep state. Necessary to get some data from the car.

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.wakeUpVehicleCommand(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#wakeUpVehicleCommand");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="windowControl"></a>
# **windowControl**
> CommandResponse windowControl(body, vehicleId)

Window Control

Window Control

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
WindowControlRequest body = new WindowControlRequest(); // WindowControlRequest | 
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.windowControl(body, vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#windowControl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WindowControlRequest**](WindowControlRequest.md)|  |
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


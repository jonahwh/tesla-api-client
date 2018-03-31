# VehicleCommandsApi

All URIs are relative to *https://owner-api.teslamotors.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**flashLights**](VehicleCommandsApi.md#flashLights) | **POST** api/1/vehicles/{vehicle_id}/command/flash_lights | Flash Lights
[**honkHorn**](VehicleCommandsApi.md#honkHorn) | **POST** api/1/vehicles/{vehicle_id}/command/honk_horn | Honk Horn
[**lockDoors**](VehicleCommandsApi.md#lockDoors) | **POST** api/1/vehicles/{vehicle_id}/command/door_lock | Lock Doors
[**openSunroof**](VehicleCommandsApi.md#openSunroof) | **POST** api/1/vehicles/{vehicle_id}/command/sun_roof_control | Move Pano Roof
[**openTrunk**](VehicleCommandsApi.md#openTrunk) | **POST** api/1/vehicles/{vehicle_id}/command/trunk_open | Open Trunk/Frunk
[**remoteStart**](VehicleCommandsApi.md#remoteStart) | **POST** api/1/vehicles/{vehicle_id}/command/remote_start_drive | Remote Start
[**resetValetPin**](VehicleCommandsApi.md#resetValetPin) | **POST** api/1/vehicles/{vehicle_id}/command/reset_valet_pin | Reset Valet PIN
[**sendStandardChargeLimit**](VehicleCommandsApi.md#sendStandardChargeLimit) | **POST** api/1/vehicles/{vehicle_id}/command/charge_standard | Set Charge Limit to Standard
[**setChargeLimit**](VehicleCommandsApi.md#setChargeLimit) | **POST** api/1/vehicles/{vehicle_id}/command/set_charge_limit | Set Charge Limit
[**setMaxChargeLimit**](VehicleCommandsApi.md#setMaxChargeLimit) | **POST** api/1/vehicles/{vehicle_id}/command/charge_max_range | Set Charge Limit to Max Range
[**setTemperatures**](VehicleCommandsApi.md#setTemperatures) | **POST** api/1/vehicles/{vehicle_id}/command/set_temps | Set Temperature
[**startCharge**](VehicleCommandsApi.md#startCharge) | **POST** api/1/vehicles/{vehicle_id}/command/charge_start | Start Charging
[**startHVAC**](VehicleCommandsApi.md#startHVAC) | **POST** api/1/vehicles/{vehicle_id}/command/auto_conditioning_start | Start HVAC System
[**stopCharge**](VehicleCommandsApi.md#stopCharge) | **POST** api/1/vehicles/{vehicle_id}/command/charge_stop | Stop Charging
[**stopHVAC**](VehicleCommandsApi.md#stopHVAC) | **POST** api/1/vehicles/{vehicle_id}/command/auto_conditioning_stop | Stop HVAC System
[**toggleChargePort**](VehicleCommandsApi.md#toggleChargePort) | **POST** api/1/vehicles/{vehicle_id}/command/charge_port_door_open | Open Charge Port
[**toggleValetMode**](VehicleCommandsApi.md#toggleValetMode) | **POST** api/1/vehicles/{vehicle_id}/command/set_valet_mode | Set Valet Mode
[**unlockDoors**](VehicleCommandsApi.md#unlockDoors) | **POST** api/1/vehicles/{vehicle_id}/command/door_unlock | Unlock Doors
[**wakeUpVehicle**](VehicleCommandsApi.md#wakeUpVehicle) | **POST** api/1/vehicles/{vehicle_id}/command/wake_up | Wake Up Car


<a name="flashLights"></a>
# **flashLights**
> FlashLightsResponse flashLights(vehicleId)

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
    FlashLightsResponse result = apiInstance.flashLights(vehicleId);
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

[**FlashLightsResponse**](FlashLightsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="honkHorn"></a>
# **honkHorn**
> HonkHornResponse honkHorn(vehicleId)

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
    HonkHornResponse result = apiInstance.honkHorn(vehicleId);
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

[**HonkHornResponse**](HonkHornResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="lockDoors"></a>
# **lockDoors**
> LockDoorsResponse lockDoors(vehicleId)

Lock Doors

Lock the car&#39;s doors.

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    LockDoorsResponse result = apiInstance.lockDoors(vehicleId);
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

[**LockDoorsResponse**](LockDoorsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="openSunroof"></a>
# **openSunroof**
> MovePanoRoofResponse openSunroof(vehicleId, body)

Move Pano Roof

Controls the car&#39;s panoramic roof, if installed.

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
MovePanoRoofRequest body = new MovePanoRoofRequest(); // MovePanoRoofRequest | 
try {
    MovePanoRoofResponse result = apiInstance.openSunroof(vehicleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#openSunroof");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**| The id of the Vehicle. |
 **body** | [**MovePanoRoofRequest**](MovePanoRoofRequest.md)|  |

### Return type

[**MovePanoRoofResponse**](MovePanoRoofResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="openTrunk"></a>
# **openTrunk**
> OpenTrunkResponse openTrunk(vehicleId, body)

Open Trunk/Frunk

Open the trunk or frunk. Currently inoperable.

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
OpenTrunkRequest body = new OpenTrunkRequest(); // OpenTrunkRequest | 
try {
    OpenTrunkResponse result = apiInstance.openTrunk(vehicleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#openTrunk");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**| The id of the Vehicle. |
 **body** | [**OpenTrunkRequest**](OpenTrunkRequest.md)|  |

### Return type

[**OpenTrunkResponse**](OpenTrunkResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="remoteStart"></a>
# **remoteStart**
> RemoteStartResponse remoteStart(vehicleId, body)

Remote Start

Start the car for keyless driving. Must start driving within 2 minutes of issuing this request.

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
RemoteStartRequest body = new RemoteStartRequest(); // RemoteStartRequest | 
try {
    RemoteStartResponse result = apiInstance.remoteStart(vehicleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#remoteStart");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**| The id of the Vehicle. |
 **body** | [**RemoteStartRequest**](RemoteStartRequest.md)|  |

### Return type

[**RemoteStartResponse**](RemoteStartResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resetValetPin"></a>
# **resetValetPin**
> ResetValetPinResponse resetValetPin(vehicleId)

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
    ResetValetPinResponse result = apiInstance.resetValetPin(vehicleId);
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

[**ResetValetPinResponse**](ResetValetPinResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendStandardChargeLimit"></a>
# **sendStandardChargeLimit**
> SetChargeLimitToStandardResponse sendStandardChargeLimit(vehicleId)

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
    SetChargeLimitToStandardResponse result = apiInstance.sendStandardChargeLimit(vehicleId);
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

[**SetChargeLimitToStandardResponse**](SetChargeLimitToStandardResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setChargeLimit"></a>
# **setChargeLimit**
> SetChargeLimitResponse setChargeLimit(vehicleId, body)

Set Charge Limit

Set the charge limit to a custom percentage.

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
SetChargeLimitRequest body = new SetChargeLimitRequest(); // SetChargeLimitRequest | 
try {
    SetChargeLimitResponse result = apiInstance.setChargeLimit(vehicleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#setChargeLimit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**| The id of the Vehicle. |
 **body** | [**SetChargeLimitRequest**](SetChargeLimitRequest.md)|  |

### Return type

[**SetChargeLimitResponse**](SetChargeLimitResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setMaxChargeLimit"></a>
# **setMaxChargeLimit**
> SetChargeLimitToMaxRangeResponse setMaxChargeLimit(vehicleId)

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
    SetChargeLimitToMaxRangeResponse result = apiInstance.setMaxChargeLimit(vehicleId);
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

[**SetChargeLimitToMaxRangeResponse**](SetChargeLimitToMaxRangeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setTemperatures"></a>
# **setTemperatures**
> SetTemperatureResponse setTemperatures(vehicleId, body)

Set Temperature

Set the temperature target for the HVAC system.

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
SetTempsRequest body = new SetTempsRequest(); // SetTempsRequest | 
try {
    SetTemperatureResponse result = apiInstance.setTemperatures(vehicleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#setTemperatures");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**| The id of the Vehicle. |
 **body** | [**SetTempsRequest**](SetTempsRequest.md)|  |

### Return type

[**SetTemperatureResponse**](SetTemperatureResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="startCharge"></a>
# **startCharge**
> StartChargingResponse startCharge(vehicleId)

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
    StartChargingResponse result = apiInstance.startCharge(vehicleId);
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

[**StartChargingResponse**](StartChargingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="startHVAC"></a>
# **startHVAC**
> StartHvacSystemResponse startHVAC(vehicleId)

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
    StartHvacSystemResponse result = apiInstance.startHVAC(vehicleId);
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

[**StartHvacSystemResponse**](StartHvacSystemResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stopCharge"></a>
# **stopCharge**
> StopChargingResponse stopCharge(vehicleId)

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
    StopChargingResponse result = apiInstance.stopCharge(vehicleId);
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

[**StopChargingResponse**](StopChargingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stopHVAC"></a>
# **stopHVAC**
> StopHvacSystemResponse stopHVAC(vehicleId)

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
    StopHvacSystemResponse result = apiInstance.stopHVAC(vehicleId);
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

[**StopHvacSystemResponse**](StopHvacSystemResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="toggleChargePort"></a>
# **toggleChargePort**
> OpenChargePortResponse toggleChargePort(vehicleId)

Open Charge Port

Opens the charge port. Does not close the charge port (for now...). This endpoint also unlocks the charge port if it&#39;s locked.

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    OpenChargePortResponse result = apiInstance.toggleChargePort(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#toggleChargePort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**OpenChargePortResponse**](OpenChargePortResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="toggleValetMode"></a>
# **toggleValetMode**
> SetValetModeResponse toggleValetMode(vehicleId, body)

Set Valet Mode

Sets valet mode on or off with a PIN to disable it from within the car. Reuses last PIN from previous valet session. Valet Mode limits the car&#39;s top speed to 70MPH and 80kW of acceleration power. It also disables Homelink, Bluetooth and Wifi settings, and the ability to disable mobile access to the car. It also hides your favorites, home, and work locations in navigation.

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
SetValetRequest body = new SetValetRequest(); // SetValetRequest | 
try {
    SetValetModeResponse result = apiInstance.toggleValetMode(vehicleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehicleCommandsApi#toggleValetMode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**| The id of the Vehicle. |
 **body** | [**SetValetRequest**](SetValetRequest.md)|  |

### Return type

[**SetValetModeResponse**](SetValetModeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unlockDoors"></a>
# **unlockDoors**
> UnlockDoorsResponse unlockDoors(vehicleId)

Unlock Doors

Unlock the car&#39;s doors.

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehicleCommandsApi;


VehicleCommandsApi apiInstance = new VehicleCommandsApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    UnlockDoorsResponse result = apiInstance.unlockDoors(vehicleId);
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

[**UnlockDoorsResponse**](UnlockDoorsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="wakeUpVehicle"></a>
# **wakeUpVehicle**
> WakeUpCarResponse wakeUpVehicle(vehicleId)

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
    WakeUpCarResponse result = apiInstance.wakeUpVehicle(vehicleId);
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

[**WakeUpCarResponse**](WakeUpCarResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


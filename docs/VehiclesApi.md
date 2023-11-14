# VehiclesApi

All URIs are relative to *https://owner-api.teslamotors.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getVehicle**](VehiclesApi.md#getVehicle) | **GET** api/1/vehicles/{vehicle_id} | Retrieve a vehicle
[**getVehicleChargeState**](VehiclesApi.md#getVehicleChargeState) | **GET** api/1/vehicles/{vehicle_id}/data_request/charge_state | Charge State
[**getVehicleClimateState**](VehiclesApi.md#getVehicleClimateState) | **GET** api/1/vehicles/{vehicle_id}/data_request/climate_state | Climate Settings
[**getVehicleConfig**](VehiclesApi.md#getVehicleConfig) | **GET** api/1/vehicles/{vehicle_id}/data_request/vehicle_config | Vehicle Config
[**getVehicleData**](VehiclesApi.md#getVehicleData) | **GET** api/1/vehicles/{vehicle_id}/vehicle_data | Vehicle Data
[**getVehicleDriveState**](VehiclesApi.md#getVehicleDriveState) | **GET** api/1/vehicles/{vehicle_id}/data_request/drive_state | Driving and Position
[**getVehicleMobileEnabled**](VehiclesApi.md#getVehicleMobileEnabled) | **GET** api/1/vehicles/{vehicle_id}/mobile_enabled | Mobile Access
[**getVehicleState**](VehiclesApi.md#getVehicleState) | **GET** api/1/vehicles/{vehicle_id}/data_request/vehicle_state | Vehicle State
[**getVehicles**](VehiclesApi.md#getVehicles) | **GET** api/1/vehicles | List all Vehicles
[**getVehilceGuiSettings**](VehiclesApi.md#getVehilceGuiSettings) | **GET** api/1/vehicles/{vehicle_id}/data_request/gui_settings | GUI Settings
[**nearbyChargers**](VehiclesApi.md#nearbyChargers) | **GET** api/1/vehicles/{vehicle_id}/nearby_charging_sites | Get Nearby Chargers

<a name="getVehicle"></a>
# **getVehicle**
> VehicleResponse getVehicle(vehicleId)

Retrieve a vehicle

Retrieve a specific vehicle

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehiclesApi;


VehiclesApi apiInstance = new VehiclesApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    VehicleResponse result = apiInstance.getVehicle(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehiclesApi#getVehicle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**VehicleResponse**](VehicleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVehicleChargeState"></a>
# **getVehicleChargeState**
> ChargeStateResponse getVehicleChargeState(vehicleId)

Charge State

Returns the state of charge in the battery.

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehiclesApi;


VehiclesApi apiInstance = new VehiclesApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    ChargeStateResponse result = apiInstance.getVehicleChargeState(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehiclesApi#getVehicleChargeState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**ChargeStateResponse**](ChargeStateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVehicleClimateState"></a>
# **getVehicleClimateState**
> ClimateSettingsResponse getVehicleClimateState(vehicleId)

Climate Settings

Returns the current temperature and climate control state.

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehiclesApi;


VehiclesApi apiInstance = new VehiclesApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    ClimateSettingsResponse result = apiInstance.getVehicleClimateState(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehiclesApi#getVehicleClimateState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**ClimateSettingsResponse**](ClimateSettingsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVehicleConfig"></a>
# **getVehicleConfig**
> VehicleConfigResponse getVehicleConfig(vehicleId)

Vehicle Config

Returns the vehicle&#x27;s configuration

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehiclesApi;


VehiclesApi apiInstance = new VehiclesApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    VehicleConfigResponse result = apiInstance.getVehicleConfig(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehiclesApi#getVehicleConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**VehicleConfigResponse**](VehicleConfigResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVehicleData"></a>
# **getVehicleData**
> VehicleDataResponse getVehicleData(vehicleId, endpoints)

Vehicle Data

Returns all vehicle ∂ata, potentially cached

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehiclesApi;


VehiclesApi apiInstance = new VehiclesApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
String endpoints = "endpoints_example"; // String | 
try {
    VehicleDataResponse result = apiInstance.getVehicleData(vehicleId, endpoints);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehiclesApi#getVehicleData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**| The id of the Vehicle. |
 **endpoints** | **String**|  | [optional]

### Return type

[**VehicleDataResponse**](VehicleDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVehicleDriveState"></a>
# **getVehicleDriveState**
> DriveStateResponse getVehicleDriveState(vehicleId)

Driving and Position

Returns the driving and position state of the vehicle.

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehiclesApi;


VehiclesApi apiInstance = new VehiclesApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    DriveStateResponse result = apiInstance.getVehicleDriveState(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehiclesApi#getVehicleDriveState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**DriveStateResponse**](DriveStateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVehicleMobileEnabled"></a>
# **getVehicleMobileEnabled**
> MobileAccessResponse getVehicleMobileEnabled(vehicleId)

Mobile Access

Determines if mobile access to the vehicle is enabled.

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehiclesApi;


VehiclesApi apiInstance = new VehiclesApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    MobileAccessResponse result = apiInstance.getVehicleMobileEnabled(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehiclesApi#getVehicleMobileEnabled");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**MobileAccessResponse**](MobileAccessResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVehicleState"></a>
# **getVehicleState**
> VehicleStateResponse getVehicleState(vehicleId)

Vehicle State

Returns the vehicle&#x27;s physical state, such as which doors are open.

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehiclesApi;


VehiclesApi apiInstance = new VehiclesApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    VehicleStateResponse result = apiInstance.getVehicleState(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehiclesApi#getVehicleState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**VehicleStateResponse**](VehicleStateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVehicles"></a>
# **getVehicles**
> GetVehiclesResponse getVehicles()

List all Vehicles

Retrieve a list of your owned vehicles (includes vehicles not yet shipped!)

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehiclesApi;


VehiclesApi apiInstance = new VehiclesApi();
try {
    GetVehiclesResponse result = apiInstance.getVehicles();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehiclesApi#getVehicles");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetVehiclesResponse**](GetVehiclesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVehilceGuiSettings"></a>
# **getVehilceGuiSettings**
> GuistateResponse getVehilceGuiSettings(vehicleId)

GUI Settings

Returns various information about the GUI settings of the car, such as unit format and range display.

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehiclesApi;


VehiclesApi apiInstance = new VehiclesApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    GuistateResponse result = apiInstance.getVehilceGuiSettings(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehiclesApi#getVehilceGuiSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**GuistateResponse**](GuistateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="nearbyChargers"></a>
# **nearbyChargers**
> NearbyChargerResponse nearbyChargers(vehicleId)

Get Nearby Chargers

Get a list of nearby charging sites

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.VehiclesApi;


VehiclesApi apiInstance = new VehiclesApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    NearbyChargerResponse result = apiInstance.nearbyChargers(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehiclesApi#nearbyChargers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vehicleId** | **String**| The id of the Vehicle. |

### Return type

[**NearbyChargerResponse**](NearbyChargerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


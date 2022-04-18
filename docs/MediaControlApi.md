# MediaControlApi

All URIs are relative to *https://owner-api.teslamotors.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mediaNextFavorite**](MediaControlApi.md#mediaNextFavorite) | **POST** api/1/vehicles/{vehicle_id}/command/media_next_fav | Next Favorite
[**mediaNextTrack**](MediaControlApi.md#mediaNextTrack) | **POST** api/1/vehicles/{vehicle_id}/command/media_next_track | Next Track
[**mediaPrevFavorite**](MediaControlApi.md#mediaPrevFavorite) | **POST** api/1/vehicles/{vehicle_id}/command/media_prev_fav | Previous Favorite
[**mediaPrevTrack**](MediaControlApi.md#mediaPrevTrack) | **POST** api/1/vehicles/{vehicle_id}/command/media_prev_track | Previous Track
[**mediaTogglePlayback**](MediaControlApi.md#mediaTogglePlayback) | **POST** api/1/vehicles/{vehicle_id}/command/media_toggle_playback | Pause/Play Media
[**mediaVolumeDown**](MediaControlApi.md#mediaVolumeDown) | **POST** api/1/vehicles/{vehicle_id}/command/media_volume_down | Volume Down
[**mediaVolumeUp**](MediaControlApi.md#mediaVolumeUp) | **POST** api/1/vehicles/{vehicle_id}/command/media_volume_up | Volume Up

<a name="mediaNextFavorite"></a>
# **mediaNextFavorite**
> CommandResponse mediaNextFavorite(vehicleId)

Next Favorite

Next Favorite

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.MediaControlApi;


MediaControlApi apiInstance = new MediaControlApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.mediaNextFavorite(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaControlApi#mediaNextFavorite");
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

<a name="mediaNextTrack"></a>
# **mediaNextTrack**
> CommandResponse mediaNextTrack(vehicleId)

Next Track

Next Track

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.MediaControlApi;


MediaControlApi apiInstance = new MediaControlApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.mediaNextTrack(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaControlApi#mediaNextTrack");
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

<a name="mediaPrevFavorite"></a>
# **mediaPrevFavorite**
> CommandResponse mediaPrevFavorite(vehicleId)

Previous Favorite

Previous Favorite

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.MediaControlApi;


MediaControlApi apiInstance = new MediaControlApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.mediaPrevFavorite(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaControlApi#mediaPrevFavorite");
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

<a name="mediaPrevTrack"></a>
# **mediaPrevTrack**
> CommandResponse mediaPrevTrack(vehicleId)

Previous Track

Previous Track

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.MediaControlApi;


MediaControlApi apiInstance = new MediaControlApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.mediaPrevTrack(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaControlApi#mediaPrevTrack");
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

<a name="mediaTogglePlayback"></a>
# **mediaTogglePlayback**
> CommandResponse mediaTogglePlayback(vehicleId)

Pause/Play Media

Pause/Play Media

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.MediaControlApi;


MediaControlApi apiInstance = new MediaControlApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.mediaTogglePlayback(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaControlApi#mediaTogglePlayback");
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

<a name="mediaVolumeDown"></a>
# **mediaVolumeDown**
> CommandResponse mediaVolumeDown(vehicleId)

Volume Down

Volume Down

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.MediaControlApi;


MediaControlApi apiInstance = new MediaControlApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.mediaVolumeDown(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaControlApi#mediaVolumeDown");
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

<a name="mediaVolumeUp"></a>
# **mediaVolumeUp**
> CommandResponse mediaVolumeUp(vehicleId)

Volume Up

Volume Up

### Example
```java
// Import classes:
//import com.github.jonahwh.ApiException;
//import com.github.jonahwh.tesla_api_client.MediaControlApi;


MediaControlApi apiInstance = new MediaControlApi();
String vehicleId = "vehicleId_example"; // String | The id of the Vehicle.
try {
    CommandResponse result = apiInstance.mediaVolumeUp(vehicleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MediaControlApi#mediaVolumeUp");
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


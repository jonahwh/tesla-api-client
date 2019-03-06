package com.github.jonahwh.tesla_api_client;

import com.github.jonahwh.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.github.jonahwh.tesla_api_client.model.CommandResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface MediaControlApi {
  /**
   * Next Favorite
   * Next Favorite
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/media_next_fav")
  Call<CommandResponse> mediaNextFavorite(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Next Track
   * Next Track
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/media_next_track")
  Call<CommandResponse> mediaNextTrack(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Previous Favorite
   * Previous Favorite
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/media_prev_fav")
  Call<CommandResponse> mediaPrevFavorite(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Previous Track
   * Previous Track
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/media_prev_track")
  Call<CommandResponse> mediaPrevTrack(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Pause/Play Media
   * Pause/Play Media
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/media_toggle_playback")
  Call<CommandResponse> mediaTogglePlayback(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Volume Down
   * Volume Down
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/media_volume_down")
  Call<CommandResponse> mediaVolumeDown(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

  /**
   * Volume Up
   * Volume Up
   * @param vehicleId The id of the Vehicle. (required)
   * @return Call&lt;CommandResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("api/1/vehicles/{vehicle_id}/command/media_volume_up")
  Call<CommandResponse> mediaVolumeUp(
    @retrofit2.http.Path("vehicle_id") String vehicleId
  );

}

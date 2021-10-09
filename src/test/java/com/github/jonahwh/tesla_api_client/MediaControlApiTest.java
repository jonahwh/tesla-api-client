package com.github.jonahwh.tesla_api_client;

import com.github.jonahwh.ApiClient;
import com.github.jonahwh.tesla_api_client.model.CommandResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MediaControlApi
 */
public class MediaControlApiTest {

    private MediaControlApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MediaControlApi.class);
    }

    /**
     * Next Favorite
     *
     * Next Favorite
     */
    @Test
    public void mediaNextFavoriteTest() {
        String vehicleId = null;
        // CommandResponse response = api.mediaNextFavorite(vehicleId);

        // TODO: test validations
    }
    /**
     * Next Track
     *
     * Next Track
     */
    @Test
    public void mediaNextTrackTest() {
        String vehicleId = null;
        // CommandResponse response = api.mediaNextTrack(vehicleId);

        // TODO: test validations
    }
    /**
     * Previous Favorite
     *
     * Previous Favorite
     */
    @Test
    public void mediaPrevFavoriteTest() {
        String vehicleId = null;
        // CommandResponse response = api.mediaPrevFavorite(vehicleId);

        // TODO: test validations
    }
    /**
     * Previous Track
     *
     * Previous Track
     */
    @Test
    public void mediaPrevTrackTest() {
        String vehicleId = null;
        // CommandResponse response = api.mediaPrevTrack(vehicleId);

        // TODO: test validations
    }
    /**
     * Pause/Play Media
     *
     * Pause/Play Media
     */
    @Test
    public void mediaTogglePlaybackTest() {
        String vehicleId = null;
        // CommandResponse response = api.mediaTogglePlayback(vehicleId);

        // TODO: test validations
    }
    /**
     * Volume Down
     *
     * Volume Down
     */
    @Test
    public void mediaVolumeDownTest() {
        String vehicleId = null;
        // CommandResponse response = api.mediaVolumeDown(vehicleId);

        // TODO: test validations
    }
    /**
     * Volume Up
     *
     * Volume Up
     */
    @Test
    public void mediaVolumeUpTest() {
        String vehicleId = null;
        // CommandResponse response = api.mediaVolumeUp(vehicleId);

        // TODO: test validations
    }
}

package com.music.streaming.platform.controller;


import com.music.streaming.platform.dto.TrackRequest;
import com.music.streaming.platform.model.Track;
import com.music.streaming.platform.service.TrackService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/music/platform/v1/tracks")
public class TrackController {

    private TrackService service;

    public TrackController(TrackService service) {
        this.service = service;
    }


    @PostMapping
    public Track createTrack(@RequestBody TrackRequest track) {
        return service.createTrack(track);
    }


    @GetMapping
    public List<Track> getTracks() {
        return service.getAllTracks();
    }


    @GetMapping("/{trackId}")
    public Track getTrackById(@PathVariable long trackId) {
        return service.getTrackById(trackId);
    }


    @PutMapping("/{trackId}")
    public Track updateTrack(@PathVariable long trackId, @RequestBody TrackRequest trackRequest) {
        return service.updateTrack(trackId, trackRequest);
    }


    @DeleteMapping("/{trackId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTrackById(@PathVariable long trackId) {
        service.deleteTrack(trackId);
    }
}

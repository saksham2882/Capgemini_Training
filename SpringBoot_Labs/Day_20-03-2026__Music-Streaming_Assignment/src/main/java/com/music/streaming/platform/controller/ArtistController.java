package com.music.streaming.platform.controller;

import com.music.streaming.platform.dto.ArtistRequest;
import com.music.streaming.platform.model.Artist;
import com.music.streaming.platform.service.ArtistService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("music/platform/v1/artists")
public class ArtistController {

    private ArtistService service;

    public ArtistController(ArtistService service) {
        this.service = service;
    }

    @PostMapping
    public Artist createArtist(@RequestBody ArtistRequest artist) {
        return service.createArtist(artist);
    }


    @GetMapping
    public List<Artist> getAllArtist(){
        return service.getAllArtists();
    }


    @GetMapping("/{artistId}")
    public Artist getArtistById(@PathVariable long artistId) {
        return service.getArtistById(artistId);
    }


    @PutMapping("/{artistId}")
    public Artist updateArtist(@PathVariable long artistId, @RequestBody ArtistRequest artist) {
        return service.updateArtist(artistId, artist);
    }


    @DeleteMapping("/{artistId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteArtistById(@PathVariable long artistId) {
        service.deleteArtist(artistId);
    }
}

package com.music.streaming.platform.controller;


import com.music.streaming.platform.dto.PlayListRequest;
import com.music.streaming.platform.model.PlayList;
import com.music.streaming.platform.service.PlayListService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/music/platform/v1/playlists")
public class PlayListController {

    private PlayListService service;

    public PlayListController(PlayListService service) {
        this.service = service;
    }


    @PostMapping
    public PlayList addPlayList(@RequestBody PlayListRequest p){
        return service.createPlayList(p);
    }


    @GetMapping("/{artistId}")
    public PlayList getPlayListById(@PathVariable long artistId){
        return service.getPlayListById(artistId);
    }


    @DeleteMapping("/{artistId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePlayList(@PathVariable long artistId){
        service.deletePlayList(artistId);
    }
}

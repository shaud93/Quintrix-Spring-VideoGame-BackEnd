package com.quintrix.jfs.quintrixspring.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.quintrix.jfs.quintrixspring.model.VideoGame;
import com.quintrix.jfs.quintrixspring.service.VideoGameService;

@RestController
public class VideoGameController {

  // instance
  @Autowired
  VideoGameService videogameservice;

  public VideoGameController(VideoGameService videogameservice) {
    super();
    this.videogameservice = videogameservice;
  }

  // Post to DB
  @PostMapping("/game/add")
  public VideoGame addGame(@RequestBody VideoGame videogame) {
    return videogameservice.addGame(videogame);
  }

  // return all games
  @GetMapping("/game/all")
  public List<VideoGame> getAllGames() {
    return videogameservice.getAllGames();
  }
}

package com.quintrix.jfs.quintrixspring.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
  public ResponseEntity<VideoGame> addGame(@RequestBody VideoGame videogame) {
    return new ResponseEntity<VideoGame>(videogameservice.addGame(videogame), HttpStatus.CREATED);
  }

  // return all games
  @GetMapping("/game/all")
  public List<VideoGame> getAllGames() {
    return videogameservice.getAllGames();
  }

  // Get Game By Id
  @GetMapping("game/{id}")
  public ResponseEntity<VideoGame> getGameById(@PathVariable("id") Long id) {
    return new ResponseEntity<VideoGame>(videogameservice.getById(id), HttpStatus.OK);

  }

  // Update Game
  @PutMapping("game/{id}/update")
  public ResponseEntity<VideoGame> updateGame(@RequestBody VideoGame videogame,
      @PathVariable("id") Long id) {
    return new ResponseEntity<VideoGame>(videogameservice.UpdateGame(videogame, id),
        HttpStatus.CREATED);
  }
}

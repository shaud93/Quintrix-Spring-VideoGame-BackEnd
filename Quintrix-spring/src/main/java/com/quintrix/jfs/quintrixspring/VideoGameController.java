package com.quintrix.jfs.quintrixspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoGameController {

  @GetMapping("/game")
  public VideoGame getGame() {
    return new VideoGame("Elden Ring", "From Software", 2022L, true, true, true, true);
  }

}

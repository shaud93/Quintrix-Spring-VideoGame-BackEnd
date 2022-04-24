package com.quintrix.jfs.quintrixspring;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoGameController {

  // return the game titled Elden ring
  @GetMapping("/test")
  public VideoGame getTest() {
    return new VideoGame("Elden Ring", "From Software", 2022L, true, true, true, true);
  }

  // Rest With List Example
  @GetMapping("test/allgames")
  public List<VideoGame> getAllGames() {
    List<VideoGame> videoGames = new ArrayList<>();
    videoGames.add(new VideoGame("Elden Ring", "From Software", 2022L, true, true, true, true));
    videoGames
        .add(new VideoGame("Apex Legends", "Respawn Entertainment", 2020L, true, true, true, true));
    videoGames.add(new VideoGame("PUBG", "Krafton, inc", 2017L, true, true, true, true));
    videoGames.add(new VideoGame("Halo", "From Infinite", 2021L, true, true, false, true));
    videoGames
        .add(new VideoGame("God Of War", "Santa Monica Studio", 2022L, true, false, true, true));
    return videoGames;
  }

  // PathVariable Example
  @GetMapping("test/{title}")
  public VideoGame getGame(@PathVariable("title") String title) {
    return new VideoGame(title, "TestStudio", 2022, true, true, true, true);
  }

  // QueryParams Example
  @GetMapping("/test/query")
  public VideoGame gameQueryParam(@RequestParam(name = "title") String title,
      @RequestParam(name = "year") Long year) {
    return new VideoGame(title, "TestStudio", year, false, false, false, false);
  }

  @PostMapping("/test/post")
  public VideoGame gamePost(@RequestBody VideoGame post) {
    return post;
  }

}

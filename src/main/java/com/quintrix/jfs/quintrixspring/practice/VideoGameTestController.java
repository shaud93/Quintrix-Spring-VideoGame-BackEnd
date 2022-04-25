package com.quintrix.jfs.quintrixspring.practice;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoGameTestController {

  // return the game titled Elden ring
  @GetMapping("/test")
  public VideoGameTest getTest() {
    return new VideoGameTest("Elden Ring", "From Software", 2022L, true, true, true, true);
  }

  // Rest With List Example
  @GetMapping("test/allgames")
  public List<VideoGameTest> getAllGames() {
    List<VideoGameTest> videoGames = new ArrayList<>();
    videoGames.add(new VideoGameTest("Elden Ring", "From Software", 2022L, true, true, true, true));
    videoGames
        .add(new VideoGameTest("Apex Legends", "Respawn Entertainment", 2020L, true, true, true, true));
    videoGames.add(new VideoGameTest("PUBG", "Krafton, inc", 2017L, true, true, true, true));
    videoGames.add(new VideoGameTest("Halo", "From Infinite", 2021L, true, true, false, true));
    videoGames
        .add(new VideoGameTest("God Of War", "Santa Monica Studio", 2022L, true, false, true, true));
    return videoGames;
  }

  // PathVariable Example
  @GetMapping("test/{title}")
  public VideoGameTest getGame(@PathVariable("title") String title) {
    return new VideoGameTest(title, "TestStudio", 2022, true, true, true, true);
  }

  // QueryParams Example
  @GetMapping("/test/query")
  public VideoGameTest gameQueryParam(@RequestParam(name = "title") String title,
      @RequestParam(name = "year") Long year) {
    return new VideoGameTest(title, "TestStudio", year, false, false, false, false);
  }

  // Post Example
  @PostMapping("/test/post")
  public VideoGameTest gamePost(@RequestBody VideoGameTest post) {
    return post;
  }

}

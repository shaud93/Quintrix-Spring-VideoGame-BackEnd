package com.quintrix.jfs.quintrixspring.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.quintrix.jfs.quintrixspring.model.VideoGame;
import com.quintrix.jfs.quintrixspring.respository.VideoGameRepository;

@Service
public class VideoGameService {

  @Autowired
  VideoGameRepository Repository;

  public VideoGame addGame(VideoGame videogame) {
    return Repository.save(videogame);
  }

  public List<VideoGame> getAllGames() {
    return Repository.findAll();
  }

}

package com.quintrix.jfs.quintrixspring.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.quintrix.jfs.quintrixspring.exception.ResourceNotFoundException;
import com.quintrix.jfs.quintrixspring.model.VideoGame;
import com.quintrix.jfs.quintrixspring.respository.VideoGameRepository;
import com.quintrix.jfs.quintrixspring.service.VideoGameService;

@Service
public class VideoGameServiceImpl implements VideoGameService {

  @Autowired
  VideoGameRepository Repository;

  @Override
  public VideoGame addGame(VideoGame videogame) {
    return Repository.save(videogame);
  }

  @Override
  public List<VideoGame> getAllGames() {
    return Repository.findAll();
  }

  @Override
  public VideoGame getById(Long id) {
    Optional<VideoGame> game = Repository.findById(id);

    // if (game.isEmpty()) {
    // throw new ResourceNotFoundException("VideoGame", "ID", id);
    // } else {
    // return game.get();
    // }
    return Repository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("VideoGame", "ID", id));
  }

}

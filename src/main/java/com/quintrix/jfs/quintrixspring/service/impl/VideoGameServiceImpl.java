package com.quintrix.jfs.quintrixspring.service.impl;

import java.util.List;
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
    VideoGame game = Repository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("VideoGame", "ID", id));

    // if (game.isEmpty()) {
    // throw new ResourceNotFoundException("VideoGame", "ID", id);
    // } else {
    // return game.get();
    // }
    return game;
  }

  @Override
  public VideoGame UpdateGame(VideoGame videogame, Long id) {
    VideoGame updateGame = getById(id);

    updateGame.setMultiPlayer(videogame.getMultiPlayer());
    updateGame.setPc(videogame.getPc());
    updateGame.setPlayStation(videogame.getPlayStation());
    updateGame.setRelease_year(videogame.getRelease_year());
    updateGame.setStudio(videogame.getStudio());
    updateGame.setTitle(videogame.getTitle());
    updateGame.setXbox(videogame.getXbox());
    Repository.save(updateGame);
    return updateGame;
  }

}

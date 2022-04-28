package com.quintrix.jfs.quintrixspring.service;

import java.util.List;
import com.quintrix.jfs.quintrixspring.model.VideoGame;


public interface VideoGameService {

  VideoGame addGame(VideoGame videogame);

  List<VideoGame> getAllGames();

  VideoGame getById(Long id);

  VideoGame UpdateGame(VideoGame videogame, Long id);

  void deleteGame(Long id);
}

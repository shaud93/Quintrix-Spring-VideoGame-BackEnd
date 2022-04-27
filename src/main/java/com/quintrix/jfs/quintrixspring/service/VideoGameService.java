package com.quintrix.jfs.quintrixspring.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.quintrix.jfs.quintrixspring.model.VideoGame;

@Service
public interface VideoGameService {

  VideoGame addGame(VideoGame videogame);

  List<VideoGame> getAllGames();
}

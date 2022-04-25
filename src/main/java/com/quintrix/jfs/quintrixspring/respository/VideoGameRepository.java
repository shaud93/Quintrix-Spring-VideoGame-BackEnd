package com.quintrix.jfs.quintrixspring.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quintrix.jfs.quintrixspring.model.VideoGame;

// Repository
public interface VideoGameRepository extends JpaRepository<VideoGame, Long> {

}

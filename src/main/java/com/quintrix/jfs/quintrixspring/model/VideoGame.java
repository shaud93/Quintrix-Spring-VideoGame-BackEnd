package com.quintrix.jfs.quintrixspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "videogames")
public class VideoGame {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name = "title")
  private String title;

  @Column(name = "studio")
  private String studio;

  @Column(name = "release_year")
  private long release_year;

  @Column(name = "multiPlayer")
  private Boolean multiPlayer;

  @Column(name = "xbox")
  private Boolean xbox;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getStudio() {
    return studio;
  }

  public void setStudio(String studio) {
    this.studio = studio;
  }

  public long getRelease_year() {
    return release_year;
  }

  public void setRelease_year(long release_year) {
    this.release_year = release_year;
  }

  public Boolean getMultiPlayer() {
    return multiPlayer;
  }

  public void setMultiPlayer(Boolean multiPlayer) {
    this.multiPlayer = multiPlayer;
  }

  public Boolean getXbox() {
    return xbox;
  }

  public void setXbox(Boolean xbox) {
    this.xbox = xbox;
  }

  public Boolean getPlayStation() {
    return playStation;
  }

  public void setPlayStation(Boolean playStation) {
    this.playStation = playStation;
  }

  public Boolean getPc() {
    return pc;
  }

  public void setPc(Boolean pc) {
    this.pc = pc;
  }

  @Column(name = "playStation")
  private Boolean playStation;

  @Column(name = "pc")
  private Boolean pc;
}

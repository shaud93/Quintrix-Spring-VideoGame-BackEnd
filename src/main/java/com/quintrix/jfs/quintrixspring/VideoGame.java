package com.quintrix.jfs.quintrixspring;

public class VideoGame {
  private String title;
  private String studio;
  private long year;
  private Boolean multiPlayer;
  private Boolean xbox;
  private Boolean playstation;
  private Boolean pc;

  // Constructor
  public VideoGame(String title, String studio, long year, Boolean multiPlayer, Boolean xbox,
      Boolean playstation, Boolean pc) {
    super();
    this.title = title;
    this.studio = studio;
    this.year = year;
    this.multiPlayer = multiPlayer;
    this.xbox = xbox;
    this.playstation = playstation;
    this.pc = pc;
  }

  // Getters
  public String getTitle() {
    return title;
  }

  public String getStudio() {
    return studio;
  }

  public long getYear() {
    return year;
  }

  public Boolean getMultiPlayer() {
    return multiPlayer;
  }

  public Boolean getXbox() {
    return xbox;
  }

  public Boolean getPlaystation() {
    return playstation;
  }

  public Boolean getPc() {
    return pc;
  }


  // Setters
  public void setTitle(String title) {
    this.title = title;
  }

  public void setStudio(String studio) {
    this.studio = studio;
  }

  public void setYear(long year) {
    this.year = year;
  }

  public void setMultiPlayer(Boolean multiPlayer) {
    this.multiPlayer = multiPlayer;
  }

  public void setXbox(Boolean xbox) {
    this.xbox = xbox;
  }

  public void setPlaystation(Boolean playstation) {
    this.playstation = playstation;
  }

  public void setPc(Boolean pc) {
    this.pc = pc;
  }


}

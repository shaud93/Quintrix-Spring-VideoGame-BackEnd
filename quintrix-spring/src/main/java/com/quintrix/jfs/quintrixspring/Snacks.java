package com.quintrix.jfs.quintrixspring;

public class Snacks {
  private String snackName;
  private Float snackPrice;
  
  //Constructor
  public Snacks(String snackName, Float snackPrice) {
    super();
    this.snackName = snackName;
    this.snackPrice = snackPrice;
  }
  
  //Getters
  public String getSnackName() {
    return snackName;
  }

  public Float getSnackPrice() {
    return snackPrice;
  }

  //Setters
  public void setSnackPrice(Float snackPrice) {
    this.snackPrice = snackPrice;
  }
  
  public void setSnackName(String snackName) {
    this.snackName = snackName;
  }
}

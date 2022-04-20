package com.quintrix.jfs.quintrixspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SnackController {

  @GetMapping("/snacks")
  public Snacks getSnack() {
    return new Snacks("Resses", 1.00f);
  }

}

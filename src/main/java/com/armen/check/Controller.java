package com.armen.check;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @GetMapping("check")
  public String get() {
    return "Hello, status 200 OK";
  }
}

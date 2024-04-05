package org.hasib.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {

  @RequestMapping("m")
  public static String myMethod() {
    return "Democontroller";
  }
}

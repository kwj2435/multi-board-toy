package com.uijin.mboard.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/oauth")
public class AuthController {

  @GetMapping("/kakao/callback")
  public void kakaoCallback() {

  }
}

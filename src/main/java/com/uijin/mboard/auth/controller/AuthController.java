package com.uijin.mboard.auth.controller;

import com.uijin.mboard.auth.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/oauth")
public class AuthController {

  private final AuthService authService;

  @GetMapping("/kakao/callback")
  public void kakaoCallback() {

  }
}

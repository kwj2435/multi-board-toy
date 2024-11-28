package com.uijin.mboard.auth.controller;

import com.uijin.mboard.user.service.UserService;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/oauth")
public class AuthController {

  private final UserService userService;

  @GetMapping("/kakao/callback")
  public void kakaoCallback(
      @RequestParam("code") String code,
      HttpServletResponse response) throws IOException {

    userService.kakaoLogin(code);
    response.sendRedirect("/board");
  }
}

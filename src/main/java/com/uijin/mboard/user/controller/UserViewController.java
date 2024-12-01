package com.uijin.mboard.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class UserViewController {

  @Value("${kakao.oauth.client-id}")
  private String clientId;

  @Value("${kakao.oauth.redirect-uri}")
  private String redirectUri;

  @GetMapping("/login/kakao")
  public String login(Model model) {
    String kakaoAuthDomain = "https://kauth.kakao.com/oauth/authorize";
    String responseType = "code";

    String kakaoLoginUrl = kakaoAuthDomain + "?" +
        "response_type=" + responseType +
        "&client_id=" + clientId +
        "&redirect_uri=" + redirectUri;

    model.addAttribute("kakaoLoginUri", kakaoLoginUrl);

    return "kakaoLogin";
  }
}

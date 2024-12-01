package com.uijin.mboard.auth.service;

import com.uijin.mboard.auth.external.KakaoApiClient;
import com.uijin.mboard.auth.external.KakaoOauthClient;
import com.uijin.mboard.auth.model.KakaoModel.KakaoMemberInfo;
import com.uijin.mboard.auth.model.KakaoModel.KakaoOauthToken;
import com.uijin.mboard.user.model.UserModel.User;
import com.uijin.mboard.user.repository.UserRepository;
import com.uijin.mboard.user.service.UserService;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class AuthService {

  @Value("${kakao.oauth.client-id}")
  private String clientId;
  @Value("${kakao.oauth.redirect-uri}")
  private String redirectUri;

  private final KakaoOauthClient kakaoOauthClient;
  private final KakaoApiClient kakaoApiClient;

  private final UserService userService;

  public User kakaoLogin(String code) {
    log.info("Call Method [kakaoLogin], params [{}]", code);

    KakaoOauthToken kakaoToken = kakaoOauthClient.getKakaoToken(
        "authorization_code",
        clientId,
        redirectUri,
        code
    );

    String authorization = "Bearer " + kakaoToken.getAccessToken();
    KakaoMemberInfo kakaoMemberInfo = kakaoApiClient.getKakaoMemberInfo(authorization);

    String snsId = String.valueOf(kakaoMemberInfo.getId());
    String nickname = kakaoMemberInfo.getKakaoAccount().getProfile().getNickname();

    if(userService.isAlreadyRegistered(snsId)) {
      return User.builder().build();
    } else {
      return userService.addUser(snsId, nickname);
    }
  }
}


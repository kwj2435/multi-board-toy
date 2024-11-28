package com.uijin.mboard.user.service;

import com.uijin.mboard.user.model.UserModel.User;
import com.uijin.mboard.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepository userRepository;

  public User kakaoLogin(String code) {
    return User.builder().build();
  }
}

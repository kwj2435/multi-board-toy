package com.uijin.mboard.user.service;

import com.uijin.mboard.user.entity.UserEntity;
import com.uijin.mboard.user.model.UserModel.User;
import com.uijin.mboard.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class UserService {

  private final UserRepository userRepository;

  public User addUser(String snsId, String nickname) {
    UserEntity userEntity = UserEntity.of(snsId, nickname);
    UserEntity savedUser = userRepository.save(userEntity);

    return User.from(savedUser);
  }

  public boolean isAlreadyRegistered(String snsId) {
    return userRepository.findBySnsId(snsId).isPresent();
  }
}

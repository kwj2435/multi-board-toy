package com.uijin.mboard.user.model;

import com.uijin.mboard.user.entity.UserEntity;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class UserModel {

  @Getter
  @AllArgsConstructor
  @NoArgsConstructor
  @Builder
  public static class User {
    private String nickname;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

    public static User from(UserEntity userEntity) {
      return User.builder()
          .nickname(userEntity.getNickname())
          .createdDate(userEntity.getCreatedTime())
          .updatedDate(userEntity.getUpdatedTime())
          .build();
    }
  }
}

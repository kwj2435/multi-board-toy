package com.uijin.mboard.user.entity;

import com.uijin.mboard.user.enums.UserStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "USERS")
public class UserEntity {
  @Id
  @Column(name = "USER_ID")
  private Long userId;

  @Column(name = "SNS_ID")
  private String snsId;

  @Column(name = "NICKNAME")
  private String nickname;

  @Column(name = "STATUS")
  @Enumerated(EnumType.STRING)
  private UserStatus status;

  @Column(name = "CREATED_TIME")
  private LocalDateTime createdTime;

  @Column(name = "UPDATED_TIME")
  private LocalDateTime updatedTime;
}

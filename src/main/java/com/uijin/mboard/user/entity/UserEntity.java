package com.uijin.mboard.user.entity;

import com.uijin.mboard.user.enums.UserStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "USERS")
public class UserEntity {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
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
  @CreationTimestamp
  private LocalDateTime createdTime;

  @Column(name = "UPDATED_TIME")
  @UpdateTimestamp
  private LocalDateTime updatedTime;

  public static UserEntity of(String snsId, String nickname) {
    return UserEntity.builder()
        .snsId(snsId)
        .nickname(nickname)
        .status(UserStatus.NORMAL)
        .build();
  }
}

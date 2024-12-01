package com.uijin.mboard.user.repository;

import com.uijin.mboard.user.entity.UserEntity;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
  Optional<UserEntity> findBySnsId(String snsId);
}

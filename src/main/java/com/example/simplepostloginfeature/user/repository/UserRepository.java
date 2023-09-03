package com.example.simplepostloginfeature.user.repository;

import com.example.simplepostloginfeature.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

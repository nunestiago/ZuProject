package com.sunkenship.zup.repos;

import com.sunkenship.zup.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

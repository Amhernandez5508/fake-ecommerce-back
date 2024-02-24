package com.hernandezalejandro.apiloginforjs.repository;

import com.hernandezalejandro.apiloginforjs.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

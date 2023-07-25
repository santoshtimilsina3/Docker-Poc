package com.doc.mavendocker.repository;

import com.doc.mavendocker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}

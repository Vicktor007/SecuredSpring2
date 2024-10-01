package com.vic.SecuredSpring2.Repository;

import com.vic.SecuredSpring2.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
            Users findByUsername(String username);
}

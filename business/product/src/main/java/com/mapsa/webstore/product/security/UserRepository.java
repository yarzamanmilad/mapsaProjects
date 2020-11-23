package com.mapsa.webstore.product.security;

import com.mapsa.webstore.product.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String userName);
}

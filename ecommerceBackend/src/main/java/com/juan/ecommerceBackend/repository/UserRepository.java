package com.juan.ecommerceBackend.repository;

import com.juan.ecommerceBackend.models.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<user,Long> {
}

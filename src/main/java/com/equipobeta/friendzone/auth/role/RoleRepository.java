package com.equipobeta.friendzone.auth.role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository {
    Optional<Role> findByName(ERole name);
}
package com.codecool.ibuy.Repository;

import com.codecool.ibuy.Model.ERole;
import com.codecool.ibuy.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}

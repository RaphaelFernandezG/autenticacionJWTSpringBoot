package io.getarrays.userservicejwt.repo;

import io.getarrays.userservicejwt.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}

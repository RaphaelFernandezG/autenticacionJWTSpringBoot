package io.getarrays.userservicejwt.repo;

import io.getarrays.userservicejwt.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo extends JpaRepository<Users, Long> {

    Users findByUsername(String username);
}

package io.getarrays.userservicejwt.service;

import io.getarrays.userservicejwt.domain.Role;
import io.getarrays.userservicejwt.domain.Users;

import java.util.List;

public interface UserService {
    Users saveUser(Users users);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    Users getUser(String username);
    List<Users> getUsers();
}

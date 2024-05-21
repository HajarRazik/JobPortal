package com.jobs.portal.security.Services;

import com.jobs.portal.security.Entities.Role;
import com.jobs.portal.security.Entities.User;
import org.springframework.stereotype.Service;

@Service
public interface AccountService {

    User CreateUser(String username, String password, String email,String ConfirmPassword);
    Role CreateRole(String newRole);
    void AddRoleToUser(String username, String newRole);
    void RemoveRoleFromUser(String username, String newRole);
    User loadUserByUsername(String username);
    User GetUserByUsername(String username);
}

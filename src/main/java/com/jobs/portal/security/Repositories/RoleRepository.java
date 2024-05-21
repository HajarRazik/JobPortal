package com.jobs.portal.security.Repositories;

import com.jobs.portal.security.Entities.Role;
import com.jobs.portal.security.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {
    Role findByRole(String name);
}

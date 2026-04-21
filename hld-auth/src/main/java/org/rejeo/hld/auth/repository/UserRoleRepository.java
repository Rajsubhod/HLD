package org.rejeo.hld.auth.repository;

import org.rejeo.hld.auth.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {
}

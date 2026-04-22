package org.rejeo.hld.auth.repository;

import org.rejeo.hld.auth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<User, Integer> {
}

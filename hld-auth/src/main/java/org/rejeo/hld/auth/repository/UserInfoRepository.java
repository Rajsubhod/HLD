package org.rejeo.hld.auth.repository;

import org.rejeo.hld.auth.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
}

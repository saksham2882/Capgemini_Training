package com.cg.repo;

import com.cg.bean.UserBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserBeanRepo extends JpaRepository<UserBean, String> {

}

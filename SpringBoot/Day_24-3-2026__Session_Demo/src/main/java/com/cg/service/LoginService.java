package com.cg.service;

import com.cg.bean.UserBean;
import com.cg.repo.UserBeanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {

    @Autowired
    private UserBeanRepo uRepo;

    public UserBean validateUser(UserBean ub) {
        Optional<UserBean> op = uRepo.findById(ub.getUserId());
        if(op.isPresent()) {
            if(op.get().getPassword().equals(ub.getPassword())) {
                return op.get();
            }
        }
        return null;
    }
}

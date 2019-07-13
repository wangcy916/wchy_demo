package com.wchy.demo.srv.elastic.service.impl;

import com.wchy.demo.basedao.elastic.User;
import com.wchy.demo.basedao.elastic.repository.UserRepository;
import com.wchy.demo.srv.elastic.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(UserService.SERVICE_ID)
public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository userRepository;

    public void createDocument(User user) {
        userRepository.save(user);
    }

    public User getByIdNo(String idNo) {
        return userRepository.getByIdNo(idNo);
    }

    public List<User> getListByUserName(String userName) {
        return userRepository.getListByUserName(userName);
    }
}

package com.wchy.demo.srv.elastic.service;

import com.wchy.demo.basedao.elastic.User;

import java.util.List;

public interface UserService {

    String SERVICE_ID = "userService";

    void createDocument(User user);

    User getByIdNo(String idNo);

    List<User> getListByUserName(String userName);
}

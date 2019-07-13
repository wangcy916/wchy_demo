package com.wchy.demo.basedao.elastic.repository;

import com.wchy.demo.basedao.elastic.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends ElasticsearchRepository<User, Long> {

    User getByIdNo(String idNo);

    List<User> getListByUserName(String userName);
}

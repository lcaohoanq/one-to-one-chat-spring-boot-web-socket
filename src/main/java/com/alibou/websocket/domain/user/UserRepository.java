package com.alibou.websocket.domain.user;

import com.alibou.websocket.enums.Status;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository  extends MongoRepository<User, String> {
    List<User> findAllByStatus(Status status);
}

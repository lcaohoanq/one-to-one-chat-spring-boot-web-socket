package com.alibou.websocket.domain.user;

import com.alibou.websocket.enums.Status;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, String> {
    List<User> findAllByStatus(Status status);
}

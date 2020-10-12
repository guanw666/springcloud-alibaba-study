package cn.gw.springcloud.dao;

import cn.gw.study.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
}

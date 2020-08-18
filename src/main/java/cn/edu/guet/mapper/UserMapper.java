package cn.edu.guet.mapper;

import cn.edu.guet.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User login(@Param("username") String username, @Param("password") String password);
}
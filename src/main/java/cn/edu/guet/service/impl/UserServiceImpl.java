package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.MenuMapper;
import cn.edu.guet.mapper.UserMapper;
import cn.edu.guet.model.Menu;
import cn.edu.guet.model.User;
import cn.edu.guet.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements IUserService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    MenuMapper menuMapper;

    @Override
    public User login(String username, String password) {
        return userMapper.login(username,password);
    }

    @Override
    public List<Menu> getAllMenu(){
        return menuMapper.getAllMenu();
    }
}
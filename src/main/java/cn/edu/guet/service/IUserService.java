package cn.edu.guet.service;

import cn.edu.guet.model.Menu;
import cn.edu.guet.model.User;

import java.util.List;

public interface IUserService {

    User login(String username, String password);
    List<Menu> getAllMenu();
}

package cn.edu.guet.mapper;


import cn.edu.guet.model.Menu;

import java.util.ArrayList;
import java.util.List;

public interface MenuMapper {
    Menu getMenuById(String id);
    List<Menu> getAllMenu();
}
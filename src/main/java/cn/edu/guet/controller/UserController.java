package cn.edu.guet.controller;

import cn.edu.guet.common.Result;
import cn.edu.guet.dt.UserDto;
import cn.edu.guet.model.Menu;
import cn.edu.guet.model.User;
import cn.edu.guet.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/*
Controller把普通的pojo标记为一个控制器（就能接收请求、返回数据）
 */
@Controller
@RequestMapping("user")
public class UserController {


    /*
    自动装配（自动注入）：UserController依赖IUserService，那么Spring会自动装配
     */
    @Autowired
    IUserService userService;

    /**
     * gson（慢）
     * fastjson（漏洞多，速度慢）
     * jackson
     * @param
     * @param
     * @return user的信息（json格式），我们的login方法上使用了@ResponseBody注解后，会自动返回json数据
     */
    @RequestMapping(value = "login",method = {RequestMethod.POST})
    @ResponseBody
    public Result login(String username,String password){
        System.out.println("username: "+username);
        System.out.println("password: "+password);
        User user=userService.login(username,password);
        if(user!=null){
            getAllMenu();
            return Result.succ(user);
        }else{
            return Result.fail("请求失败");
        }
    }
    @RequestMapping("saveUser")
    public void saveUser(String user){

    }
    @RequestMapping("getAllMenu")
    public void getAllMenu() {
        List<Menu> AllMenu=userService.getAllMenu();
        for(int i=0;i<AllMenu.size();i++){
            System.out.println(AllMenu.get(i).getName());
        }
    }
}
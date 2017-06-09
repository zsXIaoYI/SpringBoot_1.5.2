package cn.zsza.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zs on 2017/2/4.
 * 15:28
 */

@Controller
public class UserController {

    @GetMapping("/user/{username}")
    @ResponseBody
    public String userProfile(@PathVariable String username){
        System.out.println("username=" + username);
        return "hello, " + username;
    }
    @GetMapping("/users/{username}")
    @ResponseBody
    public String userProfile2(@PathVariable("username") String user){
        return "hello," + user;
    }

    // getUserBlog
    @GetMapping("/users/{username}/blogs/{blogId}")
    @ResponseBody
    public String getUserBlog(@PathVariable String username, @PathVariable int blogId){
        return "欢迎," + username + "," + "来到第" + blogId + "世界";
    }

    // 支持正则表达式
    @GetMapping("/usr/{username:[a-z0-9_]+}")
    @ResponseBody
    public String userProfile3(@PathVariable String username){
        return "欢迎, " + username;
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String getHello(){
        return "hello";
    }

    //将会跳转到blog.html中
    @GetMapping("/blogs")
    public String blog() {

        return "blog";
    }
}

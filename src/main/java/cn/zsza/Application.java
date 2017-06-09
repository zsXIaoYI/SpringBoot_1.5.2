package cn.zsza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zs on 2017/6/7.
 * 10:12
 */
@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/index")
    public String index(){
        System.out.println(11);
        return "Index Page";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }


}

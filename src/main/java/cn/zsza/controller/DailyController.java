package cn.zsza.controller;

import cn.zsza.resourceConfig.AppProperties;
import cn.zsza.resourceConfig.GlobalProperties;
import cn.zsza.resourceConfig.GlobalProperties2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by zs on 2017/6/6.
 * 18:08
 */
@RequestMapping(value = "/daily")
@RestController
public class DailyController {

    private static final Logger logger = LoggerFactory.getLogger(DailyController.class);

    @Resource
    private GlobalProperties globalProperties;

    @Resource
    private GlobalProperties2 globalProperties2;

    @Resource
    private AppProperties appProperties;

    @RequestMapping("/getRes")
    public String getRes(){

        System.out.println("执行");
        return "地址:" + globalProperties.getAddress() +
                "\n" + "E-mail:" + globalProperties.getEmail();
    }

    @RequestMapping("/getRes2")
    public String getRes2(){

        System.out.println("执行");
        return "地址:" + globalProperties2.getAddress() +
                "\n" + "threadPool:" + globalProperties2.getThreadPool();
    }

    @RequestMapping("/getRes3")
    public String getRes3(){
        AppProperties ap = appProperties;

        logger.debug(".....{} getRes3");
        logger.info("......{} info mes");
        System.out.println("ap:" + ap);
        return "success";
    }
}

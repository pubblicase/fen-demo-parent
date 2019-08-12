package net.wanho.controller;

import net.wanho.service.HellowServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by Boss on 2019/8/12.
 */
@Controller
public class HellowController {
    @Autowired
    private HellowServiceI hellowServiceI;

    @RequestMapping("login")
    public String login(Map map){
        String s = hellowServiceI.sayHellow();
        map.put("s",s);
        return "success";
    }
}

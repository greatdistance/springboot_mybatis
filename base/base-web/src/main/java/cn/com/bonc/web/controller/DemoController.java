package cn.com.bonc.web.controller;

import cn.com.bonc.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author greatDistance
 * @version 1.0
 * @ClassName DemoController
 * @description TODO
 * @date 2019/8/4 11:15
 */
@RestController
@RequestMapping("demo")
public class DemoController {
    @Autowired
    private DemoService demoService;

    @GetMapping("test")
    public String test() {
        return demoService.test();
    }
}

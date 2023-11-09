package store.xianglin.sb2.controller;

import store.xianglin.sb2.bean.Demo;
import store.xianglin.sb2.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import store.xianglin.sb2.service.TestService;

import javax.annotation.Resource;
import java.util.Optional;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoMapper demoMapper;
    @Resource
    private TestService testService;

    @RequestMapping("/hello/{id}")
    @ResponseBody
    public String hello(@PathVariable(value = "id") Long id) {
        return Optional.ofNullable(demoMapper.selectByPrimaryKey(id)).map(Demo::toString).orElse("empty String");
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return testService.test();
    }
}

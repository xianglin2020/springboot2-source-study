package store.xianglin.sb2.controller;

import store.xianglin.sb2.bean.Demo;
import store.xianglin.sb2.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoMapper demoMapper;

    @RequestMapping("/hello/{id}")
    @ResponseBody
    public String hello(@PathVariable(value = "id") Long id) {
        return Optional.ofNullable(demoMapper.selectByPrimaryKey(id)).map(Demo::toString).orElse("empty String");
    }

}

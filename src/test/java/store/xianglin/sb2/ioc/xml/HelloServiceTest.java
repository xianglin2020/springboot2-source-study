package store.xianglin.sb2.ioc.xml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:ioc/demo.xml")
public class HelloServiceTest {
    @Resource
    private HelloService helloService;
    @Test
    public void testHello() {
        System.out.println(helloService.hello());
    }
}
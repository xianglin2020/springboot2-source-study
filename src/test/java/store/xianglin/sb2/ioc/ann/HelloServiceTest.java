package store.xianglin.sb2.ioc.ann;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
public class HelloServiceTest {
    @Resource
    private HelloService helloService;

    @Test
    public void testHello() {
        System.out.println(helloService.hello());
    }
}
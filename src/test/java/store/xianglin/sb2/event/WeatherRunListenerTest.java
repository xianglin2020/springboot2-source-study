package store.xianglin.sb2.event;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WeatherRunListenerTest {
    @Resource
    private WeatherRunListener weatherRunListener;

    @Test
    public void testSnow() {
        weatherRunListener.snow();
    }

    @Test
    public void testRain() {
        weatherRunListener.rain();
    }
}
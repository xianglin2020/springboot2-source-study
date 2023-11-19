package store.xianglin.sb2.util;

import org.junit.Test;
import org.springframework.util.StopWatch;

import java.util.concurrent.TimeUnit;

public class StopWatchTest {
    @Test
    public void testStopWatch() throws InterruptedException {
        var stopWatch = new StopWatch("testWatch");
        stopWatch.start("task1");
        TimeUnit.SECONDS.sleep(2);
        stopWatch.stop();
        stopWatch.start("task2");
        TimeUnit.SECONDS.sleep(1);
        stopWatch.stop();
        stopWatch.start("task3");
        TimeUnit.SECONDS.sleep(3);
        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
        System.out.println(stopWatch);
    }
}

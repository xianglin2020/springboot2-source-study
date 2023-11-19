package store.xianglin.sb2.startup;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class SecondApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) {
        System.out.println("\u001B[32m >>> startup second ApplicationRunner <<<");
    }
}

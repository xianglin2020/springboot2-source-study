package store.xianglin.sb2.startup;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class SecondCommandlineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) {
        System.out.println("\u001B[32m >>> startup second CommandlineRunner <<<");
    }
}

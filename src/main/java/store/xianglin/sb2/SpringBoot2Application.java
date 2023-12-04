package store.xianglin.sb2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@MapperScan("store.xianglin.sb2.mapper")
@PropertySource({"classpath:demo.properties"})
public class SpringBoot2Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringBoot2Application.class, args);
    }
}

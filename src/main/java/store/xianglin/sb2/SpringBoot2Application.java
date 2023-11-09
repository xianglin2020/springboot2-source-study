package store.xianglin.sb2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import store.xianglin.sb2.Initializer.SecondInitializer;

@SpringBootApplication
@MapperScan("store.xianglin.sb2.mapper")
public class SpringBoot2Application {
    public static void main(String[] args) {
//        SpringApplication.run(SpringBoot2Application.class, args);
        var springApplication = new SpringApplication(SpringBoot2Application.class);
        springApplication.addInitializers(new SecondInitializer());
        springApplication.run(args);
    }
}

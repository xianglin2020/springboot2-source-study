package store.xianglin.sb2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.ResourceBanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication
@MapperScan("store.xianglin.sb2.mapper")
public class SpringBoot2Application {
    public static void main(String[] args) {
        var springApplication = new SpringApplication(SpringBoot2Application.class);
        springApplication.setBanner(new ResourceBanner(new ClassPathResource("favorite.txt")));
        springApplication.setBannerMode(Banner.Mode.CONSOLE);
        springApplication.run(args);
    }
}

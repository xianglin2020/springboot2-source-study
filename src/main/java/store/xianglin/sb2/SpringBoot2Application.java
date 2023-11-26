package store.xianglin.sb2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.util.Assert;

import java.util.Properties;

@SpringBootApplication
@MapperScan("store.xianglin.sb2.mapper")
@PropertySource({"classpath:demo.properties"})
public class SpringBoot2Application {
    public static void main(String[] args) {
        var springApplication = new SpringApplication(SpringBoot2Application.class);
        var properties = new Properties();
        properties.setProperty("property", "property from DefaultProperties");
        springApplication.setDefaultProperties(properties);
        var context = springApplication.run(args);
        Assert.notNull(context.getBean("componentSuperConfiguration"));
    }
}

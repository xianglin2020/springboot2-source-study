package store.xianglin.sb2.ioc.ann;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import store.xianglin.sb2.ioc.Animal;
import store.xianglin.sb2.ioc.Dog;

@Import(MyBeanImport.class)
@Configuration
public class BeanConfiguration {
    @Bean("dog")
    public Animal getDog() {
        return new Dog();
    }
}

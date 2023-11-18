package store.xianglin.sb2.ioc.ann;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;
import store.xianglin.sb2.ioc.Animal;
import store.xianglin.sb2.ioc.Cat;

@Component
public class MyCat implements FactoryBean<Animal> {
    @Override
    public Animal getObject() {
        return new Cat();
    }

    @Override
    public Class<?> getObjectType() {
        return Animal.class;
    }
}

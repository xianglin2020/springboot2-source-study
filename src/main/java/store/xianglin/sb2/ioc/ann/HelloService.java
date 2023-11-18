package store.xianglin.sb2.ioc.ann;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import store.xianglin.sb2.ioc.Animal;
import store.xianglin.sb2.ioc.xml.Student;

import javax.annotation.Resource;

@Component
public class HelloService {
    @Qualifier("bird")
    @Resource
    private Animal animal;

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String hello() {
        return animal.getName();
    }
}

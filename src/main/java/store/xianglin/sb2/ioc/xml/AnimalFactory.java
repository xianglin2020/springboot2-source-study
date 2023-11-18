package store.xianglin.sb2.ioc.xml;

import store.xianglin.sb2.ioc.Animal;
import store.xianglin.sb2.ioc.Cat;
import store.xianglin.sb2.ioc.Dog;

public class AnimalFactory {
    public static Animal getAnimal(String type) {
        if ("dog".equals(type)) {
            return new Dog();
        } else if ("cat".equals(type)) {
            return new Cat();
        }
        return null;
    }

    public Animal getAnimalInstance(String type) {
        if ("dog".equals(type)) {
            return new Dog();
        } else if ("cat".equals(type)) {
            return new Cat();
        }
        return null;
    }
}

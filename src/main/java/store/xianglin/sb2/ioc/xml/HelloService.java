package store.xianglin.sb2.ioc.xml;

import store.xianglin.sb2.ioc.Animal;

public class HelloService {
    private Student student;
    private Animal animal;

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String hello() {
//        return student.toString();
        return animal.getName();
    }
}

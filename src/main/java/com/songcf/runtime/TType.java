package com.songcf.runtime;

import com.songcf.test.TTest;
import com.songcf.sometype.Shape;
import com.songcf.sometype.ShapeCircle;
import java.util.Arrays;
import java.util.List;

public class TType extends TTest {
    public TType(){
        super(TType.class.getName());
    }
    public void test() {
        Cat realCat = new Cat();
        Pet petFromCat = realCat;
        Pet realPet = new Pet();

        // instanceof
        System.out.println("petFromCat instanceof Cat : "+(petFromCat instanceof Cat));

        //class.isInstance
        System.out.println("Pet.class.isInstance(cat) : " + Pet.class.isInstance(realCat));
        System.out.println("Pet.class==petFromCat.getClass()) : "+(Pet.class==petFromCat.getClass()));//FIXME 虽然能赋值但是class不相等

        System.out.println("Cat.class.isInstance(petFromCat) : "+Cat.class.isInstance(petFromCat));
        System.out.println("Cat.class==petFromCat.getClass()) : "+(Cat.class==petFromCat.getClass()));

        //Class.isAssignableFrom
        System.out.println("Cat.class.isAssignableFrom(realCat.getClass()) : "+Cat.class.isAssignableFrom(realCat.getClass()));
        System.out.println("Cat.class.isAssignableFrom(realPet.getClass()) : "+Cat.class.isAssignableFrom(realPet.getClass()));
        System.out.println("Pet.class.isAssignableFrom(petFromCat.getClass()) : "+Pet.class.isAssignableFrom(petFromCat.getClass()));

    }

    public List<Class<?>> types() {
        return Arrays.asList(Pet.class, Cat.class, Dog.class, Shape.class, ShapeCircle.class);
    }
}

class Pet {
    public void name() {
        System.out.println("I'm Pet");
    }
}

class Cat extends Pet{
    public void name() {
        System.out.println("I'm Cat, is a Pet");
    }
}

class Dog extends Pet{
    public void name() {
        System.out.println("I'm Dog, is a Pet");
    }
}

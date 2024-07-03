package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDog(){
        Dog dog = new Dog("Bert", new Date(),null);
        Dog Bert = new Dog(dog);
        Assert.assertTrue(Bert instanceof Animal);
    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
//    @Test
//    public void createCat(){
//        Cat cat = new Cat("Milli", new Date(),null);
//    }
}

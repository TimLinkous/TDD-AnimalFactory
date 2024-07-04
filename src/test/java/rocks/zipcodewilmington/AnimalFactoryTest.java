package rocks.zipcodewilmington;

import org.hamcrest.Factory;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDog() {
        AnimalFactory factory = new AnimalFactory();
        Dog dog = factory.createDog("Bert", new Date());
        dog.getName();
        Assert.assertEquals("Bert", dog.getName());

    }

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCat() {
        AnimalFactory factory = new AnimalFactory();
        Cat cat = factory.createCat("Millie", new Date());
        cat.getName();
        Assert.assertEquals("Millie", cat.getName());
    }
}

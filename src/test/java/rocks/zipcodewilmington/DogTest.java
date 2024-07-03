package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDate() {
        Dog dog = new Dog(null, null, null);
        Date date = new Date();
        dog.setBirthDate(date);
        Date actual = dog.getBirthDate();
        Assert.assertEquals(date, actual);
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEat() {
        Dog dog = new Dog(null, null, null);
        Food food = new Food();
        dog.eat(food);
        int actual = dog.getNumberOfMealsEaten();
        assertEquals(1, actual);
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetID() {
        Dog dog = new Dog(null, null, 5);
        int actual = dog.getId();
        assertEquals(5, actual);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testDogAnimal() {
        Dog Milo = new Dog(null, null, null);
        Assert.assertTrue(Milo instanceof Animal);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testDogMammal() {
        Dog Milo = new Dog(null, null, null);
        Assert.assertTrue(Milo instanceof Mammal);
    }
}


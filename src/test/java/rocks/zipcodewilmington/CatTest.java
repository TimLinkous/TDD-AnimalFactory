package rocks.zipcodewilmington;

import cat.eat;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;
import java.util.HashSet;

import static org.junit.Assert.*;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void testCatName(){
        Cat cat = new Cat(); //revisit how it was done for Dog
        String actual = cat.setName("Steve");
        assertEquals("Steve", actual);
    }
    // TODO - Create tests for `speak`
    @Test
    public void testCatSpeak(){
        Cat cat = new Cat();
        assertEquals("meow!", cat.speak());
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testBirthDate(){
        Cat cat = new Cat();
        Date expected = new Date();
        cat.setBirthDate(expected);
        Date actual = cat.getBirthDate();
        assertEquals(expected, actual);

    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEat(){
        Cat cat = new Cat();
        Food food = new Food();
        cat.eat(food);
        int actual = cat.getNumberOfMealsEaten();
        assertEquals(1, actual);
        }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetID() {
        Cat cat = new Cat(null, null ,7);
        int actual = cat.getId();
        assertEquals(7, actual);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testCatAnimal(){
        String name = "Steve";
        Cat Steve = new Cat();
        Assert.assertTrue(Steve instanceof Animal);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testCatMammal() {
        String name = "Steve";
        Cat Steve = new Cat();
        Assert.assertTrue(Steve instanceof Mammal);
    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        assertEquals(givenName, retrievedName);
        assertEquals(givenBirthDate, retrievedBirthDate);
        assertEquals(givenId, retrievedId);
    }

}

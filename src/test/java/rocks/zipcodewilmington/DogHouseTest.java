package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 *////Several will pass individually but not when run all tests at once?
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void testRemoveDogByID() {
        DogHouse.clear();
        Dog dog = new Dog();//create new dog
        DogHouse.add(dog);//adding to the doghouse
        Integer expected = 0; //argument to be compared with
        DogHouse.remove(dog.getId());//removing from doghouse specifically by ID
        Assert.assertEquals(expected, DogHouse.getNumberOfDogs());//make sure dog is removed
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void testGetByID(){
        Dog dog = new Dog("Spot", new Date(), 25);//create new dog
        DogHouse.add(dog);//add dog to doghouse
        Dog dogID = DogHouse.getDogById(25);//get dog by ID 25
        Assert.assertEquals(dog, dogID); //expected is new dog - actual is the dogID
    }

    @Test
    public void testRemoveNumberOfDogs() {
        DogHouse.clear();
        Dog dog = new Dog();//create new dog
        DogHouse.add(dog);//adding to the doghouse
        Integer expected = 0; //argument to be compared with
        DogHouse.remove(dog);//removing from doghouse
        Assert.assertEquals(expected, DogHouse.getNumberOfDogs());//make sure dog is removed
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void testInteger(){
        DogHouse.clear();
        Dog dog = new Dog();//create new dog
        DogHouse.add(dog);//adding to the doghouse
        Integer expected = 1;// 1 dog in doghouse
        Assert.assertEquals(expected, DogHouse.getNumberOfDogs());
    }
}
///Several will pass individually but not when run all tests at once?
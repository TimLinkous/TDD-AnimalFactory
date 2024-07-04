package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 *////Several will pass individually but not when run all tests at once?
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void testGetNumberOfCats() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);

        // Then
        CatHouse.getNumberOfCats();
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveCatByID() {
        CatHouse.clear();
        Cat cat = new Cat();
        CatHouse.add(cat);
        Integer expected = 0;
        CatHouse.remove(cat.getId());
        Assert.assertEquals(expected, CatHouse.getNumberOfCats());
    }

    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void testRemoveNumberOfCats() {
        CatHouse.clear();
        Cat cat = new Cat();
        CatHouse.add(cat);
        Integer expected = 0;
        CatHouse.remove(cat);
        Assert.assertEquals(expected, CatHouse.getNumberOfCats());
    }
        // TODO - Create tests for `Cat getCatById(Integer id)`
        @Test
        public void testGetByID(){
            Cat cat = new Cat("Fluffy", new Date(), 100);
            CatHouse.add(cat);
            Cat catID = CatHouse.getCatById(100);
            Assert.assertEquals(cat, catID);
        }
        // TODO - Create tests for `Integer getNumberOfCats()`
        @Test
        public void testIntegerGetNumberOfTest(){
            CatHouse.clear();
            Cat cat = new Cat();
            CatHouse.add(cat);
            Integer expected = 1;
            Assert.assertEquals(expected, CatHouse.getNumberOfCats());
        }
    }
/////Several will pass individually but not when run all tests at once?

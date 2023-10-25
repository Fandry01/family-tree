import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {

    }
    @Test
    void getName() {
        // arrange
        Person person  = new Person("Mark","Anthony",35,"Male");
        // act
        String name = person.getName();
        //assert
        assertEquals("Mark", name);
    }
    @Test
    void getMiddleName() {
        // arrange
        Person person = new Person("Mark","Joshua" ,"Anthony",20,"Male");
        // act
        String middleName = person.getMiddleName();
        //assert
        assertEquals("Joshua",middleName);
    }
    @Test
    void getLastname() {
        // arrange
        Person person = new Person("Eric","Magnus",25,"Male");
        // act
        String lastName = person.getLastName();
        //assert
        assertEquals("Magnus",lastName);
    }
    @Test
    void getAge() {
        // arrange
        Person person = new Person("Eric","Magnus",25,"Male");
        // act
        int age = person.getAge();
        //assert
        assertEquals(25,age);
    }
    @Test
    void getSex() {
        // arrange
        Person person = new Person("Charles","Xavier",30,"Male");
        // act
        String sex = person.getSex();
        //assert
        assertEquals("Male",sex);
    }
    @Test
    void getMother() {
        // arrange
        Person son = new Person("James","Howlett",30,"Male");
        Person mother = new Person("Jean","Grey",35,"Female");
        // act
       son.setMother(mother);
       Person mama = son.getMother();
        //assert
        assertEquals(mother,mama);
    }
    @Test
    void getFather() {
        // arrange
        Person son = new Person("bobby","Iceman",30,"Male");
        Person daddy = new Person("Anne","marie",45,"Female");
        // act
        son.setFather(daddy);
        Person dad = son.getFather();
        //assert
        assertEquals(daddy,dad);
    }
    @Test
    void getSiblings() {
        // arrange
        Person sister = new Person("Pamela","Anderson",26,"Female");
        Person brother = new Person("Kevin","Hart",30,"Male");
        List<Person> children = new ArrayList<>();
        // act
        children.add(sister);
        brother.setSiblings(children);

        List<Person> kids = brother.getSiblings();
        //assert
        assertEquals(children,kids);

    }
    @Test
    void getChildren() {
        // arrange
        Person dad = new Person("Bruce","Wayne",40,"Male");
        Person son = new Person("Dick","Grayson",20,"Male");
        List<Person> children = new ArrayList<>();
        // act
        children.add(son);
        dad.setChildren(children);
        //assert
        List<Person> kids = dad.getChildren();
    }
    @Test
    void getPets() {
        // arrange
        Person son = new Person("Dick","Grayson",20,"Male");
        Pet snake = new Pet("Aoda",5,"Python");
        Pet frog = new Pet("Gamakichi",3,"Toad");

        List<Pet> pets = new ArrayList<>();
        pets.add(snake);
        pets.add(frog);
        // act
        son.setPets(pets);
        List<Pet> creatures = son.getPets();
        //assert

        assertEquals(pets,creatures);
    }
    @Test
    void setAge() {
        // arrange
        Person son = new Person("Dick","Grayson",20,"Male");
        // act
        son.setAge(25);
        int age = son.getAge();
        //assert
        assertEquals(25,age);
    }
    @Test
    void setSex() {
        // arrange
        Person son = new Person("Dick","Grayson",20,"Male");
        // act
        son.setSex("Female");
        String sex = son.getSex();
        //assert
        assertEquals("Female",sex);
    }
    @Test
    void ShouldAddParents() {
        // arrange
        Person mother1 = new Person("berta","nkruma",45,"female");
        Person father2 = new Person("Kwame","nkruma",40,"male");
        Person son = new Person("dereck","Nkruma",25,"male");
        // act
        son.addParents(mother1,father2,son);
        Person mother = mother1.getMother();
        Person father = father2.getFather();
        //assert
        assertEquals(mother1.getMother(), mother);
        assertEquals(father2.getFather(), father);
    }

    @Test
    void shouldAddSiblings() {
        //arrange
        Person mother1 = new Person("berta","nkruma",45,"female");
        Person father2 = new Person("Kwame","nkruma",40,"male");
        Person son = new Person("kevin","Nkruma",25,"male");
        Person daughter = new Person("penelope","Nkruma",21,"female");
        List<Person> children = new ArrayList<>();


        //act
        children.add(daughter);
        children.add(son);
        father2.addSiblings(father2,daughter);
        father2.addSiblings(father2,son);

        List<Person> childs = father2.getSiblings();
        //assert
        assertEquals(children,childs);

    }

    @Test
    void shouldAddChild() {
        //arrange
        Person mother1 = new Person("berta","nkruma",45,"female");
        Person son = new Person("kevin","Nkruma",25,"male");
        List<Person> children = new ArrayList<>();
        children.add(son);
        // act
        mother1.addChild(mother1,son);
        List<Person> childs = mother1.getChildren();
        // assert
        assertEquals(children, childs);

    }

    @Test
    void shouldAddPet() {
        //arrange
        Pet dog = new Pet("kofi",2,"dobermann");
        Pet cat = new Pet("anubis",2,"tiger");
        Person dad = new Person("Frank","castello",45,"Male");
        List<Pet> pets = new ArrayList<>();
        pets.add(dog);
        pets.add(cat);
        //act
        dad.addPet(dog,dad);
        dad.addPet(cat,dad);

        //assert
        assertEquals(pets,dad.getPets());



    }

    @Test
    void getGrandChild() {

    }
}
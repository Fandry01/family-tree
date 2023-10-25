import java.util.ArrayList;
import java.util.List;

public class Person {
private String name;
private String middleName;
private String lastName;
private String sex;
private int age;
private Person mother;
private Person father;
private List<Person> siblings;
private List<Person> children;
private List<Pet> pets;


public Person (String name,String lastName,int age,String sex){
this.name = name;
this.lastName = lastName;
this.age = age;
this.sex = sex;
}
public Person(String name, String middleName, String lastName, int age,String sex){
    this.middleName = middleName;
this.name = name;
this.lastName = lastName;
this.age = age;
this.sex = sex;
}

public void addParents(Person mother, Person father,Person child){
child.setMother(mother);
mother.addChild(mother,child);
father.addChild(father,child);
child.setFather(father);

}
public void addSiblings( Person parent,Person child){
List<Person> siblings = new ArrayList<>();
if(parent.getSiblings() != null){
    for(Person sibling: parent.getSiblings()){
        siblings.add(sibling);

    }

}
    siblings.add(child);
    parent.setSiblings(siblings);
}
public void addChild(Person parent, Person child){
    List<Person> children = new ArrayList<>();
    if(parent.getChildren()!= null){
        for(Person person: parent.getChildren()){
            children.add(person);

        }

    }
    children.add(child);
    parent.setChildren(children);

}
public void addPet(Pet pet, Person person){
List<Pet> pets = new ArrayList<>();
if(person.getPets() != null){
   pets.addAll(person.getPets());
    }
    pets.add(pet);
    person.setPets(pets);
}



public List<Person> getGrandChild(Person person,Person parent){
    List<Person> grandChildren = new ArrayList<>();
    if(person.getChildren() != null){
        for(Person children: person.getChildren()){
            if(children.getChildren() != null){
                for(Person child : children.getChildren()){
                    grandChildren.add(child);
                }
            }
        }
    }

    return grandChildren;

}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public List<Person> getSiblings() {
        return siblings;
    }

    public void setSiblings(List<Person> siblings) {
        this.siblings = siblings;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
}


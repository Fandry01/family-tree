public class Main {
    public static void main(String[] args){
        Person father = new Person("Fendi","Stunnaman",30,"Male");
        Person mother = new Person("Nana","Bombshell",30,"Female");
        Person son = new Person("Fabio","Stunnaman",15,"male");
        Person daughter = new Person("Jhene", "Stunnaman",12,"female");
        Pet dog = new Pet("kofi",2,"dobermann");

        son.addParents(father,mother,son);
        daughter.addSiblings(mother,daughter);
        son.addPet(dog,son);

    }
}

package Class.PersonI_Encapsulation;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        System.out.println(person.getFirstName()); ////undefined
        System.out.println(person.getLastName()); //undefined
        System.out.println(person.getAge());     //-1
        System.out.println(person.toString());   // undefined | undefined | -1

        person.setFirstName("John");
        person.setLastName("Doe");
        person.setAge(44);

        System.out.println(person.toString());  //"John | Doe | 44"

        Person person1 = new Person( "Fatima", "Lee", 22 );
        System.out.println(person1.getFirstName());
        System.out.println(person1.getLastName());
        System.out.println(person1.getAge());
        System.out.println(person1.toString());


    }
}

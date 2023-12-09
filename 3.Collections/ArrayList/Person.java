import java.util.ArrayList;
import java.util.Iterator;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class IntermediateArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList of custom objects (Person)
        ArrayList<Person> personList = new ArrayList<>();

        // Adding Person objects to the ArrayList
        personList.add(new Person("Alice", 25));
        personList.add(new Person("Bob", 30));
        personList.add(new Person("Charlie", 22));

        // Displaying Person objects in the ArrayList using an enhanced for loop
        System.out.println("People in the ArrayList:");
        for (Person person : personList) {
            System.out.println(person);
        }

        // Modifying an attribute of a Person object
        Person bob = personList.get(1);
        bob.setAge(31);

        // Displaying updated Person objects using an iterator
        System.out.println("\nUpdated People in the ArrayList:");
        Iterator<Person> iterator = personList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Checking if the ArrayList contains a specific Person object
        Person david = new Person("David", 28);
        System.out.println("\nDoes the ArrayList contain David? " + personList.contains(david));

        // Removing a Person object by reference
        personList.remove(bob);

        // Displaying final Person objects in the ArrayList
        System.out.println("\nFinal People in the ArrayList:");
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}

//// Explination:-
//// 1. We introduce a `Person` class with attributes `name` and `age`. This class is used to demonstrate the use of custom objects in an `ArrayList`.
//// 2. We override the `toString` method in the `Person` class to provide a meaningful string representation for printing.
//// 3. We create an `ArrayList` of `Person` objects (`personList`) and demonstrate adding, updating, and removing elements.
//// 4. We use the `contains` method to check if the `ArrayList` contains a specific `Person` object.
//// 5. We demonstrate removing a `Person` object by reference using the `remove` method.

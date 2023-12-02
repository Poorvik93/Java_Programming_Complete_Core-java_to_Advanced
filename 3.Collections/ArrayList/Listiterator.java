import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Listiterator{
    public static void main(String[] args) {
        List<String> programLanguage = new ArrayList<>();

        programLanguage.add("C");
        programLanguage.add("Python");
        programLanguage.add("Java");
        programLanguage.add("Sql");
        programLanguage.add("JavaScript");

        // Getting the ListIterator.
        ListIterator<String> iterator = programLanguage.listIterator();
        System.out.println("Forward direction Iteration:");

        // hasNext() and next() methods will be used for forward direction iteration.
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
        // 
        System.out.println("_____________________________________");
        System.out.println("Backward direction Iteration:");
        //hasPrevious()  and  previous()  methods use to iterate backword direction.
         while (iterator.hasPrevious()) {
            String element = iterator.previous();
            System.out.println(element);
         }
    }
}

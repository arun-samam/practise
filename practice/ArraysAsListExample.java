package practice;
import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {
    public static void main(String[] args) {
        // Creating an array
       Integer[] array = {1, 2, 3, 4, 5};

        // Converting the array to a list using Arrays.asList()
        List<Integer> list = Arrays.asList(array);

        // Reading elements from the list
        System.out.println("Elements in the list:");
        for (Integer element : list) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Updating an element in the list (Note: The array will be updated too)
        list.set(2, 30);
        list.set(1, 13);

        // Printing the updated array
        System.out.println("Updated array:");
        list.forEach(i->System.out.print(i+"\t\t"));
        System.out.println();
        for (Integer element : array) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Trying to add an element (UnsupportedOperationException will be thrown)
        try {
            list.add(6);
        } catch (UnsupportedOperationException e) {
            System.out.println("Adding an element is not supported in this list.");
        }

        // Trying to remove an element (UnsupportedOperationException will be thrown)
        try {
            list.remove(1);
        } catch (UnsupportedOperationException e) {
            System.out.println("Removing an element is not supported in this list.");
        }
    }
}

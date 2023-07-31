import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class prac11d{
    public static void main(String[] args) {
        System.out.println("====================================");
		System.out.println("Name: "+"Dhruv Rajpurohit");
		System.out.println("Enrollment Number: "+"210210107061");
		System.out.println("Date: "+new java.util.Date());
		System.out.println("Practical: "+11);
		System.out.println("====================================");
        // Example data
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(7);
        numbers.add(1);
        numbers.add(3);

        System.out.println("Original list: " + numbers);

        // Sort the list
        Collections.sort(numbers);
        System.out.println("Sorted list: " + numbers);

        // Binary search
        int index = Collections.binarySearch(numbers, 7);
        System.out.println("Index of 7: " + index);

        // Shuffle the list
        Collections.shuffle(numbers);
        System.out.println("Shuffled list: " + numbers);

        // Reverse the list
        Collections.reverse(numbers);
        System.out.println("Reversed list: " + numbers);

        // // Copy list
        ArrayList<Integer> copy = new ArrayList<>(numbers.size()+1);
        for(int i=0;i<numbers.size();i++)
            copy.add(i);
        Collections.copy(copy, numbers);
        System.out.println("Copied list: " + copy);

        // Maximum and minimum values
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);
        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);

        // Disjoint check
        ArrayList<Integer> disjointList = new ArrayList<>();
        disjointList.add(10);
        disjointList.add(20);
        boolean isDisjoint = Collections.disjoint(numbers, disjointList);
        System.out.println("Is disjoint: " + isDisjoint);

        // Frequency count
        int frequency = Collections.frequency(numbers, 5);
        System.out.println("Frequency of 5: " + frequency);
    }
}
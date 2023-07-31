import java.util.ArrayList;
import java.util.Iterator;

public class prac11b {
    public static void main(String[] args) {
        System.out.println("====================================");
		System.out.println("Name: "+"Dhruv Rajpurohit");
		System.out.println("Enrollment Number: "+"210210107061");
		System.out.println("Date: "+new java.util.Date());
		System.out.println("Practical: "+11);
		System.out.println("====================================");
        // Create an ArrayList
        ArrayList<String> subjects = new ArrayList<>();

        // Add elements to the ArrayList
        subjects.add("OOP");
        subjects.add("DBMS");
        subjects.add("Data Structures");
        subjects.add("Digital Fundamentals");
        subjects.add("Discrete Maths");
        subjects.add("PEM");

        // Create an iterator for the ArrayList
        Iterator<String> iterator = subjects.iterator();

        // Traverse the ArrayList using the iterator
        System.out.println("Traversing the ArrayList using the iterator:");
        while (iterator.hasNext()) {
            String subject  = iterator.next();
            System.out.println(subject);
        }
    }
}
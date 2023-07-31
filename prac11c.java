import java.util.LinkedList;
import java.util.Queue;

public class prac11c {
    public static void main(String[] args) {
        System.out.println("====================================");
		System.out.println("Name: "+"Dhruv Rajpurohit");
		System.out.println("Enrollment Number: "+"210210107061");
		System.out.println("Date: "+new java.util.Date());
		System.out.println("Practical: "+11);
		System.out.println("====================================");
        Queue<Integer> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.offer(50);
        queue.offer(40);
        queue.offer(30);
        queue.offer(20);

        // Displaying the elements in the queue
        System.out.println("Queue: " + queue);

        // Using the peek() method to get the head element without removing it
        int head = queue.peek();
        System.out.println("Head of the queue: " + head);

        // Using the poll() method to retrieve and remove the head element
        int removedElement = queue.poll();
        System.out.println("Removed element: " + removedElement);

        // Displaying the updated queue
        System.out.println("Updated queue: " + queue);

        // Using the remove() method to remove a specific element
        boolean isRemoved = queue.remove(30);
        System.out.println("Is '30' removed? " + isRemoved);

        // Displaying the final queue
        System.out.println("Final queue: " + queue);
    }
}
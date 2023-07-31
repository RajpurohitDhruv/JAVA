import java.util.*;
import java.util.Random;
public class generateRandomNum{
public static void main(String[] args){
        System.out.println("====================================");
		System.out.println("Name: "+"Dhruv Rajpurohit");
		System.out.println("Enrollment Number: "+"210210107061");
		System.out.println("Date: "+new java.util.Date());
		System.out.println("Practical: "+5);
		System.out.println("====================================");
        Random r=new Random();
        Scanner sc = new Scanner(System.in);
System.out.print("Enter Starting value of the range: ");
int start = Integer.parseInt(sc.nextLine());
System.out.print("Enter End value of the range: ");
int end = Integer.parseInt(sc.nextLine());
System.out.println("The 20 random numbers generated between " + start + " to " + end + " are as below.");
for(int i=0; i<20; i++){
    System.out.print(r.nextInt(start));
    
        if(i!=19){
            System.out.print("," + " ");
    
        }
}

}
}
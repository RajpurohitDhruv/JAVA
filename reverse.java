import java.util.*;
import java.util.Arrays;
public class reverse{
public static int[] reverseInput(int[]nums){
int i=0,j=9;
int temp[]=new int[10];
while(i<=9 && j>=0)
{
  temp[j]=nums[i];
  i++;
  j--;

}
return temp;

}
public static void main(String[] args) {
            System.out.println("====================================");
		System.out.println("Name: "+"Dhruv Rajpurohit");
		System.out.println("Enrollment Number: "+"210210107061");
		System.out.println("Date: "+new java.util.Date());
		System.out.println("Practical: "+3);
		System.out.println("====================================");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = Integer.parseInt(inputArray[i]);
           }
           
      int a[]=new int[10];
           a=reverseInput(nums);
	     System.out.println("The reversed numbers are :-");
 
	for(int i=0 ;i<10;i++){
	System.out.print(a[i]+ " ");
      }
// System.out.println("The reversed numbers are :-");
  

}
}
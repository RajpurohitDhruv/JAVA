import java.util.*;
public class compareString{
    public static void main(String[] args){
        System.out.println("====================================");
		System.out.println("Name: "+"Dhruv Rajpurohit");
		System.out.println("Enrollment Number: "+"210210107061");
		System.out.println("Date: "+new java.util.Date());
		System.out.println("Practical: "+5);
		System.out.println("====================================");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first String: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second String: ");
        String s2 = sc.nextLine();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        Boolean flag = false;
        if(s1.length() != s2.length()){
            System.out.print("Both Strings are not equal.");
        }
        else{
            for(int i=0; i < s1.length(); i++){
                if(s1.charAt(i) == s2.charAt(i))
                    flag=true;
                else{ 
                    flag=false;
                    break;
                }
            }
            if(flag==true)
            System.out.print("Both Strings are equal.");
            else 
                System.out.println("Both strings are not equal");
            }
        
        }
}
import java.util.Scanner;

public class substring{
    public static void main(String[] args){

        System.out.println("====================================");
		System.out.println("Name: "+"Dhruv Rajpurohit");
		System.out.println("Enrollment Number: "+"210210107061");
		System.out.println("Date: "+new java.util.Date());
		System.out.println("Practical: "+5);
		System.out.println("====================================");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        System.out.print("Enter the substring: ");
        String substr = sc.nextLine();

        String string = str.toLowerCase();
        String substring = substr.toLowerCase();
        
        int i=0,j=0;
        while(i < string.length() && j < substring.length() && string.length() > substring.length()){
            if(string.charAt(i) == substring.charAt(j)){
                j++;
                i++;
                // System.out.println("if i="+i+"  j="+j);
            }
            else{
                i++;
                if(j>0)
                    i--;
                j=0;
                // System.out.println("else i="+i+"  j="+j);
            }
            
        }
        if(j == substring.length()){
            System.out.println("The substring is present in the string.");
        }
        else{
            System.out.println("The substring is NOT present in the string.");
   }
     }
}
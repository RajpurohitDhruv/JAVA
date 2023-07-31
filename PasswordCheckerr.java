import java.util.*;
public class PasswordCheckerr {

    public static String passwordValidator(String password){

       int size=password.length();
       int count1=0,count2=0,count3=0,count4=0;

       if (size >= 9)
       {
        for(int i=0; i < size; i++)
         {
            char ch;
            ch=password.charAt(i);
            if(ch>=48 && ch<=57)
            count1++;

            else if(ch>=65 && ch <=90)
            count2++;

            else if(ch=='_' || ch=='%' || ch=='*' || ch=='$')
            count3++;

            else if (ch>=97 && ch<= 122)
            count4++;

            else break;
         }

            if(count1==0 || count2==0 || count3==0)
             System.out.println("Invalid password"); 

            else if(count1!=0 && count2!=0 && count3!=0)
            System.out.println("Valid ");
 
            else System.out.println("Invalid ");

         }
        
        return password;
    }

    
    public static void main(String[] args){
        System.out.println("====================================");
		System.out.println("Name: "+"Dhruv Rajpurohit");
		System.out.println("Enrollment Number: "+"210210107061");
		System.out.println("Date: "+new java.util.Date());
		System.out.println("Practical: "+3);
		System.out.println("====================================");
        
        System.out.println("Enter Password");
        Scanner sc = new Scanner(System.in);
        String check = sc.nextLine();
        passwordValidator(check);

        
    
}
}
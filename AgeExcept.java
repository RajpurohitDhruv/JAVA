import javax.swing.*;
import java.util.*;
class Person{
    String name;
    int Age;
    String mobile;
    Person(String name,int Age,String mobile){
        this.name = name;
        this.Age = Age;
        this.mobile = mobile;
    }
}
class InvalidMobileNumberException extends Exception{
    InvalidMobileNumberException(String Message){super(Message);}
}
class InvalidAgeException extends Exception{
    InvalidAgeException(String Message){
        super(Message);
    }
}
public class AgeExcept {
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("Name: "+"Dhruv Rajpurohit");
        System.out.println("Enrollment Number: "+"210210107061");
        System.out.println("Date: "+new java.util.Date());
        System.out.println("Practical: "+ 7);
        System.out.println("====================================");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name:");
        String name = sc.nextLine();
        System.out.println("Enter Age:");
        int age = sc.nextInt();
        System.out.print("\nEnter Mobile Number:");
        sc.nextLine();
        String mobile = sc.nextLine();
        Person obj = new Person(name,age,mobile);
        try{
            if(obj.Age<0)
                throw new InvalidAgeException("Age Is Not Valid");
        }
        catch(InvalidAgeException iae){

            System.out.println(iae+"\n Age Should Be Greater Than Zero");
        }
        try{
            if(obj.mobile.length()!=10 || !obj.mobile.matches("[0-9]+"))
                throw new InvalidMobileNumberException("Mobile Number is not valid");
            else    System.out.println("Name: "+obj.name+"\nAge: "+obj.Age+"\nMobile Number: "+obj.mobile);
        }
        catch (InvalidMobileNumberException imn){
            System.out.println(imn+"  Mobile Number Should Contain 10 Digits Only");
        }
    }
}

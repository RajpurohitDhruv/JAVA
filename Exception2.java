import java.util.*;

class Person{

    String name;
    String mobile_no;
    int age;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMobileNo(String mobile_no){
        this.mobile_no = mobile_no;
    }

}

class InvalidAgeException extends Exception{
    InvalidAgeException(String str){
        super(str);
    }
}

class InvalidMobileNumberException extends Exception{
    InvalidMobileNumberException(String str){
        super(str);
    }
}

public class Exception2{
    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("Name: "+"Dhruv Rajpurohit");
        System.out.println("Enrollment Number: "+"210210107061");
        System.out.println("Date: "+new java.util.Date());
        System.out.println("Practical: "+ 7);
        System.out.println("====================================");
        Scanner sc = new Scanner(System.in);

        Person p = new Person();

        System.out.print("Enter the Name : ");
        String name = sc.nextLine();

        p.setName(name);

        try {

            System.out.print("Enter the age : ");
            int age = Integer.parseInt(sc.nextLine());

            if(age<=0)
                throw new InvalidAgeException("Age Cannot be Less Than or Equal zero");
            
        } catch (InvalidAgeException ae) {

            System.out.println(ae.getMessage());

			System.out.print("Re-Enter the age : ");
            int age = Integer.parseInt(sc.nextLine());
            p.setAge(age);

			try{
				System.out.print("Enter the Mobile Number : ");
                String mobile_no = sc.nextLine();

                if(mobile_no.length()!=10)
                    throw new InvalidMobileNumberException("Mobile Number Must Be of 10 Digits");

			}catch( InvalidMobileNumberException me){
                System.out.println(me.getMessage());

			    System.out.print("Re-Enter the Mobile Number : ");
                String mobile = sc.nextLine();
                
                try{
			        if(mobile.replaceAll("[0123456789]","").length()!=0)
                        throw new InvalidMobileNumberException("Mobile Number Must Cantain Only Digits");
			    }catch( InvalidMobileNumberException ee){

                    System.out.println(ee.getMessage());
                    System.out.print("Re-Enter the Mobile Number : ");
                    String no = sc.nextLine();
                    p.setMobileNo(no);
                    System.out.print("Name : "+p.name+"\nMobile Number : "+p.mobile_no+"\nAge : "+p.age);
                }        
            }         
    
        }
}
}
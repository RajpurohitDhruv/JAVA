import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
		System.out.println("====================================");
		System.out.println("Name: "+ "Dhruv");
		System.out.println("Enrollment Number: "+ "210210107061");
		System.out.println("Date: "+ new java.util.Date());
		System.out.println("Practical: "+"2");
		System.out.println("====================================");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the character :");
        char ch = sc.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch +  " is a vowel");
        }
        else
            System.out.println(ch + " is a consonant");
    }
}

import java.util.Scanner;  
public class GCD
{  
  
public static void main(String[] args)   
{  
    System.out.println("====================================");
		System.out.println("Name: "+"Dhruv Rajpurohit");
		System.out.println("Enrollment Number: "+"210210107061");
		System.out.println("Date: "+new java.util.Date());
		System.out.println("Practical: "+3);
		System.out.println("=======================");
int a, b, gcd = 0;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the First Number: ");  
a = sc.nextInt();     
System.out.print("Enter the Second Number: ");  
b = sc.nextInt();  
gcd = gcd(a, b);  
System.out.println("GCD of " + a + " and " + b + " =  " + gcd);  
}  
public static int gcd(int a, int b)  
{  
while(b != 0)  
{  
if(a > b)  
{  
a = a - b;  
}  
else  
{  
b = b - a;  
}  
}  
return a;  
}  
}  
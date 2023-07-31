import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {
		System.out.println("====================================");
		System.out.println("Name: "+ "Dhruv");
		System.out.println("Enrollment Number: "+ "210210107061");
		System.out.println("Date: "+ new java.util.Date());
		System.out.println("Practical: "+"2");
		System.out.println("====================================");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int max =((a>b)&&(b>c))?a:((b>c?b:c));
		int min =((a<b)&&(b<c))?a:((b<c?b:c));
		System.out.println(max);
		int s=a+b+c-max-min;
		System.out.println(s);
		System.out.println(min);
}
}
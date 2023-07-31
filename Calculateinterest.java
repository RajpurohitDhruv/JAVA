import java.util.*;
public class Calculateinterest{
    public static void main(String[] args) {
        System.out.println("====================================");
		System.out.println("Name: "+"Dhruv Rajpurohit");
		System.out.println("Enrollment Number: "+"210210107061");
		System.out.println("Date: "+new java.util.Date());
		System.out.println("Practical: "+5);
		System.out.println("====================================");

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter initial amount :");
        double amount = sc.nextDouble();
        System.out.println("Enter no of years :");
        double years = sc.nextDouble();
        System.out.println("Enter interest rate :");
        double interest = sc.nextDouble();
        double a[] =interestcalculator(amount,years,interest);
        for(int i=0;i<a.length;i++)
        System.out.printf("the amount after %d years = %.2f \n",i+1,a[i]);


    }
    static double [] interestcalculator (double initial_amount,double no_of_years,double interest_rate)
    {
        double p  =initial_amount;
        double n = no_of_years;
        double r = interest_rate;
        double [] interest = new double[(int)n];
        for(int i=0;i<n;i++){
            interest[i]=p*(Math.pow((1+(r/100)),(r+1)));
        }
        return interest;
    } 
}
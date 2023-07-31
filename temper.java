import java.util.Scanner;

public class temper {
    public static void main(String[] args) {
        double fahrenheit, celsius;
        Scanner input = new Scanner(System.in);
      
        System.out.println("Input temperature : ");
        celsius = input.nextDouble();
        System.out.println(celsius * 1.8 + 32 + "  \n");

        
        System.out.println("Input temperature (: ");
        fahrenheit = input.nextDouble();
        System.out.print((fahrenheit - 32) / 1.8 + " ");
    }
}
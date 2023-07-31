import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        
        double fahrenheit = (9.0 / 5.0) * celsius + 32.0;

        
        double kelvin = celsius + 273.15;

    
        System.out.println(celsius + " Celsius is equal to:");
        System.out.println(fahrenheit + " Fahrenheit");
        System.out.println(kelvin + " Kelvin");
    }
}


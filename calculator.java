import java.util.*;
public class calculator {
    public static void main(String[] args){
        System.out.println("====================================");
		System.out.println("Name: "+"Dhruv Rajpurohit");
		System.out.println("Enrollment Number: "+"210210107061");
		System.out.println("Date: "+new java.util.Date());
		System.out.println("Practical: "+5);
		System.out.println("====================================");

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter an expression with or without space between operators and oprands: ");
        String s = sc.nextLine();
        String s1 = s.replace(" ","");
        
        String[] inputArray = s1.split("[+,-,*,/]");
        int [] c = new int[inputArray.length];
        for(int i=0; i<inputArray.length; i++){
             c[i] = Integer.parseInt(inputArray[i]);
        }
        char ch = '\0';
        for(int i=0; i < s1.length(); i++){
            if(s1.charAt(i) == '+' || s1.charAt(i) == '-' || s1.charAt(i) == '*' || s1.charAt(i) == '/'){
                ch = s1.charAt(i);
                break;
            }
        }
        int result=0;
        switch(ch){
            case '+':
             result = c[0] + c[1];
            break;
            case '-':
             result = c[0] - c[1];
            break;
            case '*':
             result = c[0] * c[1];
            break;
            case '/':
             result = c[0] / c[1];
            break;
        } 
        System.out.println("Answer of the expression " + s + " is: " + result );
    }
    
}
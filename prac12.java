import java.util.Scanner;
public class prac12 {
    public static void main(String args[]) {
        System.out.print("Enter a Number : ");
        Scanner sc = new Scanner(System.in);
        int maximum = sc.nextInt();
        System.out.println("Printing numbers between 1 to "+ maximum+" using two threads...");
        Thread t1 = new Thread(new Display_odd(maximum));
        Thread t2 = new Thread(new Display_even(maximum));
        t1.start();
        t2.start();

    }
}
class Display_odd implements Runnable{
    int max;
    public Display_odd (int a){
        this.max = a;
    }
    @Override
    public void run() {

        for (int i = 1; i <= max; i++){
            if(i%2 != 0){
                System.out.print(i + " ");
            }
            try {
                Thread.currentThread().sleep(100);
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}
class Display_even implements Runnable{
    int max;
    public Display_even (int b){
        this.max = b;
    }
    @Override
    public void run() {

        for (int i = 1; i <= max; i++){
            if(i%2 == 0){
                System.out.print(i + " ");
            }
            try {
                Thread.currentThread().sleep(100);
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}
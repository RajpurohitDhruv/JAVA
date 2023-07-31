import java.util.*;

public class stringg{
    public static String stringChecker(String test){
        int size = test.length();
        char[] arr = new char[size];
        for(int i=0;i<size ; i++){
            arr[i] = test.charAt(i);
        }
    
        int mid = size/2;
        char[] a = new char[mid];
        char[] b = new char[mid];
        for(int i=0; i<mid; i++){
            a[i]= arr[i];
        }
        int j =0;
        if(size%2==0){
        for(int i=mid; i<size; i++){
            b[j]= arr[i];
            j++;
        }
        }
        else{
            for(int i=mid+1; i<size; i++){
                b[j]= arr[i];
                j++;
            }

        }
        int c=0;
        for(int i=0;i<mid;i++){
            int x = a[i];
            for(int k=0; k<a.length; k++){
                if(a[k]==x){
                    c++;
                }
            }
            for(int k=0; k<b.length; k++){
                if(b[k]==x){
                    c--;
                }
            }
        if(c==0)
            continue;  
        else
            break;
        }
        if(c==0)
            System.out.println("YES");
        else
            System.out.println("NO");
        return test;
    }
    public static void main(String[] args){
        System.out.println("====================================");
		System.out.println("Name: "+"Dhruv Rajpurohit");
		System.out.println("Enrollment Number: "+"210210107061");
		System.out.println("Date: "+new java.util.Date());
		System.out.println("Practical: "+3);
		System.out.println("====================================");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String check = sc.nextLine();
        String test = check.toLowerCase();
        stringChecker(test);

    }
}
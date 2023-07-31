import java.util.*;
import java.util.Arrays;
public class quickbinary {
    public static void main(String[] args){
        System.out.println("====================================");
		System.out.println("Name: "+"Dhruv Rajpurohit");
		System.out.println("Enrollment Number: "+"210210107061");
		System.out.println("Date: "+new java.util.Date());
		System.out.println("Practical: "+3);
		System.out.println("====================================");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = Integer.parseInt(sc.nextLine());
        int []a = new int[size];
        for(int i=0; i < size; i++){
            System.out.print("Enter" + " " + (i+1) + " " + "element : ");
            a[i]=Integer.parseInt(sc.nextLine());
        }
        sort(a,0,size-1);
        System.out.println("After sorting elements are : ");
        for(int i=0; i < size; i++){
            System.out.println(a[i] + " ");
        }
        int key;
        System.out.println("Enter key to be searched");
        key=Integer.parseInt(sc.nextLine());
        search(a,key,size-1);
    }

    public static void sort(int []a,int low,int high){
        int loc;
        if(low < high){
            loc = partition(a,low,high);
            sort(a,low,loc-1);
            sort(a,low+1,high);
        }
    }
    public static int partition(int a[],int low, int high){
        int pivot = a[low];
        int i=low;
        int j=high;
        int temp;
        while(i<j){
            while(a[i]<=pivot){
                i++;
            }
            while(a[j]>pivot){
                j--;
            }
            if(i<j){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }

        }
        temp=a[low];
        a[low]=a[j];
        a[j]=temp;
        return j;
    }
    public static void search(int []a, int key, int size){
        int low=0;
        int high=size-1;
        while(low<high){
        int mid=(high+low)/2;
        if(a[mid]==key){
            System.out.println(key + " " + "found at index"+ " " + mid);
            break;
        }
        else if(a[mid]<key){
            low=mid+1;
        }
        else if(a[mid]>key){
            high=mid-1;
        }
        if(low>high){
            System.out.println("indicating key to be searched is not present in the array");
        }

    }

    }

    
}
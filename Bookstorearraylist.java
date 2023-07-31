import java.util.ArrayList;
import java.util.Scanner;
class Books{
    private int price;
    private String ISBN;
    private String title;
    private String author;
    // Data Encapsulation
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public String getISBN(){
        return ISBN;
    }
    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }
}
public class Bookstorearraylist {
    static ArrayList<Books> list = new ArrayList<Books>(30);
    static Scanner sc = new Scanner(System.in);
    static Books obj = new Books();
    static String name,isbn,author;
    static int stack[] = new int[30],top=-1,price;
    static void Insert(int index){
        System.out.print("\nEnter Title:");
        name = sc.nextLine();
        obj.setTitle(name);
        System.out.print("\nEnter Author:");
        author = sc.nextLine();
        obj.setAuthor(author);
        System.out.print("\nEnter Isbn:");
        isbn = sc.nextLine();
        obj.setISBN(isbn);
        System.out.print("\nEnter Price:");
        price = sc.nextInt();
        obj.setPrice(price);
        list.add(index,obj);
    }
    static int isFound(String ISBN){
        int i;
        for(i=0; i<30; i++){
            if(ISBN.equals(list.get(i).getISBN()))
                return i;
        }
        return -1;
    }
    static void update(int index){
        System.out.print("Enter space If You Don't Want To Change Data");
        System.out.print("\nEnter Title:");
        name = sc.nextLine();
        if(name.charAt(0)!=' ')
            obj.setTitle(name);
        System.out.print("\nEnter Author:");
        author = sc.nextLine();
        if(author.charAt(0)!=' ')
            obj.setAuthor(author);
        System.out.print("\nEnter Isbn:");
        isbn = sc.nextLine();
        if(isbn.charAt(0)!=' ')
            obj.setISBN(isbn);
        System.out.print("\nEnter Price:");
        price = sc.nextInt();
        if(price!=0)
            obj.setPrice(price);
        list.add(index,obj);
    }
    static void printData(int ind){
        System.out.print("\n***************************");
        System.out.print("\nTitle: "+list.get(ind).getTitle());
        System.out.print("\nAuthor: "+list.get(ind).getAuthor());
        System.out.print("\nISBN: "+list.get(ind).getISBN());
        System.out.print("\nPrice: "+list.get(ind).getPrice());
        System.out.print("\n***************************");
    }
    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("Name: "+"Dhruv Rajpurohit");
        System.out.println("Enrollment Number: "+"210210107061");
        System.out.println("Date: "+new java.util.Date());
        System.out.println("Practical: "+ 7);
        System.out.println("====================================");
        System.out.println("Welcome to the Book-Store software");
        int i=0,j=0,price,index;
        String option;
        do{
            System.out.print("\n1.Insert\n2.Search\n3.Update\n4.Delete\n5.Exit\nSelect option from above:");
            option = sc.nextLine();
            switch(option){
                case "1":
                    if(i==30 && isEmpty()==1)
                        System.out.println("Data Overflow!!");
                    else if(isEmpty()!=1)
                        Insert(pop());
                    else
                        Insert(i++);
                    break;
                case "2":
                    if(i==0) System.out.println("No Record Found");
                    else {
                        System.out.print("\nEnter part of title:");
                        name = sc.nextLine();
                        for (j = 0; j < i; j++) {
                            if (list.get(j).getTitle().contains(name))
                                printData(j);
                        }
                    }
                    break;
                case "3":
                    if(i==0) System.out.println("No Record Found");
                    else {
                        System.out.print("\nEnter ISBN Number Of The Book:");
                        isbn = sc.nextLine();
                        index = isFound(isbn);
                        if(index==-1)
                            System.out.println("Data Not Found");
                        else
                            update(index);
                    }
                    break;
                case "4":
                    if(i==0) System.out.println("No Record Found");
                    else {
                        System.out.print("\nEnter ISBN Number Of The Book:");
                        isbn = sc.nextLine();
                        index = isFound(isbn);
                        if(index ==-1)
                            System.out.println("Data Not Found");
                        else{
                            obj.setPrice(0);
                            obj.setTitle(" ");obj.setISBN(" ");obj.setAuthor(" ");
                            list.add(index,obj);
                            push(index);
                        }
                    }
                    break;
                case "exit":
                    break;
            }

        }while(!(option.toLowerCase()).equals("exit"));
    }
    static int pop(){
        int temp = top;
        stack[top] = -1;
        top--;
        return temp;
    }
    static int isEmpty(){
        if(top == -1)
            return 1;
        else
            return 0;
    }
    static void push(int index){
        top++;
        stack[top] = index;
    }
}

import java.util.Scanner;
public class Books {
    public static void main(String[] args){
        System.out.println("====================================");
		System.out.println("Name: "+"Dhruv Rajpurohit");
		System.out.println("Enrollment Number: "+"210210107061");
		System.out.println("Date: "+new java.util.Date());
		System.out.println("Practical: "+6);
        System.out.println("====================================");

        private ArrayList<Book> books;
        boolean exit = true;
        int i=0;
        for(int a = 0; a<b1.length; a++)
            { b1[a] = new BookStore();}
        while(exit){
            System.out.println("Choose any option");
            System.out.println("1.Insert  2.Update  3.Search  4.Delete  5.Exit ");
                
        Scanner sc = new Scanner(System.in);
        int option = Integer.parseInt(sc.nextLine());
        switch(option){
            case 1:
           
            System.out.print("Enter the name : ");
            b1[i].setname(sc.nextLine());
            System.out.print("Enter the Author name : ");
            b1[i].setauthor_name(sc.nextLine());
            System.out.print("Enter the price : ");
            b1[i].setprice(Integer.parseInt(sc.nextLine()));
            System.out.print("Enter the ISBN Number : ");
            b1[i].setISBN_number(Integer.parseInt(sc.nextLine()));
            i++;
            // System.out.println("Choose any option");
            break;

            case 2:
            System.out.println("Enter the ISBN number of the book for which you want to update the record. ");
            int isbn = Integer.parseInt(sc.nextLine());
            for(int j=0; j<6; j++){
                if(isbn == b1[j].getISBN_number()){
                    b1[j] = new BookStore();
                    System.out.print("Enter the name : ");
                    b1[j].setname(sc.nextLine());
                    System.out.print("Enter the Author name : ");
                    b1[j].setauthor_name(sc.nextLine());
                    System.out.print("Enter the price : ");
                    b1[j].setprice(Integer.parseInt(sc.nextLine()));
                    System.out.print("Enter the ISBN Number : ");
                    b1[j].setISBN_number(Integer.parseInt(sc.nextLine()));
                    break;
                }
                else{
                    System.out.println("Book not found");
                }
                break;
            }
            break;

            case 3:
            System.out.println("Enter a keyword/part of title");
            String title = sc.nextLine();
            for(int k=0; k<6; k++){
                if(b1[k].getname().contains(title)){
                    System.out.println("Book Name : " +b1[k].getname());
                    System.out.println("Author Name : " +b1[k].getauthor_name());
                    System.out.println("Price : " +b1[k].getprice());
                    System.out.println("ISBN Number : " +b1[k].getISBN_number());
                    continue;
                }
                else{
                    System.out.println("Book not found");
                }
                break;
            }
            break;

            case 4:
            System.out.println("enter ISBN number of the book");
            int isbn2 = Integer.parseInt(sc.nextLine());
            int y=0;
            for(int x=0; x<6; x++){
                if(isbn2 != b1[x].getISBN_number()){
                    b1[y] = b1[x];
                    y++;
                }
            }
            

        }
         
        }


    }
}
class BookStore{
    private String name;
    private int price;
    private String author_name;
    private int ISBN_number;

    public void setname(String name){
        this.name = name;
    }

    public String getname(){
        return name;
    }

    public void setprice(int price){
        this.price = price;
    }

    public int getprice(){
        return price;
    }

    public void setauthor_name(String author_name){
        this.author_name = author_name;
    }

    public String getauthor_name(){
        return author_name;
    }

    public void setISBN_number(int ISBN_number){
        this.ISBN_number = ISBN_number;
    }

    public int getISBN_number(){
        return ISBN_number;
    }
}
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Files{
    public static void main(String[] args) throws IOException {
        System.out.println("====================================");
        System.out.println("Name: "+"Dhruv Rajpurohit");
        System.out.println("Enrollment Number: "+"210210107061");
        System.out.println("Date: "+new java.util.Date());
        System.out.println("Practical: "+ 7);
        System.out.println("====================================");
        File obj = new File("MyFile.txt");
        try {
            if (obj.exists())
            {
                System.out.println("File Exist At: " + obj.getAbsoluteFile());
                System.out.println("Reading "+obj.getName()+" File: ");
                Scanner Reader = new Scanner(obj);
                while(Reader.hasNextLine()){
                    System.out.print(Reader.nextLine()+"\n");
                }
            }
            else
            {
                System.out.println("Creating New File");
                throw new FileNotFoundException();}
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
            if(obj.createNewFile()){
                FileWriter Writer = new FileWriter("MyFile.txt");
                Writer.write("My name is Dhruv Rajpurohit.");
                Writer.close();
                System.out.println("File Created");
            }
        }
    }
}
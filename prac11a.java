import java.util.*;
import java.util.Collections;
public class prac11a {
    public static void main(String[] args){
        System.out.println("====================================");
		System.out.println("Name: "+"Dhruv Rajpurohit");
		System.out.println("Enrollment Number: "+"210210107061");
		System.out.println("Date: "+new java.util.Date());
		System.out.println("Practical: "+11);
		System.out.println("====================================");
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("OOP");
        subjects.add("DBMS");
        subjects.add("Data Structures");
        subjects.add("Digital Fundamentals");

        System.out.println("list after adding elements : " + subjects);

        ArrayList<String> subjects1 = new ArrayList<>();
        subjects1.add("Discrete Maths");
        subjects1.add("PEM");
        subjects.addAll(subjects1);
        System.out.println("List after adding all elements : " + subjects);

        subjects.clear();
        System.out.println("List after clearing all elements : " + subjects);

        subjects.add("OOP");
        subjects.add("DBMS");
        subjects.add("Data Structures");
        subjects.add("Digital Fundamentals");
        subjects.add("Discrete Maths");
        subjects.add("PEM");
        System.out.println("List after re-adding all elements : " + subjects);

        subjects.remove("Digital Fundamentals");
        System.out.println("List after removing Digital Fundamentals :" +subjects);

        ArrayList<String> removesubjects = new ArrayList<>();
        removesubjects.add("DBMS");
        removesubjects.add("PEM");
        subjects.removeAll(removesubjects);
        System.out.println("List after removing DBMS & PEM : " + subjects);

        boolean check = subjects.contains("Data Structures");
        System.out.println("Does list contain Data Structure ? " + check);

        ArrayList<String> subjects3 = new ArrayList<>();
        subjects3.add("OOP");
        subjects3.add("Discrete Maths");
        subjects.retainAll(subjects3);
        System.out.println("List after retaining OOP & Discrete Maths : "+ subjects);

        


    }
    
}
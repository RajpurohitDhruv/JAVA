import java.util.Scanner;
public class P5_student {
    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("Name: " + "Dhruv Rajpurohit");
        System.out.println("Enrollment Number: " + "210210107061");
        System.out.println("Date: " + new java.util.Date());
        System.out.println("Practical: " + 5);
        System.out.println("====================================");

        Student[] s1 = new Student[5];
        s1[0] = new Student("Dhruv", "210210107061", 4, 8.5);
        s1[1] = new Student("Madhav", "210210107033", 4, 9.0);
        s1[2] = new Student("Vidhi", "210210107037", 4, 9.2);
        s1[3] = new Student("Radha", "210210107039", 4, 8.6);
        s1[4] = new Student("Khush", "210210107016", 4, 8.4);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to Print all student data or enter 2 to Search student data");
        int choice = sc.nextInt();

        if (choice == 1) {
            for (int i = 0; i < 5; i++) {
                System.out.println("Name: " + s1[i].Name);
                System.out.println("Enrollment Number: " + s1[i].Enrollment_Number);
                System.out.println("Semester: " + s1[i].Semester);
                System.out.println("Result: " + s1[i].Result);
                System.out.println(" ");
            }
        }

        else if (choice == 2) {
            System.out.println("Enter Enrollment Number of Student : ");
            String roll = sc.next();
            boolean found = false;
            for (int i = 0; i < 5; i++) {
                if (roll.equals(s1[i].getEnrollment_Number())) {
                    System.out.println("Name: " + s1[i].getName());
                    System.out.println("Enrollment_Number: " + s1[i].getEnrollment_Number());
                    System.out.println("Semester: " + s1[i].getSemester());
                    System.out.println("Result: " + s1[i].getResult());
                    found = true;
                    break;
                }
            }
            if (found == false) {
                System.out.println("No record found");
            }
        }
    }
}

class Student {

    String Name;
    String Enrollment_Number;
    int Semester;
    Double Result;

    Student(String Name, String Enrollment_Number, int Semester, Double Result) {
        this.Name = Name;
        this.Enrollment_Number = Enrollment_Number;
        this.Semester = Semester;
        this.Result = Result;
    }

    public String getName() {
        return Name;
    }

    public String getEnrollment_Number() {
        return Enrollment_Number;
    }

    public int getSemester() {
        return Semester;
    }

    public Double getResult() {
        return Result;
    }
}
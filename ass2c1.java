import java.util.*;

class Student {
    int rno;
    String name;
    int mark1, mark2;

    // 🔹 Inner class Result
    class Result {
        int total;
        double percentage;

        // Constructor to calculate total and percentage
        Result() {
            total = mark1 + mark2;
            percentage = total / 2.0;
        }

        void displayResult() {
            System.out.println("Total: " + total);
            System.out.println("Percentage: " + percentage + "%");
        }
    }

    // 🔹 Constructor to initialize student details
    Student(int rno, String name, int mark1, int mark2) {
        this.rno = rno;
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    // 🔹 Method to display student details + result
    void displayMarksheet() {
        System.out.println("\n--- Marksheet ---");
        System.out.println("Roll No: " + rno);
        System.out.println("Name   : " + name);
        System.out.println("Mark 1 : " + mark1);
        System.out.println("Mark 2 : " + mark2);

        // Create object of inner class
        Result res = new Result();
        res.displayResult();
    }
}
class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int rno = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Mark 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Mark 2: ");
        int m2 = sc.nextInt();

        // Create Student object
        Student s = new Student(rno, name, m1, m2);

        // Display full marksheet
        s.displayMarksheet();
    }
}

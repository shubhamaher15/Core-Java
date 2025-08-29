import java.util.*;

class Student {
    int rollno;
    String name;
    double per;

    // 🔹 Parameterized Constructor
    Student(int rollno, String name, double per) {
        this.rollno = rollno;
        this.name = name;
        this.per = per;
    }

    // 🔹 Overriding toString() method
    public String toString() {
        return "Roll No: " + this.rollno + ", Name: " + this.name + ", Percentage: " + this.per + "%";
    }
}
class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Student[] students = new Student[n]; // Array of Student objects

        System.out.println("\nEnter student details:");

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.print("Enter Roll No: ");
            int roll = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Percentage: ");
            double per = sc.nextDouble();

            students[i] = new Student(roll, name, per); // Using parameterized constructor
        }

        System.out.println("\n--- Student Details ---");
        for (Student s : students) {
            System.out.println(s); // Calls toString() automatically
        }
    }
}

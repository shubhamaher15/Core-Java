class Student {
    int rollno;
    String name;
    static int count = 0; 
    Student() {
        rollno = 0;
        name = "Unknown";
        count++;
    }
    Student(int r, String n) {
        rollno = r;
        name = n;
        count++;
    }
    public String toString() {
        return "Roll No: " + rollno + ", Name: " + name;
    }

    static void displayCount() {
        System.out.println("Total Students Created: " + count);
    }
}
 class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Amit");
        System.out.println(s1);
        Student.displayCount();

        Student s2 = new Student(102, "shree");
        System.out.println(s2);
        Student.displayCount();

        Student s3 = new Student(103, "Shubham");
        System.out.println(s3);
        Student.displayCount();
    }
}

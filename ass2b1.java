import java.util.*;

class Person {
    int pid;
    String pname;
    int age;
    String gender;

    // 🔹 Default Constructor
    Person() {
        this.pid = 0;
        this.pname = "Unknown";
        this.age = 0;
        this.gender = "Not Specified";
    }

    // 🔹 Parameterized Constructor
    Person(int pid, String pname, int age, String gender) {
        this.pid = pid;
        this.pname = pname;
        this.age = age;
        this.gender = gender;
    }

    // 🔹 Display Method
    void display() {
        System.out.println("PID: " + this.pid + ", Name: " + this.pname +
                           ", Age: " + this.age + ", Gender: " + this.gender);
    }
}
class PersonDemo {                    ///// RUN TIME HE USE KRNE
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] people = new Person[5]; // Array of 5 Person objects

        System.out.println("Enter details of 5 persons:");

        for (int i = 0; i < 5; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.print("Enter PID: ");
            int pid = sc.nextInt();
            sc.nextLine(); // Consume newline

            System.out.print("Enter Name: ");
            String pname = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine(); // Consume newline

            System.out.print("Enter Gender: ");
            String gender = sc.nextLine();

            // Using parameterized constructor
            people[i] = new Person(pid, pname, age, gender);
        }

        System.out.println("\n--- Displaying Person Details ---");
        for (Person p : people) {
            p.display();
        }
    }
}

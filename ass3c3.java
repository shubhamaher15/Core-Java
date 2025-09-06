import java.util.*;
abstract class Staff {
    String name;
   String address;
    public Staff(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public abstract void display();
}
class FullTimeStaff extends Staff {
    private String department;
    private double salary;

       public FullTimeStaff(String name, String address, String department, double salary) {
        super(name, address);
        this.department = department;
        this.salary = salary;
    }
    public void display() {
        System.out.println("\n--- Full Time Staff ---");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + salary);
    }
}

class PartTimeStaff extends Staff {
    private int numberOfHours;
    private double ratePerHour;
    public PartTimeStaff(String name, String address, int hours, double rate) {
        super(name, address);
        this.numberOfHours = hours;
        this.ratePerHour = rate;
    }

    public void display() {
        System.out.println("\n--- Part Time Staff ---");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Hours Worked: " + numberOfHours);
        System.out.println("Rate per Hour: ₹" + ratePerHour);
        System.out.println("Total Pay: ₹" + (numberOfHours * ratePerHour));
    }
}
 class StaffDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of staff members: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Staff[] staffList = new Staff[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Staff " + (i + 1));
            System.out.print("Is this Full-Time or Part-Time? (F/P): ");
            char type = sc.nextLine().toUpperCase().charAt(0);

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Address: ");
            String address = sc.nextLine();

            if (type == 'F') {
                System.out.print("Enter Department: ");
                String dept = sc.nextLine();

                System.out.print("Enter Salary: ");
                double salary = sc.nextDouble();
                sc.nextLine(); 

                staffList[i] = new FullTimeStaff(name, address, dept, salary);
            } else if (type == 'P') {
                System.out.print("Enter Number of Hours: ");
                int hours = sc.nextInt();

                System.out.print("Enter Rate per Hour: ");
                double rate = sc.nextDouble();
                sc.nextLine();

                staffList[i] = new PartTimeStaff(name, address, hours, rate);
            } else {
                System.out.println("Invalid type. Skipping entry.");
                i--; 
            }
        }
        System.out.println("\n--- Staff Details ---");
        for (Staff s : staffList) {
            s.display();
        }
    }
}

import java.util.*;
 class EmployeeSalary {
    public static void main(String[] args) {
        Hashtable<String, Double> empTable = new Hashtable<String, Double>();
        empTable.put("Shubham", 55000.0);
        empTable.put("Om", 48000.0);
        empTable.put("Aarti", 62000.0);
        empTable.put("Ravi", 50000.0);

        System.out.println("Employee Salary Details:");
        for (Map.Entry<String, Double> entry : empTable.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Salary: ₹" + entry.getValue());
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter employee name to search: ");
        String searchName = sc.nextLine();

        if (empTable.containsKey(searchName)) {
            System.out.println("Salary of " + searchName + " is ₹" + empTable.get(searchName));
        } else {
            System.out.println("Employee " + searchName + " not found.");
        }
    }
}

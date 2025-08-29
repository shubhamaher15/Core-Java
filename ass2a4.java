class Student {
    int id;
    String name;

    // Method to set data
    void setData(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to display data
    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    // Method to copy data from another object
    void copyFrom(Student s) {
        this.id = s.id;
        this.name = s.name;
    }
}
class ObjectCopyDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setData(101, "Shubham");

        Student s2 = new Student();
        s2.copyFrom(s1); // Copying data from s1 to s2

        System.out.println("Original Object (s1):");
        s1.display();

        System.out.println("Copied Object (s2):");
        s2.display();
    }
}

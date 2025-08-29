class MyNumber {
    private int num; // 🔒 Private data member

    // 🔹 Default constructor (sets num to 0)
    MyNumber() {
        this.num = 0;
    }

    // 🔹 Parameterized constructor (sets num to given value)
    MyNumber(int num) {
        this.num = num;
    }

    // 🔹 Method to check if number is positive
    boolean isPositive() {
        return this.num > 0;
    }

    // 🔹 Method to check if number is negative
    boolean isNegative() {
        return this.num < 0;
    }

    // 🔹 Optional: Method to display value
    void display() {
        System.out.println("Value: " + this.num);
    }
}
class MyNumberTest {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please pass a number as command line argument.");
            return;
        }

        // 🔹 Convert command line argument to integer
        int value = Integer.parseInt(args[0]);

        // 🔹 Create object using parameterized constructor
        MyNumber obj = new MyNumber(value);

        obj.display();

        // 🔹 Check and display positivity/negativity
        if (obj.isPositive())
            System.out.println("The number is Positive.");
        else if (obj.isNegative())
            System.out.println("The number is Negative.");
        else
            System.out.println("The number is Zero.");
    }
}

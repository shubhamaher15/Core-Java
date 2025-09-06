
interface Integer {
    void check(int num); 
}

class NumberCheck implements Integer {
    public void check(int num) {
        if (num > 0) {
            System.out.println(num + " is Positive.");
        } else if (num < 0) {
            System.out.println(num + " is Negative.");
        } else {
            System.out.println("Number is Zero.");
        }
    }
}
class Main {
    public static void main(String[] args) {
        NumberCheck obj = new NumberCheck();

        // You can test with different numbers
        obj.check(15);
        obj.check(-8);
         obj.check(0);   
    }
}

import java.util.*;
class Area{

    // Area of Circle: πr²
    double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Area of Rectangle: length × breadth
    double area(double length, double breadth) {
        return length * breadth;
    }

    // Area of Triangle: ½ × base × height
    double area(int base, int height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area calc = new Area();

        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        System.out.println("Area of Circle: " + calc.area(r));

        System.out.print("\nEnter length and breadth of rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Area of Rectangle: " + calc.area(l, b));

        System.out.print("\nEnter base and height of triangle: ");
        int base = sc.nextInt();
        int height = sc.nextInt();
        System.out.println("Area of Triangle: " + calc.area(base, height));
    }
}

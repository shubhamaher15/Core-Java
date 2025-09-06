import java.util.*;
interface Area {
    void area();
}
class Rectangle implements Area {
    protected double length, breadth;

    public Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }
    public void area() {
        double a = length * breadth;
        System.out.println("Area of Rectangle: " + a);
    }
}
class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    public void area() {
        double a = length * length;
        System.out.println("Area of Square: " + a);
    }
}
class Circle implements Area {
    private double radius;

    public Circle(double r) {
        radius = r;
    }
    public void area() {
        double a = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + a);
    }
}
 class ShapeArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length and breadth of Rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        Rectangle rect = new Rectangle(l, b);

        System.out.print("Enter side of Square: ");
        double s = sc.nextDouble();
        Square sq = new Square(s);

        System.out.print("Enter radius of Circle: ");
        double r = sc.nextDouble();
        Circle cir = new Circle(r);

        System.out.println("\n--- Area Calculations ---");
        rect.area();
        sq.area();
        cir.area();
    }
}

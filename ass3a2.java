interface Shape {
    double area();
}
class Circle implements Shape {
    final double radius;

    Circle(double r) {
        radius = r;
    }
    public final double area() {
        return Math.PI * radius * radius;
    }
}
class Sphere implements Shape {
    final double radius;

    Sphere(double r) {
        radius = r;
    }
    public final double area() {
        return 4 * Math.PI * radius * radius;
    }
}
class AreaCalculator {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println("Area of Circle: " + c.area());

        Sphere s = new Sphere(5);
        System.out.println("Area of Sphere: " + s.area());
    }
}

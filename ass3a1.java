class Circle {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}
class Cylinder extends Circle {
    double height;

    Cylinder(double r, double h) {
        super(r); 
        height = h;
    }

    double area() {
        return 2 * Math.PI * radius * (height + radius);
    }
}
class AreaCalculator {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println("Area of Circle: " + c.area());

        Cylinder cy = new Cylinder(5, 10);
        System.out.println("Area of Cylinder: " + cy.area());
    }
}

abstract class Shape {
    abstract void calc_area();
    abstract void calc_volume();
}
class Sphere extends Shape {
    double radius;

    Sphere(double r) {
        radius = r;
    }

    @Override
    void calc_area() {
        double area = 4 * Math.PI * radius * radius;
        System.out.println("Sphere Area: " + area);
    }

    @Override
    void calc_volume() {
        double volume = (4.0 / 3) * Math.PI * radius * radius * radius;
        System.out.println("Sphere Volume: " + volume);
    }
}
class Cone extends Shape {
    double radius, height;

    Cone(double r, double h) {
        radius = r;
        height = h;
    }

    @Override
    void calc_area() {
        double slant = Math.sqrt(radius * radius + height * height);
        double area = Math.PI * radius * (radius + slant);
        System.out.println("Cone Area: " + area);
    }

    @Override
    void calc_volume() {
        double volume = (1.0 / 3) * Math.PI * radius * radius * height;
        System.out.println("Cone Volume: " + volume);
    }
}
class Main {
    public static void main(String[] args) {
        Sphere s = new Sphere(5);
        s.calc_area();
        s.calc_volume();

        Cone c = new Cone(3, 7);
        c.calc_area();
        c.calc_volume();
    }
}

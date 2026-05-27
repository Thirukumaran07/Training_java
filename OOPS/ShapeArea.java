abstract class Shape {
    abstract double calcArea();
}
class Circle extends Shape {
    double r;
    double calcArea() {
        return 3.14 * r * r;
    }
}
class Rectangle extends Shape {
    double l, w;
    double calcArea() {
        return l * w;
    }
}
public class ShapeArea {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.r = 5;
        System.out.println("Circle Area: " + c.calcArea());
        Rectangle r = new Rectangle();
        r.l = 4;
        r.w = 3;
        System.out.println("Rectangle Area: " + r.calcArea());
    }
}
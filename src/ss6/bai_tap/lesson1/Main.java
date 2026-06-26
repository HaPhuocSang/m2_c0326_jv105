package ss6.bai_tap.lesson1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "Blue");
        System.out.print("Circle: ");
        System.out.println(circle);
        Cylinder cylinder = new Cylinder(5, "Green", 10);
        System.out.print("\nCylinder: ");
        System.out.println(cylinder);
    }
}

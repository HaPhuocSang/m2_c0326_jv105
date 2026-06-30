package ss7.bai_tap.lesson1;

import ss7.bai_tap.lesson1.geometry.Circle;
import ss7.bai_tap.lesson1.geometry.Rectangle;
import ss7.bai_tap.lesson1.geometry.Square;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4,6);
        Square square = new Square(5);
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
        circle.resize(20);
        rectangle.resize(50);
        square.resize(50);
        System.out.println();
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}

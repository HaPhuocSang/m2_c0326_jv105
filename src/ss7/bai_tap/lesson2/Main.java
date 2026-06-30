package ss7.bai_tap.lesson2;

import ss7.bai_tap.lesson2.colorable.Colorable;
import ss7.bai_tap.lesson2.geometry.Circle;
import ss7.bai_tap.lesson2.geometry.Rectangle;
import ss7.bai_tap.lesson2.geometry.Shape;
import ss7.bai_tap.lesson2.geometry.Square;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(2), new Rectangle(4,6), new Square(5)};
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("Area = " + shape.getArea());
            if (shape instanceof Colorable colorable){
                colorable.howToColor();
            }
        }
    }
}

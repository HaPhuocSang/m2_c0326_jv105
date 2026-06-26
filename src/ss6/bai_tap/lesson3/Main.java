package ss6.bai_tap.lesson3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(2.5f, 3.5f);
        System.out.println("===== Point =====");
        System.out.println("X = " + point.getX());
        System.out.println("Y = " + point.getY());
        System.out.println("XY = " + Arrays.toString(point.getXY()));
        MoveablePoint movablePoint = new MoveablePoint(2.5f, 3.5f, 1.0f, 2.0f);
        System.out.println("\n===== MovablePoint =====");
        System.out.println("Speed = " + Arrays.toString(movablePoint.getSpeed()));
        movablePoint.move();
        System.out.println("\nSau khi move():");
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println("\nSau khi move() lần 2:");
        System.out.println(movablePoint);
    }
}

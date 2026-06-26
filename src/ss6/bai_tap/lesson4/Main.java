package ss6.bai_tap.lesson4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh 1: ");
        double side1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập cạnh 2: ");
        double side2 = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập cạnh 3: ");
        double side3 = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập màu: ");
        String color = scanner.nextLine();
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        System.out.println();
        System.out.println("Thông tin tam giác:");
        System.out.println(triangle);
        System.out.println("Chu vi: " + triangle.getPerimeter());
        System.out.println("Diện tích: " + triangle.getArea());
    }
}

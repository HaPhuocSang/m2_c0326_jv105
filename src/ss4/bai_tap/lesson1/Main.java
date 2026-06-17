package ss4.bai_tap.lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giải phương trình bật 2: ax2 + bx + c = 0");
        System.out.println("Nhập số thứ nhất: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số thứ hai: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số thứ ba: ");
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double x1 = quadraticEquation.getRoot1();
        double x2 = quadraticEquation.getRoot2();
        System.out.printf((quadraticEquation.getDiscriminant() >= 0)
                ? "x1 = %.2f; x2 = %.2f"
                : "The equation has no roots",x1,x2
        );
    }
}

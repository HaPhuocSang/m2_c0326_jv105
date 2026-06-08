package ss1.bai_tap.lesson_2;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền USD: ");
        usd = scanner.nextDouble();
        double change = usd * 23000;
        System.out.println("Giá trị VNĐ: " + change);
    }
}

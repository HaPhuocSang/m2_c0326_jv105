package ss8.thuc_hanh.refactoring_doi_ten_bien_va_tach_hang;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        int firstOperand = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số thứ hai: ");
        int secondOperand = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập phép tính: ");
        char operator = scanner.next().charAt(0);
        System.out.println("Kết quả: " + Calculator.calculate(firstOperand, secondOperand, operator));
    }
}

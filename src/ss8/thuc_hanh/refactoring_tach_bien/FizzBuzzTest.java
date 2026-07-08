package ss8.thuc_hanh.refactoring_tach_bien;

import java.util.Scanner;

public class FizzBuzzTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số: ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(FizzBuzz.fizzBuzz(number));
    }
}

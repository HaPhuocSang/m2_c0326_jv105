package ss10.bai_tap.lesson3.untils;

import java.util.Scanner;

public class InputUntil {
    private final static Scanner scanner = new Scanner(System.in);

    public static int inputInt(String message) {
        while (true) {
            try {
                System.out.println(message);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số nguyên!");
            }
        }
    }

    public static double inputDouble(String message) {
        while (true) {
            try {
                System.out.println(message);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số nguyên!");
            }
        }
    }

    public static String inputString(String message) {
        while (true) {
            System.out.print(message);
            String value = scanner.nextLine().trim();
            if (!value.isEmpty()) {
                return value;
            }
            System.out.println("Không được để trống, vui lòng nhập lại!");
        }
    }
}

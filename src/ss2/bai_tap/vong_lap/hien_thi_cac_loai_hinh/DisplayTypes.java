package ss2.bai_tap.vong_lap.hien_thi_cac_loai_hinh;

import java.util.Scanner;

public class DisplayTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while(choice != 4) {
            System.out.println("Menu: ");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("The rectangle: ");
                    for(int i = 1;i <= 3;i++){
                        for (int j = 1;j <= 7;j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    int choiceTriangle = -1;
                    while (choiceTriangle != 5) {
                        System.out.println("The corner is square at 4 different angles: ");
                        System.out.println("1. Top-left");
                        System.out.println("2. Top-right");
                        System.out.println("3. Botton-left");
                        System.out.println("4. Botton-right");
                        System.out.println("5. Exit");
                        System.out.println("Enter your choice: ");
                        choiceTriangle = scanner.nextInt();
                        switch (choiceTriangle) {
                            case 1:
                                for (int i = 1; i <= 5; i++) {
                                    for (int j = 1; j <= i; j++) {
                                        System.out.print("* ");
                                    }
                                    System.out.println();
                                }
                                break;
                            case 2:
                                int n = 5;
                                for (int i = 1; i <= n; i++) {
                                    for (int j = i; j < n; j++) {
                                        System.out.print("  ");
                                    }
                                    for (int j = 1; j <= i; j++) {
                                        System.out.print("* ");
                                    }
                                    System.out.println();
                                }
                                break;
                            case 3:
                                for (int i = 5; i >= 1; i--) {
                                    for (int j = 1; j <= i; j++) {
                                        System.out.print("* ");
                                    }
                                    System.out.println();
                                }
                                break;
                            case 4:
                                int k = 5;
                                for (int i = k; i >= 1; i--) {
                                    for (int j = i; j < k; j++) {
                                        System.out.print("  ");
                                    }
                                    for (int j = 1; j <= i; j++) {
                                        System.out.print("* ");
                                    }
                                    System.out.println();
                                }
                                break;
                            case 5:
                                System.out.println("Exit!");
                                break;
                            default:
                                System.out.println("No choice!");
                        }
                    }
                    break;
                case 3:
                    System.out.println("3. The isosceles triangle");
                    int n = 5;
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Exit program");
                    break;
                default:
                    System.out.println("No choice!");
            }
        }
    }
}

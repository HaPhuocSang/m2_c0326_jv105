package ss3.bai_tap.method.lesson1;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheLargestElementIn2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = inputPositiveInt(scanner,"Nhập số hàng: ");
        int y = inputPositiveInt(scanner,"Nhập số cột: ");
        if (x <= 0 || y <= 0) {
            System.out.println("Hàng hoặc cột không thể <= 0!");
            return;
        }
        int[][] matrix = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.printf("Nhập giá trị tại [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng vừa tạo là: " + Arrays.deepToString(matrix));
        System.out.println("Giá trị lớn nhất là: " + findMax(matrix));
    }

    public static int findMax(int[][] arr) {
        int max = arr[0][0];
        for (int[] row : arr) {
            for (int value : row) {
                if (value > max) {
                    max = value;
                }
            }
        }
        return max;
    }
    public static int inputPositiveInt(Scanner scanner, String message) {
        int value;
        do {
            System.out.print(message);
            value = scanner.nextInt();
            if (value <= 0){
                System.out.println("Giá trị nhập vào không hợp lệ!");
            }
        } while (value <= 0);
        return value;
    }
}

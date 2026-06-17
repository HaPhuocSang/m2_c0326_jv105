package ss3.bai_tap.method.lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheSmallestElementIn2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hàng: ");
        int x = scanner.nextInt();
        System.out.println("Nhập số cột: ");
        int y = scanner.nextInt();
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
        System.out.println("Giá trị nhỏ nhất là: " + findMin(matrix));
    }
    public static int findMin(int[][] arr) {
        int min = arr[0][0];
        for (int[] row : arr) {
            for (int value : row) {
                if (value < min) {
                    min = value;
                }
            }
        }
        return min;
    }
}

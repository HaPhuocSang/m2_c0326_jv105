package ss3.bai_tap.method.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class SumNumbersOnTheMainDiagonalOfMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = inputInt(scanner, "Nhập số hàng và số cột muốn khởi tạo: ");
        int max;
        int min;
        do {
            max = inputInt(scanner, "Nhập giá trị lớn nhất: ");
            min = inputInt(scanner, "Nhập giá trị bé nhất: ");
            if (min > max) {
                System.out.println("Giá trị bé nhất phải nhỏ hơn hoặc bằng giá trị lớn nhất!");
            }
        } while (min > max);
        int [][] array = create2DArray(x,max,min);
        System.out.println("Mảng vừa tạo là: " + Arrays.deepToString(array));
        System.out.println("Tổng các số ở đường chéo chính của ma trận vuông là: " + sumNumberMainDiagonal(array));
    }
    public static int[][] create2DArray(int x, int max, int min){
        int [][] arr = new int[x][x];
        for (int i = 0; i < x;i++){
            for (int j = 0; j < x;j++){
                arr[i][j] = (int)(Math.random() * (max - min + 1)) + min;
            }
        }
        return arr;
    }
    public static int sumNumberMainDiagonal(int[][] arr){
        int sum = 0;
        for (int i = 0;i < arr.length;i++) {
            sum += arr[i][i];
        }
        return sum;
    }
    public static int inputInt(Scanner scanner, String message) {
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

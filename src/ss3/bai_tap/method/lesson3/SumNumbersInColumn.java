package ss3.bai_tap.method.lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class SumNumbersInColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = inputInt(scanner, "Nhập số hàng muốn khởi tạo: ");
        int y = inputInt(scanner, "Nhập số cột muốn khởi tạo: ");
        int max;
        int min;
        do {
            max = inputInt(scanner, "Nhập giá trị lớn nhất: ");
            min = inputInt(scanner, "Nhập giá trị bé nhất: ");
            if (min > max) {
                System.out.println("Giá trị bé nhất phải nhỏ hơn hoặc bằng giá trị lớn nhất!");
            }
        } while (min > max);
        int [][] array = create2DArray(x,y,max,min);
        System.out.println("Mảng vừa tạo là: " + Arrays.deepToString(array));
        int colum;
        do {
            System.out.printf("Nhập số cột muốn tính tổng (1-%d): ",y);
            colum = scanner.nextInt() - 1;
            if (colum < 0 || colum >= y){
                System.out.println("Giá trị nhập vào không hợp lệ!");
            }
        }while (colum < 0 || colum >= y);
        System.out.println("Tổng là: " + sumNumber(array, colum));
    }
    public static int[][] create2DArray(int x, int y, int max, int min){
        int [][] arr = new int[x][y];
        for (int i = 0; i < x;i++){
            for (int j = 0; j < y;j++){
                arr[i][j] = (int)(Math.random() * (max - min + 1)) + min;
            }
        }
        return arr;
    }
    public static int sumNumber(int[][] arr, int col){
        int sum = 0;
        for (int[] row : arr) {
            sum += row[col];
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

package ss2.bai_tap.mang.lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng thứ nhất: ");
        int number1 = scanner.nextInt();
        System.out.println("Nhập số lượng phần tử của mảng thứ hai: ");
        int number2 = scanner.nextInt();
        if (number1 <= 0 || number2 <= 0) {
            System.out.println("Số lượng phần tử phải lớn hơn 0");
            return;
        }
        int[] arr1 = new int[number1];
        int[] arr2 = new int[number2];
        System.out.println("Nhập mảng thứ nhất:");
        for (int i = 0; i < number1; i++) {
            System.out.printf("Nhập phần tử thứ %d của mảng nhất: ", i+1);
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Nhập mảng thứ hai:");
        for (int i = 0; i < number2; i++) {
            System.out.printf("Nhập phần tử thứ %d của mảng hai: ", i+1);
            arr2[i] = scanner.nextInt();
        }
        int[] arr3 = new int[number1 + number2];
        for (int i = 0; i < number1; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < number2; i++) {
            arr3[number1 + i] = arr2[i];
        }
        System.out.println("Mảng sau khi gộp:");
        System.out.println(Arrays.toString(arr3));
    }
}

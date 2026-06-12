package ss2.bai_tap.mang.lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mảng: " + Arrays.toString(arr));
        System.out.print("Nhập số cần chèn: ");
        int number = scanner.nextInt();
        System.out.println();
        System.out.printf("Nhập vị trí index cần chèn %d: ", number);
        int index = scanner.nextInt() - 1;
        System.out.println();
        if (index < 0 || index >= arr.length) {
            System.out.println("Không chèn được");
        } else {
            for (int i = arr.length - 1; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = number;
            System.out.println("Mảng sau khi chèn: " + Arrays.toString(arr));
        }
    }
}

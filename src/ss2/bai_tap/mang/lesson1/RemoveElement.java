package ss2.bai_tap.mang.lesson1;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        Scanner scanner = new Scanner(System.in);
        int indexDel = -1;
        System.out.println("Mảng: " + Arrays.toString(arr));
        System.out.println("Nhập phần tử cần xóa: ");
        int number = scanner.nextInt();
        for (int i = 0; i < arr.length;i++){
            if (number == arr[i]) {
                indexDel = i;
                break;
            }
        }
        if (indexDel == -1) {
            System.out.println("Không tìm thấy phần tử " + number);
        } else {
            arr[indexDel] = 0;
            for (int i = indexDel;i <arr.length - 1;i++){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            System.out.println("Mảng sau khi xóa: " + Arrays.toString(arr));
        }
    }
}

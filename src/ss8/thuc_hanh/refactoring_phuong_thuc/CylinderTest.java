package ss8.thuc_hanh.refactoring_phuong_thuc;

import java.util.Scanner;

public class CylinderTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập bán kính: ");
        int radius = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số chiều cao: ");
        int height = Integer.parseInt(scanner.nextLine());
        System.out.println(Cylinder.getVolume(radius,height));;
    }
}

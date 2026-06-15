package ss2.thuc_hanh.method;

import java.util.Scanner;

public class NumberOfParkingApplications {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30");
        } while (size > 30);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            do {
                System.out.print("Enter a mark for student (1-10) " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
                if (array[i] <= 0 || array[i] > 10){
                    System.out.println("Invalid input value");
                }
            }while (array[i] <= 0 || array[i] > 10);
            i++;
        }
        int count = 0;
        System.out.print("List of mark: ");
        for (int j : array) {
            System.out.print(j + "\t");
            if (j >= 5 && j <= 10)
                count++;
        }
        System.out.print("\n The number of students passing the exam is " + count);
    }
}

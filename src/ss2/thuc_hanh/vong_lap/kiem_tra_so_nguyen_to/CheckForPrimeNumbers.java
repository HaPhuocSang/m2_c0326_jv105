package ss2.thuc_hanh.vong_lap.kiem_tra_so_nguyen_to;

import java.util.Scanner;

public class CheckForPrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println(number + " is not a prime");
        } else {
            int i = 2;
            boolean check = true;
            while (i < number) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            System.out.println(number + (check ? " is a prime" : " is not a prime"));
        }
    }
}

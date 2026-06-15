package ss2.bai_tap.method.lesson5;

import java.util.Scanner;

public class CountNumberOfOccurrencesOfEachCharacterInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi ký tự: ");
        String str = scanner.nextLine();
        String character;
        do {
            System.out.println("Nhập một ký tự muốn đếm: ");
            character = scanner.nextLine();
            if (character.length() != 1){
                System.out.println("Giá trị nhập vào không hợp lệ!");
            }
        }while (character.length() != 1);
        int count = countChar(str,character);
        System.out.printf((count != 0) ? "Số lần xuất hiện của ký tự %s trong chuỗi là: %d" : "Ký tự %s không xuất hiện trong chuỗi!",character,count);
    }
    public static int countChar(String str, String character){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character.charAt(0)) {
                count++;
            }
        }
        return count;
    }
}

package ss2.bai_tap.vong_lap.hien_thi_20_so_nguyen_to_dau_tien;

public class DisplayTheFirst20PrimeNumbers {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        int number = 2;
        int count = 0;
        while (count < 20) {
            boolean isPrime = true;
            int limit = (int) Math.sqrt(number);
            for (int i = 2; i <= limit; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                result.append(number).append(" ");
                count++;
            }
            number++;
        }
        System.out.println(result);
    }
}

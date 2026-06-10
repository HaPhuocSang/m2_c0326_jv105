package ss2.bai_tap.vong_lap.hien_thi_cac_so_nguyen_to_nho_hon_100;

public class DisplayPrimeNumbersLessThan100 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        for (int i = 2; i < 100; i++) {
            boolean isPrime = true;
            int limit = (int) Math.sqrt(i);
            for (int j = 2; j <= limit; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                result.append(i).append(" ");
            }
        }
        System.out.println(result);
    }
}

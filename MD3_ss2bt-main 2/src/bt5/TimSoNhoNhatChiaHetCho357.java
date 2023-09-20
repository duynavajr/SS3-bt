package bt5;

public class TimSoNhoNhatChiaHetCho357 {
    public static void main(String[] args) {
        int N = 1;

        while (true) {
            if (isDivisibleBy357(N)) {
                System.out.println("Số nguyên dương nhỏ nhất chia hết cho 5, 7, và 11 là: " + N);
                break;
            }
            N++;
        }
    }
    public static boolean isDivisibleBy357(int n) {
        if ((n % 5 == 0) && (n % 7 == 0) && (n % 11 == 0)) {
            return true;
        }
        return false;
    }
}

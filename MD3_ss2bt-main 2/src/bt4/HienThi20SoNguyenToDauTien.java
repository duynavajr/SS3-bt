package bt4;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        int numbers = 20;
        int count = 0;
        int N = 2;

        System.out.println("Các " + numbers + " số nguyên tố đầu tiên là:");

        while (count < numbers) {
            if (isPrime(N)) {
                System.out.print(N + " ");
                count++;
            }
            N++;
        }
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

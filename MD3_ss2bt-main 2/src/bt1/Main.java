package bt1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập giá trị đầu của khoảng: ");
        int dau = input.nextInt();
        System.out.print("Nhập giá trị cuối của khoảng: ");
        int cuoi = input.nextInt();
        int total = 0;
        for (int i = dau; i <= cuoi; i++) {
            if (i % 2 == 0) {
               total = total + i;
            }
        }
        System.out.println("Tổng các số chẵn trong khoảng từ " + dau + " đến " + cuoi + " là: " + total);
    }
}

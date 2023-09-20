package bt2;

import java.util.Scanner;

public class HienThiLoaiHinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Chọn loại hình bạn muốn hiển thị:");
            System.out.println("1. Hiển thị tam giác vuông");
            System.out.println("2. Hiển thị hình chữ nhật");
            System.out.println("3. Hiển thị hình tam giác cân");
            System.out.println("4. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    hienThiTamGiacVuong();
                    break;
                case 2:
                    hienThiHinhChuNhat();
                    break;
                case 3 :
                    hienThiHinhTamGiacCan();
                        break;
                case 4:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 4);
    }

    // Hiển thị tam giác vuông
    public static void hienThiTamGiacVuong() {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập chiều cao của tam giác vuông: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Hiển thị hình chữ nhật
    public static void hienThiHinhChuNhat() {
        int width, height;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        width = input.nextInt();
        System.out.print("Nhập chiều cao của hình chữ nhật: ");
        height = input.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void hienThiHinhTamGiacCan(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập chiều cao của tam giác cân: ");
        int height = input.nextInt();
        for (int i = 1; i <= height; i++) {
            // In khoảng trắng để căn lề bên trái
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            // In dấu '*' cho phần tam giác
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // Xuống dòng sau khi in xong một hàng
            System.out.println();
        }
    }
}

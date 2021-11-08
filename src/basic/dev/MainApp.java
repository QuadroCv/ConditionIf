package basic.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/**
		 * 9.1 Viet phuong trinh nhap va kiem tra so nguyen am hay duong
		 */
		int y = sc.nextInt();
		if(y != 0) {
			if(y < 0) {
				System.out.printf("%d la so nguyen am", y);
			}else {
				System.out.printf("%d la so nguyen duong" ,y);
			}
		}else {
			System.out.printf("%d la so 0", y);
		}
		
		/**
		 * 9.2 Viet phuong trinh nhap so nguyen n va kiem tra n chia het cho 5 hay 3
		 */
		int n = sc.nextInt();
		if(n % 5 == 0) {
			System.out.printf("%d chia het cho 5 \n", n);			
		}else {
			System.out.printf("%d Khong chia het cho 5 \n", n);
		}
		if(n%3 == 0) {
				System.out.printf("%d chia het cho 3",n);
		}else {
			System.out.printf("%d Khong chia het cho 3", n);
		}
		/**
		 * 9.3 Viet phuong trinh nhap vao thang va in ra so ngay cua thang do
		 */
		int thang = sc.nextInt();
		if(thang < 13 ) {
			if(thang == 2) {
				System.out.printf("Thang %d co 28 ngay",thang);
			}else {
				if(thang != 4 ||thang != 6||thang !=9||thang !=11) {
					System.out.printf("Thang %d co 31 ngay",thang);
				}else {
					System.out.printf("Thang %d co 30 ngay",thang);
				}
			}
		}else {
			System.out.println("Khong hop le");
		}
		
		/**
		 * 9.4 Viet phuong trinh bac 2
		 */
		float a = sc.nextInt();
		float b = sc.nextInt();
		float c = sc.nextInt();
		if(a == 0) {
			System.out.println("phuong trinh bac nhat");
		}else {
			float delta = (b * b) - (4 * a * c);
			if(delta < 0) {
				System.out.println("phuong trinh vo nghiem");
			}else {
				if(delta == 0)	{
					System.out.printf("phuong trinh co nghiem kep x = %.1f",-b/(2*a));
				}else {
					float x1 = (float) ((-b) + Math.sqrt(delta)) / (2 * a) ;
					float x2 = (float) ((-b) - Math.sqrt(delta)) / (2 * a) ;
					System.out.printf("phuong trinh co 2 nghiem x1 = %.1f ; x2 = %.1f", x1 , x2);
				}
			}
		}
		
		/**
		 * 9.5 Viet phuong trinh nhap 3 so m, k, l .Kiem tra cos phair la tam giac khong ?
		 */
		int m = sc.nextInt();
		int k = sc.nextInt();
		int l = sc.nextInt();
		if ((m + k > l) || (m + l > k) || (k + l > m)) {
			System.out.println("So vua nhap la 3 canh cua tam giac !");
		}else {
			System.out.println("So vua nhap khong phai canh cua tam giac !");
		}
	}
}
	

	
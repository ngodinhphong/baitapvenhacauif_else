package baitapvenhacaudieukien;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		
		// Code đầu vào
		
		String tenSV1, tenSV2, tenSV3;
		int namSinhSV1, namSinhSV2, namSinhSV3;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Sinh vien thu nhat: ");
		System.out.print("\nNhap ten: ");
		tenSV1 = scan.nextLine();
		System.out.print("Nhap nam sinh: ");
		namSinhSV1 = scan.nextInt();
		scan.nextLine();
		
		System.out.print("Sinh vien thu hai: ");
		System.out.print("\nNhap ten: ");
		tenSV2 = scan.nextLine();
		System.out.print("Nhap nam sinh: ");
		namSinhSV2 = scan.nextInt();
		scan.nextLine();
		
		System.out.print("Sinh vien thu ba: ");
		System.out.print("\nNhap ten: ");
		tenSV3 = scan.nextLine();
		System.out.print("Nhap nam sinh: ");
		namSinhSV3 = scan.nextInt();
		
		// Code xử lý
		
		if(namSinhSV1 > namSinhSV2 && namSinhSV1 > namSinhSV3) {
			System.out.println("Sinh viên trẻ tuỏi nhất là: ");
			System.out.println(tenSV1 + " - năm sinh: " + namSinhSV1);
		}else if(namSinhSV2 > namSinhSV1 && namSinhSV2 > namSinhSV3) {
			System.out.println("Sinh viên trẻ tuỏi nhất là: ");
			System.out.println(tenSV2 + " - năm sinh: " + namSinhSV2);
		}else if(namSinhSV3 > namSinhSV1 && namSinhSV3 > namSinhSV2) {
			System.out.println("Sinh viên trẻ tuỏi nhất là: ");
			System.out.println(tenSV3 + " - năm sinh: " + namSinhSV3);
		}else if(namSinhSV1 == namSinhSV2 && namSinhSV1 > namSinhSV3) {
			System.out.println("Có hai sinh viên trẻ tuổi nhất bằng tuổi nhau: ");
			System.out.println(tenSV1 + " - năm sinh: " + namSinhSV1);
			System.out.println(tenSV2 + " - năm sinh: " + namSinhSV2);
		}else if(namSinhSV1 == namSinhSV3 && namSinhSV1 > namSinhSV2) {
			System.out.println("Có hai sinh viên trẻ tuổi nhất bằng tuổi nhau: ");
			System.out.println(tenSV1 + " - năm sinh: " + namSinhSV1);
			System.out.println(tenSV3 + " - năm sinh: " + namSinhSV3);
		}else if(namSinhSV2 == namSinhSV3 && namSinhSV2 > namSinhSV1) {
			System.out.println("Có hai sinh viên trẻ tuổi nhất bằng tuổi nhau: ");
			System.out.println(tenSV2 + " - năm sinh: " + namSinhSV2);
			System.out.println(tenSV3 + " - năm sinh: " + namSinhSV3);
		}else {
			System.out.println("Ba sinh viên bằng tuổi nhau:");
			System.out.println(tenSV1 + " - năm sinh: " + namSinhSV1);
			System.out.println(tenSV2 + " - năm sinh: " + namSinhSV2);
			System.out.println(tenSV3 + " - năm sinh: " + namSinhSV3);
		}
		
		// Code đầu ra
	}

}

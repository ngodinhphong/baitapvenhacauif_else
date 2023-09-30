package baitapvenhacaudieukien;

import java.util.Scanner;

public class bai5 {

	public static void main(String[] args) {
		// Code đầu vào
		
		String tenMatHang;
		int soLuong, donGia;
		double thanhTien = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vui lòng nhập vào tên mặt hàng: ");
		tenMatHang = scan.next();
		System.out.println("Vui lòng nhập vào số lượng: ");
		soLuong = scan.nextInt();
		System.out.println("Vui lòng nhập vào đơn giá: ");
		donGia = scan.nextInt();
		
		// Code xử lý
		
		if(soLuong < 50) {
			thanhTien = soLuong * donGia;
		}else if(soLuong >= 50 && soLuong <= 100) {
			thanhTien = 49 *donGia + (soLuong - 49) * donGia * 0.92;
		}else if(soLuong > 100) {
			thanhTien = 49 *donGia + 50 * donGia * 0.92 + (soLuong - 99) * donGia * 0.88;
		}
		
		// Code đầu ra
		
		System.out.println("Số tiền phải trả là: " + thanhTien);
	}

}

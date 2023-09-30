package baitapvenhacaudieukien;

import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
		
		// Code đầu vào
		
		String tenCB1, tenCB2, tenCB3, gioiTinhCB1, gioiTinhCB2, gioiTinhCB3;
		int namSinhCB1, namSinhCB2, namSinhCB3;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Cán bộ thứ nhất:");
		System.out.println("nhập tên: ");
		tenCB1 = scan.next();
		System.out.println("nhập giới tính: ");
		gioiTinhCB1 = scan.next();
		System.out.println("nhập năm sinh: ");
		namSinhCB1 = scan.nextInt();
		
		System.out.println("Cán bộ thứ hai:");
		System.out.println("nhập tên: ");
		tenCB2 = scan.next();
		System.out.println("nhập giới tính: ");
		gioiTinhCB2 = scan.next();
		System.out.println("nhập năm sinh: ");
		namSinhCB2 = scan.nextInt();
		
		System.out.println("Cán bộ thứ ba:");
		System.out.println("nhập tên: ");
		tenCB3 = scan.next();
		System.out.println("nhập giới tính: ");
		gioiTinhCB3 = scan.next();
		System.out.println("nhập năm sinh: ");
		namSinhCB3 = scan.nextInt();
		
		// Code xử lý
		
		if(gioiTinhCB1.toUpperCase().equals("NAM") && gioiTinhCB2.toUpperCase().equals("NAM") && gioiTinhCB3.toUpperCase().equals("NAM")) {
			if(namSinhCB1 > namSinhCB2 && namSinhCB1 > namSinhCB3) {
				System.out.println("Cán bộ nam trẻ nhất là: " + tenCB1);
			}else if(namSinhCB2 > namSinhCB1 && namSinhCB2 > namSinhCB3) {
				System.out.println("Cán bộ nam trẻ nhất là: " + tenCB2);
			}else if(namSinhCB3 > namSinhCB1 && namSinhCB3 > namSinhCB2) {
				System.out.println("Cán bộ nam trẻ nhất là: " + tenCB3);
			}else if(namSinhCB1 == namSinhCB2 && namSinhCB1 > namSinhCB3) {
				System.out.println("Có hai cán bộ nam trẻ nhất là: " + tenCB1 + " và " + tenCB2);
			}else if(namSinhCB2 == namSinhCB3 && namSinhCB2 > namSinhCB1) {
				System.out.println("Có hai cán bộ nam trẻ nhất là: " + tenCB2 + " và " + tenCB3);
			}else if(namSinhCB1 == namSinhCB3 && namSinhCB1 > namSinhCB2) {
				System.out.println("Có hai cán bộ nam trẻ nhất là: " + tenCB1 + " và " + tenCB3);
			}else {
				System.out.println("Ba cán bộ nam bằng tuổi nhau: " + tenCB1 + " , " + tenCB2 + " và " + tenCB3);
			}
			
		}else if(gioiTinhCB1.toUpperCase().equals("NỮ") && gioiTinhCB2.toUpperCase().equals("NAM") && gioiTinhCB3.toUpperCase().equals("NAM")) {
			if(namSinhCB2 > namSinhCB3) {
				System.out.println("Cán bộ nam trẻ nhất là: " + tenCB2);
			}else if(namSinhCB3 > namSinhCB2) {
				System.out.println("Cán bộ nam trẻ nhất là: " + tenCB3);
			}else if(namSinhCB3 == namSinhCB2) {
				System.out.println("Có 2 cán bộ nam trẻ tuổi nhất: " + tenCB2 + " và " + tenCB3);
			}
		}else if(gioiTinhCB1.toUpperCase().equals("NAM") && gioiTinhCB2.toUpperCase().equals("NỮ") && gioiTinhCB3.toUpperCase().equals("NAM")) {
			if(namSinhCB1 > namSinhCB3) {
				System.out.println("Cán bộ nam trẻ nhất là: " + tenCB1);
			}else if(namSinhCB3 > namSinhCB1) {
				System.out.println("Cán bộ nam trẻ nhất là: " + tenCB3);
			}else {
				System.out.println("Có 2 cán bộ nam trẻ tuổi nhất: " + tenCB1 + " và " + tenCB3);
			}
		}else if(gioiTinhCB1.toUpperCase().equals("NAM") && gioiTinhCB2.toUpperCase().equals("NAM") && gioiTinhCB3.toUpperCase().equals("NỮ")) {
			if(namSinhCB1 > namSinhCB2) {
				System.out.println("Cán bộ nam trẻ nhất là: " + tenCB1);
			}else if(namSinhCB2 > namSinhCB1) {
				System.out.println("Cán bộ nam trẻ nhất là: " + tenCB2);
			}else {
				System.out.println("Có 2 cán bộ nam trẻ tuổi nhất: " + tenCB1 + " và " + tenCB2);
			}
		}else if(gioiTinhCB1.toUpperCase().equals("NAM") && gioiTinhCB2.toUpperCase().equals("NỮ") && gioiTinhCB3.toUpperCase().equals("NỮ")) {
			System.out.println("Cán bộ nam trẻ nhất là: " + tenCB1);
		}else if(gioiTinhCB1.toUpperCase().equals("NỮ") && gioiTinhCB2.toUpperCase().equals("NAM") && gioiTinhCB3.toUpperCase().equals("NỮ")) {
			System.out.println("Cán bộ nam trẻ nhất là: " + tenCB2);
		}else if(gioiTinhCB1.toUpperCase().equals("NỮ") && gioiTinhCB2.toUpperCase().equals("NỮ") && gioiTinhCB3.toUpperCase().equals("NAM")) {
			System.out.println("Cán bộ nam trẻ nhất là: " + tenCB3);
		}else {
			System.out.println("Không có cán bộ nam");
		}
		
		// Code đầu ra

	}

}

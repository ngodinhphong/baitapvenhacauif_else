package baitapvenhacaudieukien;

import java.util.Scanner;

public class bai4 {

	public static void main(String[] args) {
		
		// Code đầu vào
		
		int x1, y1, x2, y2, x3, y3, xDH, yDH;
		Double d1,d2, d3;
		String ten1, ten2, ten3;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Sinh viên thứ nhất:");
		System.out.println("Nhập tên:");
		ten1 = scan.next();
		System.out.println("Nhập tọa độ x:");
		x1 = scan.nextInt();
		System.out.println("Nhập tọa độ y:");
		y1 = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Sinh viên thứ hai:");
		System.out.println("Nhập tên:");
		ten2 = scan.next();
		System.out.println("Nhập tọa độ x:");
		x2 = scan.nextInt();
		System.out.println("Nhập tọa độ y:");
		y2 = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Sinh viên thứ ba:");
		System.out.println("Nhập tên:");
		ten3 = scan.next();
		System.out.println("Nhập tọa độ x:");
		x3 = scan.nextInt();
		System.out.println("Nhập tọa độ y:");
		y3 = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Trường đại học:");
		System.out.println("Nhập tọa độ x:");
		xDH = scan.nextInt();
		System.out.println("Nhập tọa độ y:");
		yDH = scan.nextInt();
		
		// Code xử lý
		
		d1 = Math.sqrt(Math.pow((xDH -x1), 2) + (Math.pow((yDH - y1), 2)));
		d2 = Math.sqrt(Math.pow((xDH -x2), 2) + (Math.pow((yDH - y2), 2)));
		d3 = Math.sqrt(Math.pow((xDH -x3), 2) + (Math.pow((yDH - y3), 2)));
		
		// Code đầu ra
		
		if(d1 > d2 && d1 > d3) {
			System.out.println("Sinh viên xa trường nhất là : " + ten1);
		}else if(d2 > d1 && d2 > d3) {
			System.out.println("Sinh viên xa trường nhất là : " + ten2);
		}else if(d3 > d1 && d3 > d2) {
			System.out.println("Sinh viên xa trường nhất là : " + ten3);
		}else if(d1 == d2 && d1 > d3) {
			System.out.println("Sinh viên xa trường nhất là : " + ten1 + " và " + ten2);
		}else if(d1 == d3 && d1 > d2) {
			System.out.println("Sinh viên xa trường nhất là : " + ten1 + " và " + ten3);
		}else if(d2 == d3 && d2 > d1) {
			System.out.println("Sinh viên xa trường nhất là : " + ten2 + " và " + ten3);
		}else {
			System.out.println("Cả ba sinh viên có khảng cách đến trường bằng nhau");
		}
		
	}

}

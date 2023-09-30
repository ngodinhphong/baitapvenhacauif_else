package baitapvenhacaudieukien;

import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		
		// Code đầu vào
		
		int so1, so2, so3;
		int soLe = 0, soChan = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vui lòng nhập vào số nguyên thứ nhất: ");
		so1 = scan.nextInt();
		
		System.out.println("Vui lòng nhập vào số nguyên thứ nhất: ");
		so2 = scan.nextInt();
		
		System.out.println("Vui lòng nhập vào số nguyên thứ nhất: ");
		so3 = scan.nextInt();
		
		// Code xử lý
		
		if(so1 % 2 == 0 ) {
			soChan ++;
		}else {
			soLe ++;
		}
		
		if(so2 % 2 == 0 ) {
			soChan ++;
		}else {
			soLe ++;
		}
		
		if(so3 % 2 == 0 ) {
			soChan ++;
		}else {
			soLe ++;
		}
		
		// Code đầu ra
		
		System.out.printf("Vậy có %d số chẳn và %d số lẻ", soChan, soLe);

	}

}

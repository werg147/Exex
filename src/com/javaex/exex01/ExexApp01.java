package com.javaex.exex01;

import java.util.Scanner;

public class ExexApp01 {

	public static void main(String[] args) {
		// Practice05 7번문제

		Scanner sc = new Scanner(System.in);
		Exex01[] frArray = new Exex01[3];
		
		System.out.println("친구를 3명 등록해주세요.");
		
		for(int i=0; i<frArray.length; i++) {
			System.out.print("이름: ");
			String name = sc.nextLine();
			System.out.print("핸드폰: ");
			String hp = sc.nextLine();
			System.out.print("학교: ");
			String school = sc.nextLine();
			
			Exex01 fr = new Exex01();
			fr.setName(name);
			fr.setHp(hp);
			fr.setSchool(school);
			
			frArray[i] = fr;
			
		}
		
		for(int i=0; i<frArray.length; i++) {
			frArray[i].showInfo();
		}
		
		
		
		
		sc.close();
		
		
	}

}

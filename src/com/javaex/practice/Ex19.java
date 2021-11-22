package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		

		int sum = 0 ;
		boolean run = true;
		
		while(run){
			System.out.println("");
			System.out.println("----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 |4.종료");
			System.out.println("----------------------------------");
			System.out.print("선택>");
			
			int menuNo = sc.nextInt();
			
			switch(menuNo){
			
				case 1:
					System.out.print("예금액>");
					sum = sum + sc.nextInt();
					break;
				
				case 2:
					System.out.print("출금액>");
					sum = sum - sc.nextInt();
					break;
					
				case 3:
					System.out.print("잔고액>");
					System.out.println(sum);
					break;
				
				case 4:
					System.out.print("");
					run = false;
					break;
					
				default :
					System.out.println("다시입력해주세요");
					break;
					
			}//switch 
			
		}//while
		
		System.out.print("프로그램 종료");
		sc.close();
	}

}

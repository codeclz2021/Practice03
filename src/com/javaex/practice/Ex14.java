package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		int inputNum;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		inputNum = sc.nextInt();
		
		
		for(int i=1; i<=inputNum; i++) {
			sum = sum + i;
			if(i==inputNum) {
				System.out.println(i);
			}else {
				System.out.print(i + "+");
			}
			
		}
		System.out.println("합계: " + sum);
		

		sc.close();

	}

}

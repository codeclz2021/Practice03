package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {

		int inputNum;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		inputNum = sc.nextInt();
		
		
		for(int i=1; i<=inputNum; i++) {
			//System.out.println(inputNum%i);
			if(inputNum%i == 0) {
				System.out.println(i);
			}
		}

		sc.close();

	}

}

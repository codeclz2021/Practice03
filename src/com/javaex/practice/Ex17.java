package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		int inputNum;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		inputNum = sc.nextInt();

		
		for(int y=1; y<=inputNum; y++) {

			for(int x=1; x<=inputNum+1-y; x++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
		

		sc.close();

	}

}

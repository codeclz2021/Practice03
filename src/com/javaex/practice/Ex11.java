package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int startNum;
		int sum = 0;

		if (num % 2 == 1) {
			startNum = 1;
		} else {
			startNum = 2;
		}

		for (int i = startNum; i <= num; i = i + 2) {
			sum = sum + i;
		}

		System.out.println("결과값: " + sum);
		sc.close();
	}

}

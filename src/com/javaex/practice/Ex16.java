package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {

		int inputNum;
		int count=0;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		inputNum = sc.nextInt();
		
		for(int i=1; i<=inputNum; i++) {
			
			//5의 배수일때
			if(i%5 == 0) {
				//개수 count
				count++; //count=count+1,  count+=1
				
				//합 sum
				sum = sum + i;
			}
		}
		System.out.println("5의배수의 개수: " + count);
		System.out.println("5의배수의 합  : " + sum);
		sc.close();

	}

}

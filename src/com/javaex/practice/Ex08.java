package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			for (int dan = 2; dan <= 9; dan++) {
				System.out.print(dan + "*" + i + "=" + dan * i);
				System.out.print("\t");
			}

			System.out.println("");
		}

	}

}

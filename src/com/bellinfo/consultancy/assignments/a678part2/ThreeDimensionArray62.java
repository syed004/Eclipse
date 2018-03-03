package com.bellinfo.consultancy.assignments.a678part2;

import java.util.Scanner;

public class ThreeDimensionArray62 {

	public static void main(String[] args) {
		System.out.println("enter the table no");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		for (int i = 1; i < 11; i++) {
			for (int j = 1; j < 11; j++) {
				System.out.println(a + "*" + i + "*"+j+"= " + (a * i*j));
			}
		}

	}

}

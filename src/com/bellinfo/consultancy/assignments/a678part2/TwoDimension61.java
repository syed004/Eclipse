package com.bellinfo.consultancy.assignments.a678part2;

import java.util.Scanner;

public class TwoDimension61 {
public static void main(String[] args) {
	System.out.println("enter the table no");
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	for(int i=1;i<11;i++){
		System.out.println(a+"*"+i+" = "+(a*i));
	}
}
}

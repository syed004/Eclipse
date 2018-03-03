package com.bellinfo.consultancy.assignments.a678part2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortNumbers63and4 {

	public static void main(String[] args) {
		System.out.println(" Enter the number  of elements");
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int[] al=new int[a];
        for(int i=0;i<a;i++){
        	System.out.println("enter "+i+" Element");
        	al[i]=scan.nextInt();
        	
        }
		
	
		for (int i = 0; i < al.length; i++) {
			for (int j = i + 1; j < al.length; j++) {
				if (al[i]>al[j]) {
					int temp=al[i];
					al[i]=al[j];
					al[j]=temp;
				}
			}
		}
		for(int i=0;i<al.length;i++)
		System.out.print(al[i]+", ");
		System.out.println("the second highest is: "+al[(al.length-2)]);

	}

}

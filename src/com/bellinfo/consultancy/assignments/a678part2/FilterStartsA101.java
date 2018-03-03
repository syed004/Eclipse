package com.bellinfo.consultancy.assignments.a678part2;

import java.util.Arrays;
import java.util.List;

public class FilterStartsA101 {

	public static void main(String[] args) {
		List<String> list1= Arrays.asList("d2","a2","b1","b3","c","A1");
		list1.stream()
		.map(a->a.toUpperCase())
		.filter((a)->a.startsWith("A"))
		.forEach(a->System.out.println("the strings starting with a is: "+a));

	}

}

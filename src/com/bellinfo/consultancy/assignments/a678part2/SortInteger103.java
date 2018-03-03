package com.bellinfo.consultancy.assignments.a678part2;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class SortInteger103 {

	public static void main(String[] args) {
		 List<Integer> numbers = Arrays.asList(1, 5, 7, 3, 8, 10, 48, 67,
				 2, 23, 56, 11, 4, 100);
		 
		Collection<Integer> list1= numbers.stream().filter(a->a>5)
		 .collect(Collectors.toList());
		System.out.println(list1);
		 

	}

}

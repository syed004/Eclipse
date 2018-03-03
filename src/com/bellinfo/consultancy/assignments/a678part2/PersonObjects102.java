package com.bellinfo.consultancy.assignments.a678part2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PersonObjects102 {
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Max", 18), new Person("Peter", 23), new Person("Pamela", 23),
				new Person("David", 12));
		
		
		Collection<Person> list2=
				persons.stream().filter(a -> a.getName().startsWith("P"))
		//.forEach(a -> System.out.println("the Persons starting with P are: " + a));
		.collect(Collectors.toList());
		System.out.println(persons);
		System.out.println(list2);

	}
}

class Person {
	String name;
	int age;

	public Person(String name, int age) {

		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
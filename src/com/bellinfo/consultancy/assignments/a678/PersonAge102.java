package com.bellinfo.consultancy.assignments.a678;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonAge102 {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Max", 18), new Person("Peter", 23), new Person("Pamela", 23),
				new Person("David", 12));

		System.out.println("*************");
		Collection<Person> list1 = persons.stream().sorted(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				if (o1.getAge() < o2.getAge())
					return -1;
				if (o1.getAge() > o2.getAge())
					return 1;
				return 0;
			}
		}).collect(Collectors.toList());

		System.out.println(list1);

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

	public int getAge() {
		return age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
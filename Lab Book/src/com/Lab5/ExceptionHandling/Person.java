package com.Lab5.ExceptionHandling;

public class Person {
	private String name;
	private int age;

	public Person() {
		super();
	}

	public Person(String name, int age) throws UnderAgeException {
		super();
		this.name = name;
		if (age< 15) {
			throw new UnderAgeException("Age of a person should be above 15");
		} else {
			this.age = age;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws UnderAgeException {
		if (age< 15) {
			throw new UnderAgeException("Age of a person should be above 15");
		} else {
			this.age = age;
		}
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}

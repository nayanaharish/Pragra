package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		Employee<Integer,String,String ,Integer> emp1 = new Employee<>(1,"A","A",1111);

		System.out.println(emp1.getId());
	}
}
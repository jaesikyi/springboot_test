package com.springboot.carmel;

public class ExampleServices {
	public static void example(MyBean bodyIn) {
		bodyIn.setName("Hello "+bodyIn.getName());
		bodyIn.setId(bodyIn.getId()*10);
	}
}

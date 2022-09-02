package java8.day2;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<String, Integer> functionDemo = name -> name.length();

		System.out.println(functionDemo.apply("helllo"));

	}

}

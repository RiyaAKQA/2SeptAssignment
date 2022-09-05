package AssignmentDay3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 1. Create a List of the square of all distinct numbers
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);

		numbers.stream().distinct().forEach(x -> System.out.println(x * x)); //to print
		
		
		//2. Given a list of integers, find out all the even numbers exist in the list using Stream functions?
		 
		List<Integer> evenNumbers = numbers.stream().filter(num -> num%2 == 0).collect(Collectors.toList());
		System.out.println(evenNumbers);
		
		
		//3.Given a list of integers, find the total number of elements present in the list using Stream functions?

		long count = numbers.stream().count();
		System.out.println(count);
		
	}

}

package day3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CitiesStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> citiesList = Arrays.asList("chennai","", "mumbai", "bangalore" , "delhi" ,"chicago","chennai");
		
		//A.count how many cities start with c
		
		long outputCount = citiesList.stream().filter(name -> name.startsWith("c")).count();
		System.out.println(outputCount);
		
		//B.try to print , all the cities using foreach. 
		
		citiesList.stream().forEach(x-> System.out.println(x));
		
		//C.try to find distinct cities 
		
		List<String> outputList = citiesList.stream().distinct().collect(Collectors.toList());
		System.out.println(outputList);

		//D. count the empty string
		
		 long emptyString = citiesList.stream().filter(name-> name.isEmpty()).count();
		 System.out.println(emptyString);
		 
		 //2. find the sum of numbers from 1 to 25
		 
		System.out.println(IntStream.range(1,26).sum());

	}

}

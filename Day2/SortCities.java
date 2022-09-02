package day2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortCities {
	
	public static void main(String[] args) {

	List<String> cityList = Arrays.asList("Gurgaon" ,"Chennai", "Mumbai" , "Jaipur" , "Kolkata", "Hyderabad");

	List<String> sortedList = cityList.stream().sorted().collect(Collectors.toList());
	
	System.out.println(sortedList);
	
  }

}
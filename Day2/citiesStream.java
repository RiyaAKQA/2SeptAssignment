package day2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class citiesStream {
	public static void main(String[] args) {
//3rd
	List<String> cityList = Arrays.asList("NewDelhi", "Gurgaon", "mumbai", "Tokyo");
	
	List<String> outputList = cityList.stream().filter(name -> name.contains("ai")).collect(Collectors.toList());
	
	System.out.println(outputList);
	
//4th	
	List<String> resultList =cityList.stream()
			.map(name -> name.concat("metro")).sorted().collect(Collectors.toList());
	System.out.println(resultList);

  }
}

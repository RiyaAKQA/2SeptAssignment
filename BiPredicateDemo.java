package java8.day2;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateDemo {

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> greaterThanPredicate = (mark1, mark2) -> mark2 > mark1;
		System.out.println(greaterThanPredicate.test(30, 40));
		
		BiPredicate<Integer, Integer> lessThanPredicate = (mark1 , mark2) -> mark2 < mark1;
		System.out.println(lessThanPredicate.test(30,90));
		
		BiPredicate<Integer,Integer> equalToPredicate = (mark1, mark2) -> mark2 == mark1;
		System.out.println(equalToPredicate.test(90,90));
		
		System.out.println("and checking" + greaterThanPredicate.and(equalToPredicate).test(80,86));
		System.out.println("and checking" + greaterThanPredicate.or(equalToPredicate).test(100,90));

	}

}

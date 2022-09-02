package java8.day2;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		BiConsumer<Integer, Integer> bcl1 = (x, y) -> System.out.println(x + y);
////		bcl1.accept(10, 20);
//
//		BiConsumer<Integer, Integer> bcl2 = (x, y) -> System.out.println(x - y);
////		bcl2.accept(10, 20);
//
//		bcl1.andThen(bcl2).accept(20, 20);

		
		BiConsumer<String , String> b1 = (x,y) -> System.out.println(x + y);
		b1.accept("Hello", " There");
		
		
	}

}

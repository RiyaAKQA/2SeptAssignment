/**
 * 
 */
package java8.day2;

import java.util.function.Consumer;

/**
 * @author riya.grover
 *
 */
public class ConsumerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Consumer<String> consumer = (name) -> System.out.println(name.toUpperCase());
		// left hand : Functional interface
//		right hand: lamba expression

//		consumer.accept("hello");

		Consumer<String> consumerDemo = (name) -> System.out.println(name.length());
//     	consumerDemo.accept("team");

//     	
		consumer.andThen(consumerDemo).accept("team");// calling both the consumer // and then
		// should have same datatype

		Consumer<Integer> consumerInteger = (mark) -> System.out.println(mark + 10);
//     	consumerInteger.accept(30);

		Consumer<Integer> consumerIntegerDemo = (mark) -> System.out.println(mark - 10);
//    	

	}

}

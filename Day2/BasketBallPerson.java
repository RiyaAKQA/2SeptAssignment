package day2;

import java.util.List;
import java.util.function.BiPredicate;

public class BasketBallPerson {
	static List<Person> personList = PersonRepository.getAllPersons();

	static BiPredicate<Integer, String> HeightOfPlayer = (height, gender) -> height > 50 && gender == "Male";

	private static void fetchHeight() {
		personList.forEach(person -> {

			if (HeightOfPlayer.test(person.getHeight(), person.getGender())) {
				System.out.println(person);
			}

		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fetchHeight();
	}
}

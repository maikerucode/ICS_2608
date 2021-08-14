import java.util.*;

public class TestListPerson {
	public static void main(String args[]) {
		Person p1 = new Person("Peter", 20);
		Person p2 = new Person("Mark", 30);
		Person p3 = new Person("Luke", 24);
		Person p4 = new Person("John", 18);
		Person p5 = new Person("James", 27);

		List<Person> people = new ArrayList<>();

		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		people.add(p5);

		Collections.sort(people);	// sorting in ascending order.
		System.out.println("Ascending order: ");
		for (Person p : people) {
			System.out.println(p);
		}

		Collections.sort(people, Collections.reverseOrder()); // sorting in descending order.
		System.out.println("Descending order: ");
		for (Person p : people) {
			System.out.println(p);
		}

	}
}

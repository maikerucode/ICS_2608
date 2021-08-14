import java.util.*;

public class TestPerson {
	public static void main(String args[]) {
		Person p1 = new Person("Peter", 20);
		Person p2 = new Person("Mark", 30);
		Person p3 = new Person("Luke", 24);
		Person p4 = new Person("John", 18);
		Person p5 = new Person("James", 27);

	//  Set<Person> people = new HashSet<Person>();
		Set<Person> people = new TreeSet<>();

		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		people.add(p5);
		// people.add(100);
		// people.add("Lawrence");

	//	System.out.println(people);

		Iterator<Person> it = people.iterator();

		int sum = 0;

		while(it.hasNext())
		{
			// Person p = (Person) it.next();
			Person p = it.next();
			System.out.println(p);
			// System.out.println(p.getName());
			sum += p.getAge();
		}
		double ave = (double) sum / people.size();
		System.out.println("Sum of age values are: " + sum);
		System.out.println("Average age of all objects are: " + ave);
	}
}


public class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// getters
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	// toString method
	public String toString() {
		return getName() + ", at age " + getAge();
	}

	// equals and hashCode method
	// p1.equals(p2)
	public boolean equals(Object obj) {
		boolean result = false;

		if (obj != null && obj instanceof Person ) {
			Person p = (Person) obj;
			if (this.getName().equals(p.getName()) && this.getAge() == p.getAge()) {
				result = true;
			}
		}
		return result;
	}

	public int hashCode() {
		return getName().hashCode() ^ getAge();
	}

	// compareTo() for the name
	// public int compareTo(Person p)
	// {
	// 	int result = this.getName().compareTo(p.getName());
	//
	// 	if (result > 0)
	// 		result = 1;
	// 	else if (result < 0)
	// 		result = -1;
	// 	else if (result == 0)
	// 		result = 0;
	//
	// 	return result;
	// }

	// compareTo() for the age
	public int compareTo(Person p)
	{
		int result = this.getAge() - p.getAge();

		if (result < 0)
			result = -1;
		else if (result > 0)
			result = 1;
		else if (result == 0)
			result = 0;

		return result;
	}
}

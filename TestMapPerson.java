import java.util.*;

public class TestMapPerson {
	public static void main(String args[]) {
		Person p1 = new Person("Peter", 20);
		Person p2 = new Person("Mark", 30);
		Person p3 = new Person("Luke", 24);
		Person p4 = new Person("John", 18);
		Person p5 = new Person("James", 27);

		Map<Integer, Person> employees = new TreeMap<>();

		employees.put(new Integer(201), p1);
		employees.put(102, p2);
		employees.put(303, p3);
		employees.put(104, p4);
		employees.put(405, p5);

	//	System.out.println(employees);
		for(Map.Entry<Integer, Person> employee : employees.entrySet()) {
			System.out.println("EmployeeID: " + employee.getKey() +
				       	"\nEmployee Details: " + employee.getValue());
			System.out.println();
		}
	
	}
}


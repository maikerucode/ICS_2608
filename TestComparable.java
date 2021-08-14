public class TestComparable {
	public static void main(String args[]) {
		System.out.println("alpha".compareTo("bravo"));			// -1
		System.out.println("bravo".compareTo("bravo"));			// 0
		System.out.println("charlie".compareTo("alpha"));		// +1
	}
}

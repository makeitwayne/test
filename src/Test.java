
public class Test {
	public static void main(String[] args) {
		System.out.println("This is a test code");
		System.out.println("This shit better work");

		char[] test = { 'm', 'a', 'k', 'e', ' ', 'i', 't', ' ', 'w', 'a', 'y', 'n', 'e' };

		int total = 0;
		for (int i = 0; i < test.length; i++) {
			System.out.print(test[i]);
			total++;
			if (i == test.length - 1) {
				System.out.println();
			}
		}
		System.out.println("Total characters: " + total);
	}
}

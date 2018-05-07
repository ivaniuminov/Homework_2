import java.util.Scanner;

public class Task_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		sc.nextLine();
		String str = sc.nextLine();
		
		char[] array = str.toCharArray();
		int counter = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == ch) {
				counter++;
			}
		}
		
		System.out.println(counter);
	}

}

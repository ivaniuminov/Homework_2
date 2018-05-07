import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		
		char[] stingChars = inputString.toCharArray();
		int length = stingChars.length;
		boolean isPalindrome = true;
		
		for (int i=0; i < length / 2; i++) {
			if (stingChars[i] != stingChars[length - i - 1]) {
				isPalindrome = false;
				break;
			}
		}
		
		System.out.println((isPalindrome) ? "is palindrome" : "isn't palindrome");
	}

}

import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		sc.nextLine();
		char[] array = sc.nextLine().toCharArray();
		
		char temp;
		for(int k=0; k < j - i; k++) {
			temp = array[i + k];
			array[i + k] = array[j - k];
			array[j - k] = temp;
		}
		
		System.out.println(String.valueOf(array));

	}

}

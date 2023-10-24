package psvm_code;
import java.util.Scanner;

public class SubString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String s = scanner.nextLine();
		
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		
		String substring = s.substring(start, end );
		
		System.out.println(substring);
		
		scanner.close();
		
	}
}

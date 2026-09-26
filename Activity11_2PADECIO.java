package PadecioCSM101;
import java.util.Arrays;
import java.util.Scanner;

public class Activity11_2PADECIO {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] names = {"Jenna", "Lilah", "Dreigh", 
				"Tilda", "Jennifer", "Allison"};
		
		System.out.print("Search a name in the list > ");
		String userInput = sc.nextLine();
		
		int found = 0;
		for (int i = 1; i < names.length; i++) {
			
			if (userInput.equalsIgnoreCase(names[i])) {
				found = 1;
				System.out.printf("Found (%s)", userInput);
				break;
			}
		}
		
		if (found == 0) {
			System.out.printf("Not Found (%s)", userInput);
		}
		
	}

}

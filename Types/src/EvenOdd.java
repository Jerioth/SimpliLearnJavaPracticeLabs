import java.util.*;
public class EvenOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number:");
		int number = scanner.nextInt();
		
		boolean isEven =(number % 2 == 0);
		if (isEven)
		{
			
			System.out.println(number + " is even");
		}
		
		else {
			System.out.println(number + " is odd");
		}
		
		

	}

}

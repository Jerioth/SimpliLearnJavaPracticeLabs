import java.util.*;
public class Average {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first Number:" );
		double number1 = scanner.nextDouble();
		
		System.out.print("Enter the second Number:" );
		double number2 = scanner.nextDouble();
		
		double average = (number1 + number2)/2;
		
		int roundAverage = (int) Math.round(average);
		
		System.out.println("The Avarage is " + roundAverage);

		

	}

}

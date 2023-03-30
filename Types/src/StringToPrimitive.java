import java.util.*;
public class StringToPrimitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a string value");
	String input = scanner.nextLine();
	
	
	int intValue = Integer.parseInt(input);
	System.out.println("The interger is : " + intValue );
	
	double doubleValue = Double.parseDouble(input);
	System.out.println("The double is : " + doubleValue );
	

	}

}

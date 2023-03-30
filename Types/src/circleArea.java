import java.util.*;
public class circleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the radius");
		double radius = scanner.nextDouble();
		double area =Math.PI * Math.pow(radius, 2);
		System.out.println("The are of the circle is: " + area);

	}

}

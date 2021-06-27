import java.util.Scanner;
public class HelloMessage {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter x and y coordinates of first line");
		Scanner obj1 = new Scanner(System.in);
		int x11 = obj1.nextInt();
		int y11 = obj1.nextInt();
		int x12 = obj1.nextInt();
		int y12 = obj1.nextInt();
		System.out.println("Enter x and y coordinates of second line");
		int x21 = obj1.nextInt();
		int y21 = obj1.nextInt();
		int x22 = obj1.nextInt();
		int y22 = obj1.nextInt();
		double length1 = Math.sqrt(Math.pow(x12-x11,2) + Math.pow(y12-y11,2));
		double length2 = Math.sqrt(Math.pow(x22-x21,2) + Math.pow(y22-y21,2));
		if (length1 > length2)
		{
			System.out.println("The first line is greater");
		}
		else if (length2 > length1)
		{
			System.out.println("The second line is greater");
		}
		else
		{
			System.out.println("Both lines are equal");
		}
	}
}

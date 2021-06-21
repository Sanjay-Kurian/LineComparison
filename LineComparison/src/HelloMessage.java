import java.util.Scanner;
public class HelloMessage {
	public static void main(String[] args) {
		System.out.println("Enter x and y coordinates");
		Scanner myObj = new Scanner(System.in);
		int x1 = myObj.nextInt();
		int y1 = myObj.nextInt();
		int x2 = myObj.nextInt();
		int y2 = myObj.nextInt();
		double length = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		System.out.println("The length of the line is " +length);
	}
}

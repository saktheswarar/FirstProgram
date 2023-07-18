package sakthe2;
import java.util.Scanner;
public class odd_even {
	public static void main(String args[]) {
		Scanner sa=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sa.nextInt();
		if(a%2==0) {
			System.out.println(a+"is even");
		}
		else {
			System.out.println(a+"is odd");
		}
	}
	

}
 
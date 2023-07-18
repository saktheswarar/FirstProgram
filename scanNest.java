package sakthe2;
import java.util.Scanner;
public class scanNest {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the int val");
		int i=s.nextInt();
		System.out.println("enter the long val");
		long l=s.nextLong();
		if(i>=l) {
			System.out.println("this condition true ");
		}
		else if(i<l) {
			System.out.println("this 2nd con is true");
		}
		else {
			System.out.println("all condition are false");
		}
		
	}

}

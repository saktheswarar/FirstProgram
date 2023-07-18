package sakthe2;
import java.util.Scanner;
public class calculate_cgpa {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		for(int i=1; i<=5; i++) {
			System.out.println("Enter the mark for subject: ");
		int m1=input.nextInt();
		int m2=input.nextInt();
		int m3=input.nextInt();
		int m4=input.nextInt();
		int m5=input.nextInt();
		int totalmark=(m1+m2+m3+m4+m5);
		int totalcgpa=((totalmark/5)/10);
		System.out.println("Enter the credit for subject: ");
		int credit=input.nextInt();
		System.out.println(totalmark);
		System.out.println(totalcgpa);
		}
	
	
		
	}

}

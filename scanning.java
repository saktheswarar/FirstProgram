package sakthe2;
import java.util.Scanner;
public class scanning {
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter byte val");
	byte b=s.nextByte();
	System.out.println("this is my byte val:"+b);
	System.out.println("enter the short val");
	short sh=s.nextShort();
	System.out.println("enter the int val");
	int i=s.nextInt();
	long l=s.nextLong();
	float f=s.nextFloat();
	double d=s.nextDouble();
	boolean e=s.nextBoolean();
	String a=s.nextLine();
	System.out.println("enter the double val");
	System.out.println(b+sh);

	
	/*
	 *
	 * byte - nextByte
	 * 
	 * int  - nextInt
	 *
	 *
	 *
	 *
	 *
	 *String - nextLine
	 */
	
}
}

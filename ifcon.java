package sakthe2;

import java.util.Scanner;

public class ifcon {

	public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter byte val");
	byte b=s.nextByte();
	System.out.println("enter the short val");
	short sh=s.nextShort();
	if(b>=sh) {
		System.out.println("the con is true");
	}
	else {
		System.out.println("the con is false");
	}
}
}
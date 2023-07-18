package sakthe2;
import java.util.Scanner;
public class scan_opr {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the value for a: ");
		byte a=input.nextByte();
		System.out.println("enter the value for b: ");
		short b=input.nextShort();
		System.out.println("enter the value for c: ");
		int c=input.nextInt();
		System.out.println(a+b);
		System.out.println(b%c);
		System.out.println(a<b);
		System.out.println(b>c && b<c);
		System.out.println(b>=a || a<b);
		System.out.println("enter the value for d: ");
		int d=input.nextInt();
		System.out.println("enter the value for e: ");
		int e=input.nextInt();
		System.out.println(d<<e);
		System.out.println(d++);
		System.out.println(--e);
		System.out.println(e=a-b);
		System.out.println(e);
		
	
	}

}

package sakthe2;

public class publickey {
	byte a=23;
	short b=768;
	int c=7242;
	long d=4345689L;
	float e=79.7F;
	double f=546.24D;
	boolean g=true;
	char h='s';
	String i="Anto";
}
 class sak{
public static void main(String args[]) {
	publickey z= new publickey();
	System.out.println(z.a+"hiii");
	System.out.println(z.b/z.c);
	System.out.println(z.d%z.a);
	System.out.println(z.g);
}

}
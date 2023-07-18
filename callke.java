package sakthe2;

public class callke {
	int a;
	float b;
	long f;
	String e;
	
	callke(int d, float b,long f, String e){
		a=d;
		this.b=b;
		this.f=f;
		this.e=e;
		
	}
	void call() {
	System.out.println(a+b);
}
public static void main(String args[]) {
	callke c=new callke(34,34.4f,2343424,"anto");
	System.out.println(c.b);
	c.call();
}}

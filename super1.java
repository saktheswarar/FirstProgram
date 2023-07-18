package sakthe2;

public class super1 {
	void pinchange() {
		System.out.println("ok its changed 1111");
	}
	}
class sub extends super1{
	void pinchange() {
	super.pinchange();
		System.out.println("ok its changed 2222");
		
	}
}
class subb extends super1{
	void pinchange() {
		super .pinchange();
		System.out.println("ok its changed 3333");
}
	public static void main(String args[]) {
	sub a=new sub();
	a.pinchange();
	subb b=new subb();
	b.pinchange();
	
	
	}}

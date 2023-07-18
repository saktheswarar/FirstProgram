package sakthe2;

public class school {

void result () {
	System.out.println("pss");
}
}
class room extends school{
	void result () {
		System.out.println("mm");}
	
}
class student extends school{
	void result () {
		System.out.println("kk");
	}

	public static void main(String args[]) {
		school a=new room();
		school b=new student();
		a.result();
		b.result();
		
	
}}
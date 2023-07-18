package sakthe2;

public class parameterized {
	int a;
	String b;
	boolean c;
	parameterized(int d,String f,boolean g){
		a=d;
		b=f;
		c=g;
		
	}
	parameterized(int z,boolean r){
		
		c=r;
		a=z;
	}
	
	public static void main(String args[]) {
		parameterized v=new parameterized(53, "sakthi", true);
		parameterized s=new parameterized(22,"anto", false);
		parameterized w=new parameterized(54,true);
		System.out.println(v.a);
		System.out.println(v.b);
		System.out.println(v.c);
			System.out.println(s.a);
			System.out.println(s.b);
			System.out.println(s.c);
			System.out.println(w.c);

}
}
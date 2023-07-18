package sakthe2;

public class system {
	int input() {
		return 45;
	
	}}
	class remote extends system{
		int input() {
			return 56;
		}}
		class keyboard extends system{
			int input() {
				return 77;
			}
		
	
	public static void main(String args[]) {
		system a=new remote();
		system b=new keyboard();
		system c=new system();
		System.out.println(c.input());
		System.out.println(a.input());
		System.out.println(b.input());
		
	}

}

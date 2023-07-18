package sakthe2;

public class studentMark {
	int a=76;
	int b=55;
	int c=65;
	void Thankyou(){
		System.out.println("Total mark of the student");
		System.out.println(a+b+c);
	}
	public static void main(String args[]) {
		studentMark s=new studentMark();
		System.out.println("marks of a student"+"\n"+s.a+"\n"+s.b+"\n"+s.c);
         s .Thankyou();
	}

}

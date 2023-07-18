package sakthe2;

public class studentDetail {
	int rollno;
	String name;
	float mark;
	char intial;
	long number;
	 
	studentDetail(int rollno,long number,float mark,char intial,String name){
		this.rollno =rollno;
		this.name =name;
		this.mark =mark;
		this.intial =intial;
		this.number =number;
		
	}
	studentDetail(int rollno,float mark,char intial,String name){
		this.rollno =rollno;
		this.name =name;
	this.mark =mark;
		this.intial =intial;
	}
	studentDetail(int rollno, String name, char intial){
		this.rollno =rollno;
		this.name =name;
		this.intial =intial;		
	}
   public static void main (String args[]) {
	   studentDetail x= new studentDetail(001,998554445,88,'p',"anto");
	   studentDetail y= new studentDetail(002,66,'p',"ant");
	   studentDetail z= new studentDetail(003,"allen",'p');
	   System.out.println(x.rollno);
	   System.out.println(x.name+'.'+x.intial);
	   System.out.println(x.mark);
	   System.out.println(x.number);
	   System.out.println(y.rollno);
	   System.out.println(y.name+'.'+y.intial);
	   System.out.println(y.mark);
	   System.out.println(z.rollno);
	   System.out.println(z.name+'.'+z.intial);
   }
}

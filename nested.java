package sakthe2;

public class nested {
public static void main(String args[]) {
	int a=50,b=100;
	if(a>b ^ a<b) {
		
		
		if(a>=b) {
				System.out.println("inner if");
			}
		else {
			System.out.println("inner else");
			}
		
		
		System.out.println("outer if");
		
	}
	
	else {
		System.out.println("outer else");
		
	}
	
}
}

package sakthe2;

public class conditions {
	public static void main(String args[]) {
		/*
		 * types 4
		 * if(true)
		 * if else(false)
		 * if else if (multiple conditions)
		 * nested if(inner condition or condition of condition)
		 * 
		 */
		if(45<55  | 98900<98) {
			if(2<3) {
				System.out.println("inner if");	
			}
			else {
				System.out.println("inner else");
				
			}
			System.out.println("if stmt");
		}
		else if(45<55  | 98900<98) {
			System.out.println("1st stmt");
		}
		
		else if(45>55  && 98900<98) {
			System.out.println("2nd stmt");
		}
		
		else if(98900<98  ^ 2<<4  < 575) {
			System.out.println("3rd stmt");
		}
		else {
			System.out.println("this all are false");
		}
		
	}

}

package sakthe2;

public class exceps {
	public static void main (String args[]) {
		try {
		
			int a[]= {0,1,2,3,4,5};
			for (int a1=0; a1<=6; a1++) {
				System.out.println(a[a1]);
			}		
		}
		catch(Exception a2) {
			System.out.println(a2);
		}
		finally {
			System.out.println("vidamuyarchi - AK63");
		}
	}
}

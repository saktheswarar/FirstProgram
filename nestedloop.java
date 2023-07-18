package sakthe2;

public class nestedloop {
	public static void main(String args[]) {
		

	// Nested loop
		int a[][]=new int[4][4];
		a[0][0]=1;
		a[1][1]=1;
		a[2][2]=1;
				int r=1;
				int s=2;
				for (r=0; r<a.length; r++ ) {
					for ( s=0;s<=3; s++ ) {
						System.out.print(a[r][s]+"  ");
					}
					System.out.println(" \n");
				}
				 
				
}
}

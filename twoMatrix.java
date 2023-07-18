package sakthe2;

public class twoMatrix {
	public static void main(String args[]) {
		int a[][]= new int[2][2];
		a[0][0]=1;
		a[0][1]=2;
		a[1][0]=2;
		a[1][1]=1;
		int s=1;
		int m=2;
		for(s=0; s<a.length; s++) {
			for(m=0; m<2; m++) {
				System.out.print(a[s][m]+" ");
			}
			System.out.println("\n");
		}
	}

}

package sakthe2;

public class initialization {
	public static void main(String args[]) {
		int sa[][]=new int[3][3];
		 sa[0][0]=1;
		 sa[0][1]=0;
		 sa[1][1]=1;
		 sa[1][0]=0;
		 sa[2][1]=2;
		 sa[2][2]=0;
		 for(int a=0; a<=2; a++) {
				for(int b=0;b<=2;++b) {
					System.out.print(sa[a][b]+" ");

				}
				System.out.println("");
			}
		
	}

}

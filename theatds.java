package sakthe2;

public class theatds extends Thread {
	public void run() {

		for(int a=5;a<16;a++)
			try {
			System.out.println(a);
			sleep(2000);//time delay
			}
		catch(Exception e) {
			System.out.println(e);
		}
}
	public static void main(String args[]) {
		theatds  t1=new theatds();
		theatds  t2=new theatds();
		theatds  t3=new theatds();
		t1.start();
		t2.start();
		
	}
}

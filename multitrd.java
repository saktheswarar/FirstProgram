package sakthe2;


public class multitrd implements Runnable {
	public void run() {

		for(int a=5;a<16;a++)
			try {
			System.out.println(a);
			Thread.sleep(200);//time delay
			}
		catch(Exception e) {
			System.out.println(e);
		}
}
	public static void main(String args[]) {
		theatds  t1=new theatds();
		theatds  t2=new theatds();
		theatds  t3=new theatds();
		
		Thread t=new Thread(t1);
		Thread tt=new Thread(t2);
		Thread ttt=new Thread(t3);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}

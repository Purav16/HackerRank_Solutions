package thread;

class Demo1 extends Thread{
	int count = 0;
	public void run(){
		while(count <= 10){
			try{
			System.out.println("Thread" + (++count));
			Thread.sleep(100000);
		} catch(InterruptedException ie){
			System.out.println("Exception occured");
		}
			}
	}
	
}
public class Thread2 {
	public static void main(String[] args){
		System.out.println("Thread starting");
		Demo1 dm = new Demo1();
		dm.start();
		while(dm.count <= 10){
			try{
				System.out.println("Thread" + (++dm.count));
				Thread.sleep(100000);
			} catch(InterruptedException ie){
				System.out.println("Exception occured");
			}
		}
		System.out.println("End of the thread");
	}
}

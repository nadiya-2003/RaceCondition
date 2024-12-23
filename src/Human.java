
public class Human extends Thread {

	
	
	public void run()
	{
		try
		{
			System.out.println(Thread.currentThread().getName()+" has entered the bathroom");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+" is using the bathroom");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+" is finished using the bathroom");
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
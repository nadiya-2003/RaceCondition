
public class MSOffice extends Thread {
	public void typing()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("typing");
				Thread.sleep(2000);
			}
		}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	public void spellCheck()
	{
		try
		{
		for(int i=0;i<5;i++)
		{
			System.out.println("spellCheck");
			Thread.sleep(2000);
		}
	}
		catch(InterruptedException e1)
		{
			e1.printStackTrace();
		}
	}
	public void saving()
	{
		try
		{
		for(int i=0;i<5;i++)
		{
			System.out.println("saving");
			Thread.sleep(2000);
		}
	}
		catch(InterruptedException e2)
		{
			e2.printStackTrace();
		}
	}
	public void run()

	{
		if(Thread.currentThread().getName().equals("typing"))
		{
			typing();
		}
		else if (Thread.currentThread().getName().equals("spellCheck"))
		{
			spellCheck();
		}
		else
		{
			saving();
		}
	}
}

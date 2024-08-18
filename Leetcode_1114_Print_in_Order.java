
public class Leetcode_1114_Print_in_Order 
{
	int flag=0;
	
	public Leetcode_1114_Print_in_Order()
	{
		
	}
	
	synchronized public void first(Runnable printFirst) throws InterruptedException
	{
		printFirst.run();
		
		flag+=1;
		notifyAll();
	}
	
	synchronized public void second(Runnable printSecond) throws InterruptedException
	{
		while(flag<1)
		{
			wait();
		}
		
		printSecond.run();
		
		flag+=1;
		notifyAll();
	}
	
	synchronized public void third(Runnable printThird) throws InterruptedException
	{
		while(flag<2)
		{
			wait();
		}
		
		printThird.run();
	}
}
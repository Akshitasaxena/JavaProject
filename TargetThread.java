import java.awt.*;
public class TargetThread extends Thread
{
public void run()
{
	try
	{
		while(true)
		{
			Thread.sleep(20);
			int x=Program.target.getX();
			if(x>=400)
				x=10;
			else
				x=x+10;
			Program.target.setBounds(x,30,100,20);
			
		}
		
	}
	catch(Exception e)
	{
		
	}
}
}

import java.awt.Button;
import javax.swing.*;
public class TimerThread extends Thread {
	public void run()
	{
		try
		{
				
			for(int i=30;i>=0;i--)
			{
				Program.timer.setText(" "+i);
				Thread.sleep(1000);
				if(i==0)
				{
					JOptionPane.showMessageDialog(null,"TIME IS UP");
					break;
				}
			}
	
		}
		catch(Exception e)
		{
		
		}
	}

}

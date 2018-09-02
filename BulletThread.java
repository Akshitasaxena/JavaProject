import java.awt.Button;
import java.awt.Color;
public class BulletThread extends Thread {
	static Button b;
	static int s;
public void run()
{
	try
{ 
Button b=new Button();
b.setBounds(195,360,10,10);
b.setBackground(Color.red);
Program.f.add(b);
for(int i=360;i>=0;i=i-10)
{
	b.setBounds(195,i,10,10);
	Thread.sleep(10);
	if(i<50 && (Program.target.getX())<170)
	{
		s=s+5;
		Program.score.setText(" "+s);
	
	}
	
}
}
catch(Exception e)
	{
	
	}
}
}
import java.awt.*;
import java.awt.event.*;
import java.lang.*;

public class Program implements WindowListener{
static Frame f;
static Button target,tank;
static Label timer;
static Label score;
Program()
{
	f=new Frame("Bullets and Tanks");
	target=new Button();
	tank=new Button();
	target.setBackground(Color.black);
	tank.setBackground(Color.red);
	f.setBackground(Color.green);
	timer=new Label("120");
	score=new Label("0");
	f.setLayout(null);
	target.setBounds(10,30,100,20);
	tank.setBounds(180,360,40,40);
	timer.setBounds(360,360,40,40);
	score.setBounds(360,320,40,40);
	f.addWindowListener(this);
	tank.addActionListener(new ActionListener()
	{	public void actionPerformed(ActionEvent arg0)
		{//ScoreThread t3=new ScoreThread();
		BulletThread t=new BulletThread();
	t.start();
	//t3.start();
		}
		});
	f.add(target);
	f.add(timer);
	f.add(tank);
	f.add(score);
	f.setVisible(true);
	f.setSize(400,400);
	TargetThread t1=new TargetThread();
	t1.start();
	TimerThread t2=new TimerThread();
	t2.start();
	
	
	
	
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
Program p=new Program();
	}
@Override
public void windowActivated(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowClosed(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowClosing(WindowEvent arg0) {
f.dispose();	
}
@Override
public void windowDeactivated(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowDeiconified(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowIconified(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void windowOpened(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}

}

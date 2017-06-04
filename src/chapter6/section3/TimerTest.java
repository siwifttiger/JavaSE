package chapter6.section3;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TimerTest {
	public static void main(String[] args)
	{
		ActionListener listener = new TimePrinter();
		Timer t = new Timer(10000,listener);
		t.start();
		
		JOptionPane.showMessageDialog(null, "Quit Program?");
		System.exit(0);
	}
	
	
	
}

class TimePrinter implements ActionListener
{
	public void actionPerformed(ActionEvent event)
	{
		Date now = new Date();
		System.out.println("At the tone, the time is "+ now);
		Toolkit.getDefaultToolkit().beep();
	}
}

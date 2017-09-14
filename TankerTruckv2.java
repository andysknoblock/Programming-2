import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;
public class TankerTruckv2 
{
	private JFrame mainFrame;
	private JLabel status;
	private JLabel answer;
	
	public TankerTruckv2() {
		prepareGUI(); 
	}
	
	public static void main(String[] args) 
	{
		TankerTruckv2 swingTanker = new TankerTruckv2();
		swingTanker.show();

	}
	
	private void prepareGUI()
	{
		mainFrame = new JFrame("Tight tanker calculator");
		mainFrame.setSize(400, 400);
		mainFrame.setLayout(new GridLayout(14,1));
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		
		
	}
	
	private void show() {
		status=new JLabel("",JLabel.CENTER);
		status.setText("Wlecome mate. Enter yer stuff if you want success");
		
		JLabel askName = new JLabel("",JLabel.CENTER);
		askName.setText("What do you prefer to be called?: ");
		JTextField name = new JTextField();
		
		JLabel askBirth = new JLabel("",JLabel.CENTER);
		askBirth.setText("When were ya born?: ");
		JTextField birth = new JTextField();
		
		JLabel askLife = new JLabel("",JLabel.CENTER);
		askLife.setText("What's your ideal lifespan?: ");
		JTextField life = new JTextField();
		
		JButton calculate = new JButton("Calculate");
		//calculate.setSize(100,15);
		answer = new JLabel("",JLabel.CENTER);
				
	    mainFrame.add(status);
	    mainFrame.add(askName);
	    mainFrame.add(name);
	    mainFrame.add(askBirth);
	    mainFrame.add(birth);
	    mainFrame.add(askLife);
	    mainFrame.add(life);
	    mainFrame.add(calculate);
	    mainFrame.add(answer);
		mainFrame.setVisible(true);
	}

}

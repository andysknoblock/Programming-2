import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;
public class TankerTruckv2 
{
	private JFrame mainFrame;
	private JLabel status;
	private JLabel answer;
	private JLabel answer2;
	
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
		status.setText("Welcome mate. Enter yer stuff if you want success");
		JLabel askName = new JLabel("",JLabel.CENTER);
		askName.setText("What do you prefer to be called?: ");
		JTextField name = new JTextField();
//		boolean updateName=false;
//		if (updateName==true)
//		{
//			status.setText("Welcome " + name.getText()+". Enter yer stuff if you want success");
//		}
		
		JLabel askBirth = new JLabel("",JLabel.CENTER);
		askBirth.setText("What's your birth date?: ");
		JTextField birth = new JTextField();
		
		JLabel askLife = new JLabel("",JLabel.CENTER);
		askLife.setText("What's your ideal lifespan in years?: ");
		JTextField life = new JTextField();
		
		JLabel askFluids = new JLabel("",JLabel.CENTER);
		askFluids.setText("How many ounces of fluid do ya drink in a day?: ");
		JTextField fluids = new JTextField();
		
		JButton calculate = new JButton("Calculate");
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					float lifespan = Float.parseFloat(life.getText());
					float ozPerDay = Float.parseFloat(fluids.getText());
					float ans = ozPerDay*365*lifespan/(8000*128);
					answer.setText("Ok " + name.getText() + ", you will approximately drink " + ans );
					answer2.setText(" tanker trucks (8000 gallons) in your sad life");
					
				}
				catch (NumberFormatException a) {
					answer.setText("WHAT'RE YOU DOING?!?! ENTER THE RIGHT INFO");
				}
				
				
			}
		});
		//calculate.setSize(100,15);
		answer = new JLabel("",JLabel.CENTER);
		answer2= new JLabel("",JLabel.CENTER);
		
				
	    mainFrame.add(status);
	    mainFrame.add(askName);
	    mainFrame.add(name);
	    mainFrame.add(askBirth);
	    mainFrame.add(birth);
	    mainFrame.add(askLife);
	    mainFrame.add(life);
	    mainFrame.add(askFluids);
	    mainFrame.add(fluids);
	    mainFrame.add(calculate);
	    mainFrame.add(answer);
	    mainFrame.add(answer2);
		mainFrame.setVisible(true);
	}

}

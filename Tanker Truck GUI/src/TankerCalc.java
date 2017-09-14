import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;
		
public class TankerCalc
{
	//controls
	private JFrame mainFrame;
	private JPanel controlPanel;
	public TankerCalc() 
	{
		prepareGUI();
	}
	public static void main(String[] args) 
	{
		TankerCalc swingTankerCalc = new TankerCalc();
		swingTankerCalc.showTextFeild();
	}
	
	private void prepareGUI()
	{
		mainFrame = new JFrame("Drinky Calculator");
		mainFrame.setSize(500, 300);
		mainFrame.setLayout(new GridLayout(1,2));
		
		controlPanel = new JPanel();
	    controlPanel.setLayout(new FlowLayout());
	    
	    //close the app when you finish it
	    mainFrame.addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent windowEvent){
	            System.exit(0);
	         }        
	      });    
		
	    mainFrame.add(controlPanel);
	    mainFrame.setVisible(true);
	}
	
	private void showTextFeild()
	{
		//water per day with a text and a text field 
		JLabel WaterText = new JLabel("",JLabel.CENTER);
		WaterText.setSize(400,40);
		WaterText.setText("How much ounces of water do you drink in a day?");
		controlPanel.add(WaterText);
		JTextField Water = new JTextField(2);
		controlPanel.add(Water);
		
		//years lived with a text and a text field
		JLabel LifeText = new JLabel("",JLabel.CENTER);
		LifeText.setSize(400,40);
		LifeText.setText("How many years will you be when you expire in a horrible fashion?");
		controlPanel.add(LifeText);
		JTextField Life = new JTextField(2);
		controlPanel.add(Life);
		
		//answer but only will get text when calculate is pressed
		JLabel answer = new JLabel("",JLabel.CENTER);
		LifeText.setSize(400,40);
		
		//button to calculate the answer
		JButton calculate = new JButton();
		calculate.setText("Calculate");
		calculate.addActionListener(new ActionListener() {
			//on click, calculate the stuff and get the answer
	         public void actionPerformed(ActionEvent e) {
	        	 float tankers;
	        	 float ozPerDay = Integer.parseInt(Water.getText());
	        	 float lifeSpan = Integer.parseInt(Life.getText());
	        	 tankers = ozPerDay*365*lifeSpan/1408000;
	            answer.setText("You will drink " + tankers + " tanker trucks of water in your optimistically long life");
	         }
	      });
		controlPanel.add(calculate);
		
		//add this last so it is below
		controlPanel.add(answer);
		
		
		mainFrame.setVisible(true);
	}
	

}

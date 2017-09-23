package render;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

import mechanics.Engine;

public class Screen {


	protected static JTextArea other;
	protected static JTextArea status;
	protected static JTextArea output;
	protected static JTextArea input;
	public JFrame GameScreen;
	protected Engine Heart;
	//Getters and Setters for the input box;
	public static String getInputText() {return input.getText();}
	public static void clearInput() {input.setText("");}
	
	//Getters and Setters for the output dialogue box;
	public static void appendOutput(String toAppend) {output.append(toAppend + "\n");}
	public static void appendOutput(String toAppend, int delayLength) {output.append(toAppend + "\n");delay(delayLength);}
	public static void clearOutput() {output.setText("");}
	
	//Getters and Setters for the Status dialogue box;
	public static void appendStatus(String toAppend) {status.append(toAppend);}
	public static void clearStatus() {status.setText("");};
	
	public static void delay(int toSleep) {
		try {
			Thread.sleep(toSleep);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public GridBagConstraints createProject(int x, int y, int weightx, int weighty, int gridheight, int gridwidth) {
		GridBagConstraints tempConstraints = new GridBagConstraints();
		tempConstraints.gridx = x;
		tempConstraints.gridy = y;
		tempConstraints.insets = new Insets(4, 4, 4, 4);
		tempConstraints.weightx = weightx;
		tempConstraints.weighty = weighty;
		tempConstraints.gridheight = gridheight;
		tempConstraints.gridwidth = gridwidth;
		tempConstraints.fill = GridBagConstraints.BOTH;
		return tempConstraints;
	}
	
	public void createAndShowGUI() {
		GameScreen = new JFrame();
		GameScreen.setLayout(new GridBagLayout());
		GameScreen.setSize(600, 600);
		GridBagConstraints Constraints = new GridBagConstraints();


		output = new JTextArea();
		Constraints = createProject(0, 0, 1, 1, 3, 2);
		output.setEditable(false);
		output.setWrapStyleWord(true);

		JScrollPane scrollPaneOutput = new JScrollPane(output);
		GameScreen.add(scrollPaneOutput, Constraints);
		
		Constraints = createProject(0, 4, 1, 1, 1, 3);
		input = new JTextArea();
		input.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					e.consume();
					Engine.toggleCheck();
				}    
			}
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub      
			}
		});
		JScrollPane scrollPaneInput = new JScrollPane(input);
		GameScreen.add(scrollPaneInput, Constraints);

		status = new JTextArea();
		status.setEditable(false);
		Constraints = createProject(2, 0, 1, 1, 1, 1);

		JScrollPane scrollPaneStatus = new JScrollPane(status);
		GameScreen.add(scrollPaneStatus, Constraints);


		other = new JTextArea();
		other.setEditable(true);
		other.setWrapStyleWord(true);

		Constraints = createProject(2, 1, 1, 1, 1, 1);
		JScrollPane scrollpaneOther = new JScrollPane(other);
		GameScreen.add(scrollpaneOther, Constraints);
		GameScreen.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		
		GameScreen.setVisible(true);
	}
	
	public void shutDown() {
		GameScreen.dispose();
	}
	public Screen() {
		createAndShowGUI();
		new Engine();
	}
}

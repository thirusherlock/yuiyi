import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;

public class Patient_appointment_System {

	  public static void main(String arg[])
	  {
	  try
	  {
	  Patient_appointment_System frame=new Patient_appointment_System();
	  frame.setSize(300,100);
	  frame.setVisible(true);
	  }
	  catch(Exception e)
	  {JOptionPane.showMessageDialog(null, e.getMessage());}
	  }
	}
	class NextPage extends JFrame
	{
	  NextPage()
	 {
	 setDefaultCloseOperation(javax.swing.
	  WindowConstants.DISPOSE_ON_CLOSE);
	 setTitle("Welcome");
	 setSize(400, 200);
	  }
	 }

	private void button1MouseClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void button1ActionPerformed(ActionEvent e) {
		// TODO add your code here
		 String value1=text1.getText();
		  String value2=text2.getText();
		  if (value1.equals("thiru") && value2.equals("thiru")) {
		  NextPage page=new NextPage();
		  page.setVisible(true);
		  JLabel label = new JLabel("Welcome:"+value1);
		  page.getContentPane().add(label);
		  }
		  else{
		  System.out.println("enter the valid username and password");
		  JOptionPane.showMessageDialog(this,"Incorrect login or password",
		  "Error",JOptionPane.ERROR_MESSAGE);
		  }
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - thirunavukarasu l
		label1 = new JLabel();
		textField1 = new JTextField();
		label2 = new JLabel();
		textField2 = new JTextField();
		panel1 = new JPanel();
		button1 = new JButton();
		action1 = new AbstractAction();

		//======== this ========

		// JFormDesigner evaluation mark
		setBorder(new javax.swing.border.CompoundBorder(
			new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
				"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
				javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
				java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

		setLayout(new MigLayout(
			"hidemode 3",
			// columns
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]",
			// rows
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]"));

		//---- label1 ----
		label1.setText("Username");
		add(label1, "cell 2 1 3 1");
		add(textField1, "cell 5 1 4 1");

		//---- label2 ----
		label2.setText("Password");
		add(label2, "cell 2 3");
		add(textField2, "cell 5 3 4 1");

		//======== panel1 ========
		{
			panel1.setLayout(new MigLayout(
				"hidemode 3",
				// columns
				"[fill]",
				// rows
				"[]"));

			//---- button1 ----
			button1.setText("Submit");
			button1.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					button1MouseClicked(e);
				}
			});
			button1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					button1ActionPerformed(e);
				}
			});
			panel1.add(button1, "cell 0 0");
		}
		add(panel1, "cell 4 6");
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - thirunavukarasu l
	private JLabel label1;
	private JTextField textField1;
	private JLabel label2;
	private JTextField textField2;
	private JPanel panel1;
	private JButton button1;
	private AbstractAction action1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}





 
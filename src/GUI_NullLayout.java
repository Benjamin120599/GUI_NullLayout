
import javax.jws.soap.SOAPBinding.Style;
import javax.swing.*;
import java.awt.*;

class VentanaPrincipal extends JFrame {
	
	public VentanaPrincipal() {
		getContentPane().setLayout(null); //Layout del JFrame
		getContentPane().setBackground(Color.WHITE);
		setSize(900, 600);
		setTitle("FORMULARIO");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		Font Titulo = new Font("Arial", Font.PLAIN, 12);
		
		JLabel label1 = new JLabel("<html><p>The <b>Classic Form</b> to includes all visible fields for this list.</p></html>");
			label1.setBounds(20, 15, 280, 30);
			label1.setFont(Titulo);
		add(label1);
		
		JLabel label2 = new JLabel("<html><p>Form options</p></html>");
			label2.setBounds(20, 50, 280, 30);
			label2.setFont(new Font("Arial", Font.BOLD, 13));
		add(label2);
		
		JLabel label3 = new JLabel("<html><p>Include the following:</p></html>");
			label3.setBounds(20, 75, 280, 30);
			label3.setFont(new Font("Arial", Font.PLAIN, 12));
		add(label3);
		
		JCheckBox checkBox1 = new JCheckBox("   A title for you form.");
			checkBox1.setBounds(15, 100, 280, 30);
			checkBox1.setFont(Titulo);
			checkBox1.setBackground(Color.WHITE);
		add(checkBox1);
		
		JTextField textField1 = new JTextField("   Subscribe to our mailing list.");
			textField1.setBounds(18, 140, 270, 30);
		add(textField1);
		
		JRadioButton radioButton1 = new JRadioButton("   Only required fields.");
			radioButton1.setBounds(15, 190, 280, 30);
			radioButton1.setFont(Titulo);
			radioButton1.setBackground(Color.WHITE);
		add(radioButton1);
		
		JRadioButton radioButton2 = new JRadioButton("   All fields.");
			radioButton2.setBounds(15, 215, 280, 30);
			radioButton2.setFont(Titulo);
			radioButton2.setBackground(Color.WHITE);
		add(radioButton2);
		
		JLabel label4 = new JLabel("(Edit required fields in");
			label4.setBounds(40, 235, 280, 30);
			label4.setFont(new Font("Arial", Font.PLAIN, 10));
		add(label4);
		
		JLabel label5 = new JLabel("the form builder");
			label5.setBounds(150, 235, 280, 30);
			label5.setFont(new Font("Arial", Font.PLAIN, 10));
			label5.setForeground(Color.BLUE);
		add(label5);
		
		JLabel label6 = new JLabel(")");
			label6.setBounds(225, 235, 280, 30);
			label6.setFont(new Font("Arial", Font.PLAIN, 10));
		add(label6);
		
		JCheckBox checkBox2 = new JCheckBox("   Interest group field.");
			checkBox2.setBounds(15, 280, 280, 30);
			checkBox2.setFont(Titulo);
			checkBox2.setBackground(Color.WHITE);
		add(checkBox2);
		
		JCheckBox checkBox3 = new JCheckBox("   Required Fields Indicators.");
			checkBox3.setBounds(15, 305, 280, 30);
			checkBox3.setFont(Titulo);
			checkBox3.setBackground(Color.WHITE);
		add(checkBox3);
		
		JLabel label7 = new JLabel("Set form width,");
			label7.setBounds(20, 340, 280, 30);
			label7.setFont(Titulo);
		add(label7);
		
		JTextField textField2 = new JTextField();
			textField2.setBounds(18, 370, 270, 30);
		add(textField2);
		
		JLabel label8 = new JLabel("Enhace your form");
			label8.setBounds(20, 410, 280, 30);
			label8.setFont(Titulo);
		add(label8);
	}
	
	public void configurar() {
		
	}
	
}

public class GUI_NullLayout {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new VentanaPrincipal();
				
			}
		});
		
	}

}

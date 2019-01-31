
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
			radioButton2.setBounds(15, 220, 280, 30);
			radioButton2.setFont(Titulo);
			radioButton2.setBackground(Color.WHITE);
		add(radioButton2);
		
		JLabel label4 = new JLabel("(Edit required fields in");
			label4.setBounds(30, 240, 280, 30);
			label4.setFont(Titulo);
		add(label4);
		
		JLabel label5 = new JLabel(" the form builder");
			label5.setBounds(150, 240, 280, 30);
			label5.setFont(Titulo);
			label5.setForeground(Color.BLUE);
		add(label5);
		
		JLabel label6 = new JLabel(")");
			label6.setBounds(240, 240, 280, 30);
			label5.setFont(Titulo);
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

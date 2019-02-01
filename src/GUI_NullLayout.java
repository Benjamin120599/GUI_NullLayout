
import javax.jws.soap.SOAPBinding.Style;
import javax.swing.*;
import java.awt.*;

class VentanaPrincipal extends JFrame {
	
	public VentanaPrincipal() {
		getContentPane().setLayout(null); //Layout del JFrame
		getContentPane().setBackground(Color.WHITE);
		setSize(750, 600);
		
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
		
		ButtonGroup bg = new ButtonGroup();
		
		JRadioButton radioButton1 = new JRadioButton("   Only required fields.");
			radioButton1.setBounds(15, 190, 280, 20);
			radioButton1.setFont(Titulo);
			radioButton1.setBackground(Color.WHITE);
		bg.add(radioButton1);
		add(radioButton1);
		
		JRadioButton radioButton2 = new JRadioButton("   All fields.");
			radioButton2.setBounds(15, 210, 280, 20);
			radioButton2.setFont(Titulo);
			radioButton2.setBackground(Color.WHITE);
		bg.add(radioButton2);
		add(radioButton2);
		
		JLabel label4 = new JLabel("<html><body> (Edit required fields in<font color= blue> the form builder </font> ). </body></html>");
			label4.setBounds(40, 225, 280, 30);
			label4.setFont(new Font("Arial", Font.PLAIN, 10));
		add(label4);
				
		JCheckBox checkBox2 = new JCheckBox("   Interest group field.");
			checkBox2.setBounds(15, 260, 280, 30);
			checkBox2.setFont(Titulo);
			checkBox2.setBackground(Color.WHITE);
		add(checkBox2);
		
		JCheckBox checkBox3 = new JCheckBox("   Required Fields Indicators.");
			checkBox3.setBounds(15, 285, 280, 30);
			checkBox3.setFont(Titulo);
			checkBox3.setBackground(Color.WHITE);
		add(checkBox3);
		
		JLabel label7 = new JLabel("Set form width,");
			label7.setBounds(20, 320, 280, 30);
			label7.setFont(Titulo);
		add(label7);
		
		JTextField textField2 = new JTextField();
			textField2.setBounds(18, 350, 270, 30);
		add(textField2);
		
		JLabel label8 = new JLabel("Enhace your form");
			label8.setBounds(20, 390, 280, 30);
			label8.setFont(Titulo);
		add(label8);
		
		JCheckBox checkBox4 = new JCheckBox("<html>   Enable <b>evil</b> popup mode.</html>");
			checkBox4.setBounds(15, 410, 280, 30);
			checkBox4.setFont(Titulo);
			checkBox4.setBackground(Color.WHITE);
		add(checkBox4);
	
		JCheckBox checkBox5 = new JCheckBox("<html>   Disable all <b>JavaScript</b>.</html>");
			checkBox5.setBounds(15, 435, 280, 30);
			checkBox5.setFont(Titulo);
			checkBox5.setBackground(Color.WHITE);
		add(checkBox5);

		JCheckBox checkBox6 = new JCheckBox("<html>   Include archive link.</html>");
			checkBox6.setBounds(15, 460, 280, 30);
			checkBox6.setFont(Titulo);
			checkBox6.setBackground(Color.WHITE);
		add(checkBox6);

		JCheckBox checkBox7 = new JCheckBox("<html><body>   Include <font color= blue> MonkeyRewards </font> link. </body></html>");
			checkBox7.setBounds(15, 485, 280, 30);
			checkBox7.setFont(Titulo);
			checkBox7.setBackground(Color.WHITE);
		add(checkBox7);
		
		JLabel label9 = new JLabel("Preview");
			label9.setBounds(310, 8, 280, 30);
			label9.setFont(new Font("Arial", Font.BOLD, 14));
		add(label9);
		
		JPanel panel1 = new JPanel();
			
			panel1.setLayout(null);
			panel1.setBackground(Color.WHITE);
			panel1.setBounds(310, 40, 400, 250);
			panel1.setBorder(BorderFactory.createTitledBorder(""));
		
		add(panel1);
		
		JLabel label11 = new JLabel("Email Adress. *");
			label11.setBounds(15, 10, 280, 30);
			label11.setFont(Titulo);
		panel1.add(label11);	
		
		JTextField textField4 = new JTextField();
			textField4.setBounds(15, 40, 350, 30);
		panel1.add(textField4);
		
		JLabel label12 = new JLabel("First Name.");
			label12.setBounds(15, 70, 280, 30);
			label12.setFont(Titulo);
		panel1.add(label12);
		
		JTextField textField5 = new JTextField();
			textField5.setBounds(15, 100, 350, 30);
		panel1.add(textField5);
		
		JLabel label13 = new JLabel("Last Name.");
			label13.setBounds(15, 130, 280, 30);
			label13.setFont(Titulo);
		panel1.add(label13);
		
		JTextField textField6 = new JTextField();
			textField6.setBounds(15, 160, 350, 30);
		panel1.add(textField6);
		
		ImageIcon imagen = new ImageIcon("./src/imagen.png");
		ImageIcon otraImagen = new ImageIcon(imagen.getImage().getScaledInstance(160, 50, Image.SCALE_DEFAULT));
		
		JButton button1 = new JButton(otraImagen);
			button1.setBounds(15, 200, 150, 30);
		panel1.add(button1);
		
		JLabel label14 = new JLabel("Copy/paste on to your site");
			label14.setBounds(310, 300, 280, 30);
			label14.setFont(new Font("Arial", Font.PLAIN, 14));
		add(label14);
		
		JPanel panel2 = new JPanel();
			panel2.setLayout(null);
			panel2.setBackground(Color.WHITE);
			panel2.setBounds(310, 330, 400, 150);
			panel2.setBorder(BorderFactory.createTitledBorder(""));
		add(panel2);
		
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

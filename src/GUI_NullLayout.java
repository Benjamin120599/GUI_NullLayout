
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
		Font Texto = new Font("Arial", Font.PLAIN, 12);
		
		JLabel label1 = new JLabel("<html><p>The <b>Classic Form</b> to includes all visible fields for\rthis list</p></html>");
			label1.setBounds(20, 15, 280, 30);
			label1.setFont(Titulo);
		add(label1);
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

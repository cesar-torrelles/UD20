/**
 * 
 */
package ejercicio4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class Ejercicio4App extends JFrame {
	/**
	 * Creamos una clase que hereda de JFrame
	 * 
	 */

	// declaramos los elementos que luego usaremos anidados
	private static final long serialVersionUID = 1L;
	protected JTextArea textArea = new JTextArea();
	private JPanel contentPane;

	/**
	 * Creamos el Main para poder lanzar la App
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio4App frame = new Ejercicio4App();
					frame.setVisible(true);
					frame.addEventos(new Ventana(frame));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	protected void addEventos(Ventana window) {
		this.addWindowListener(window);
	}

	/**
	 * Creamos los elementos con los que interacionaremos con el usuario
	 */
	public Ejercicio4App() {
		// creamos el panel de contenido
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		//creamos la etiqueta eventos donde indicaremos todos los eventos resultantes
		JLabel etiqueta = new JLabel("Eventos");
		etiqueta.setBounds(10, 104, 98, 14);
		contentPane.add(etiqueta);
		
		//determinamos las dimensiones del campo de texto
		textArea.setBounds(120, 22, 313, 214);
		contentPane.add(textArea);
	}
}
/**
 * 
 */
package ejercicio5;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;


public class Ejercicio5 extends JFrame implements MouseListener{
	/**
	 * Creamos una clase que hereda de JFrame
	 * 
	 */
	
	// declaramos los elementos que luego usaremos anidados
	private static final long serialVersionUID = 1L;
	private JTextArea texto = new JTextArea();
	private JButton btn;
	private JPanel contentPane;

	

	/**
	 * Creamos los elementos con los que interacionaremos con el usuario
	 */
	public Ejercicio5() {
		
		// creamos el panel de contenido
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 310);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		// creamos un boton "limpiar" para elimitar todo el texto generado
		btn = new JButton("Limpiar");
		btn.setBounds(257, 6, 89, 23);
		contentPane.add(btn);
		btn.addMouseListener(this);
		
		//indicamos las dimensiones del campo de texto
		texto.setBounds(92, 35, 414, 234);
		contentPane.add(texto);
		texto.addMouseListener(this);
		
	}
	
	//creamos un metodo que escriba en el camppo de texto cuando el raton haya hecho click en el recuadro
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == texto) {
			texto.setText(texto.getText() + "Click en el texto|\n");	
		} 
		if(e.getSource() == btn) {
			texto.setText("");
		}
	}
	
	//creamos un metodo que escriba en el camppo de texto cuando el raton suelte el click en el recuadro
	public void mousePressed(MouseEvent e) {
		if(e.getSource() == texto) {
			texto.setText(texto.getText() + "Mouse presionado|\n");
		}
		
	}

	//creamos un metodo que escriba en el camppo de texto cuando el raton presione el click en el recuadro
	public void mouseReleased(MouseEvent e) {
		if(e.getSource() == texto) {
			texto.setText(texto.getText() + "Mouse soltado|\n");
		}
		
	}
	//creamos un metodo que escriba en el camppo de texto cuando el raton entra en el campo de texto
	public void mouseEntered(MouseEvent e) {
		if(e.getSource() == texto) {
			texto.setText(texto.getText() + "Mouse entra en texto|\n");
		}
		
	}

	//creamos un metodo que escriba en el camppo de texto cuando el raton salga del campo de texto
	public void mouseExited(MouseEvent e) {
		if(e.getSource() == texto) {
			texto.setText(texto.getText() + "Mouse sale del texto|\n");
		}
		
	}
}
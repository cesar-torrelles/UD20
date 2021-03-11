package ejercicio1;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import java.awt.Rectangle;



public class Ejercicio1 extends JFrame {

	/**
	 * Creamos una clase que hereda de JFrame 
	 * 
	 */
	
	//declaramos los elementos que luego usaremos anidados
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblEtiqueta;
	private int ancho;
	private int alto;
	

	/**
	 * Creamos los elementos con los que interacionaremos con el usuario
	 */
	public Ejercicio1() {
		setTitle("Ventana de inicio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 100, 100, 100));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//creamos el Panel general
		JPanel panel = new JPanel();
		panel.setBounds(100, 6, 250, 108);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//Creamos la etiqueta, la cual modificaremos el tamaño
		lblEtiqueta = new JLabel("Etiqueta");
		lblEtiqueta.setBounds(new Rectangle(0, 0, 5, 0));
		lblEtiqueta.setBounds(101, 21, 51, 48);
		panel.add(lblEtiqueta);
		
		//creamos un boton "menos" para reducir el tamaño de la etiqueta
		JButton btnNewButton_MENOS = new JButton("MENOS");
		btnNewButton_MENOS.setBounds(234, 126, 116, 55);
		
		//creamos accion para este boton
		btnNewButton_MENOS.addActionListener(new ActionListener() {
			
			 //indicaremos que al pulsarlo el ancho y el alto de la etiqueta reduzcan en 10
			public void actionPerformed(ActionEvent e) {
				ancho= lblEtiqueta.getWidth();
				
				lblEtiqueta.setBounds(100, 38, ancho-10, alto-10);
			}
		});
		contentPane.add(btnNewButton_MENOS);
		
		//creamos un boton "mas" para aumentar el tamaño de la etiqueta
		JButton btnNewButton_MAS = new JButton("MAS");
		btnNewButton_MAS.setBounds(100, 126, 108, 55);
		
		btnNewButton_MAS.addActionListener(new ActionListener() {
			
			 //indicaremos que al pulsarlo el ancho y el alto de la etiqueta aumenten en 10
			public void actionPerformed(ActionEvent e) {
				 ancho = lblEtiqueta.getWidth();
				 alto = lblEtiqueta.getHeight();
				lblEtiqueta.setBounds(100, 38, ancho+10, alto+10);
			}
		});
		contentPane.add(btnNewButton_MAS);
		
		
	
	}

}

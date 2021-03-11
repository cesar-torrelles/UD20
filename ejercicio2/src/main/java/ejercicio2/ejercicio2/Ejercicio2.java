package ejercicio2.ejercicio2;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Ejercicio2 extends JFrame {

	/**
	 * Creamos una clase que hereda de JFrame 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	

	/**
	 * Creamos los elementos con los que interacionaremos con el usuario
	 */
	public Ejercicio2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		//creamos una etiqueta donde indicaremos el boton que ha pulsado
		final JLabel LabelBotonPulsado = new JLabel("");
		LabelBotonPulsado.setBounds(250, 41, 61, 16);
		contentPane.add(LabelBotonPulsado);

		//creamos una etiqueta con un texto que se mantendra constante 
		JLabel LabelHasPulsado = new JLabel("Has pulsado el boton: ");
		LabelHasPulsado.setBounds(101, 41, 142, 16);
		contentPane.add(LabelHasPulsado);

		//creamos el boton 2
		JButton btn2 = new JButton("Boton 2");
		btn2.setBounds(235, 152, 137, 82);
		contentPane.setLayout(null);
		contentPane.add(btn2);

		//creamos el boton 1
		JButton btn1 = new JButton("Boton 1");
		btn1.setBounds(80, 152, 137, 82);
		contentPane.add(btn1);

		//indicamos que al pulsar el boton 1 el texto de la etiqueta "LabelBotonPulsado" cambiara a 1
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				LabelBotonPulsado.setText("1");

			}
		});

		//indicamos que al pulsar el boton 2 el texto de la etiqueta "LabelBotonPulsado" cambiara a 2
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				LabelBotonPulsado.setText("2");

			}
		});

	}
}

package ejercicio3;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Ejercicio3 extends JFrame {

	/**
	 * Creamos una clase que hereda de JFrame 
	 * 
	 */
	
	//declaramos los elementos que luego usaremos anidados
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	int veces1 = 0;
	int veces2 = 0;

	

	/**
	 * Creamos los elementos con los que interacionaremos con el usuario
	 */
	public Ejercicio3() {
		
		//creamos el panel de contenido
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		//creamos la etiqueta donde saldra el resultado del boton pulsado 1
		final JLabel LabelBotonPulsado1 = new JLabel("");
		LabelBotonPulsado1.setBounds(112, 98, 61, 16);
		contentPane.add(LabelBotonPulsado1);

		//creamos la etiqueta donde saldra el resultado del boton pulsado 2
		final JLabel LabelBotonPulsado2 = new JLabel("");
		LabelBotonPulsado2.setBounds(267, 98, 61, 16);
		contentPane.add(LabelBotonPulsado2);

		//creamos la etiqueta donde saldra escrito  "Boton 1"
		JLabel LabelHasPulsado1 = new JLabel("Boton 1: ");
		LabelHasPulsado1.setBounds(112, 70, 72, 16);
		contentPane.add(LabelHasPulsado1);

		//creamos el boton 2 
		JButton btn2 = new JButton("Boton 2");
		btn2.setBounds(235, 152, 137, 82);
		contentPane.setLayout(null);

		//creamos la etiqueta donde saldra escrito  "Boton 2"
		JLabel LabelHasPulsado2 = new JLabel("Boton 2: ");
		LabelHasPulsado2.setBounds(256, 70, 72, 16);
		contentPane.add(LabelHasPulsado2);
		contentPane.add(btn2);

		//creamos el boton 1
		JButton btn1 = new JButton("Boton 1");
		btn1.setBounds(80, 152, 137, 82);
		contentPane.add(btn1);

	
		//indicamos que al pulsar el boton 1 se sumaran la cantidad de veces que lo pulsemos, en la etiqueta "LabelBotonPulsado1"
		btn1.addActionListener(new ActionListener()	{
		public void actionPerformed(ActionEvent e) {

				veces1++;
				String numCadena1 = String.valueOf(veces1 + " veces");

				LabelBotonPulsado1.setText(numCadena1);

			}
	});

		//indicamos que al pulsar el boton 2 se sumaran la cantidad de veces que lo pulsemos, en la etiqueta "LabelBotonPulsado2"
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				veces2++;
				String numCadena2 = String.valueOf(veces2 + " veces");

				LabelBotonPulsado2.setText(numCadena2);

			}
		});
}
	}


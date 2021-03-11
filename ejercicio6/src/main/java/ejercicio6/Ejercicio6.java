package ejercicio6;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejercicio6 extends JFrame {

	/**
	 * Creamos una clase que hereda de JFrame 
	 * 
	 */
	
	//declaramos los elementos que luego usaremos anidados
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldAltura;
	private JTextField textFieldPeso;

	

	/**
	 * Creamos los elementos con los que interacionaremos con el usuario
	 */
	public Ejercicio6() {
		
		//creamos el panel de contenido
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		
		//creamos una etiqueta donde mostraremos el resultado del calculo
		final JLabel LabelResultado = new JLabel("");
		LabelResultado.setBounds(281, 187, 79, 16);
		contentPane.add(LabelResultado);

		//creamos una etiqueta donde indicaremos al usuario que introduzca los datos de la altura
		JLabel LabelAltura = new JLabel("Altura (metros)");
		LabelAltura.setBounds(101, 41, 142, 16);
		contentPane.add(LabelAltura);
		contentPane.setLayout(null);
		
		//creamos una etiqueta donde indicaremos al usuario que introduzca los datos del peso
		JLabel LabelPeso = new JLabel("Peso (Kg)");
		LabelPeso.setBounds(101, 69, 116, 16);
		contentPane.add(LabelPeso);
		
		//creamos una etiqueta donde indicaremos al usuario el resultado
		JLabel LabelIMC = new JLabel("IMC:");
		LabelIMC.setBounds(230, 187, 39, 16);
		contentPane.add(LabelIMC);

		//creamos un boton para que se realice el calculo
		JButton btn1 = new JButton("Calcular IMC");
		btn1.setBounds(80, 152, 137, 82);
		contentPane.add(btn1);
		
		//creamos un campo de texto donde recogeremos los datos de la altura 
		textFieldAltura = new JTextField();
		textFieldAltura.setBounds(230, 36, 130, 26);
		contentPane.add(textFieldAltura);
		textFieldAltura.setColumns(10);
		
		//creamos un campo de texto donde recogeremos los datos del peso
		textFieldPeso = new JTextField();
		textFieldPeso.setColumns(10);
		textFieldPeso.setBounds(229, 69, 130, 26);
		contentPane.add(textFieldPeso);

		//indicamos que al pulsar el boton  se realizara el calculo y aparecera  en la etiqueta "Resultado"
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Double peso = Double.parseDouble(textFieldPeso.getText());
				Double altura = Double.parseDouble(textFieldAltura.getText());
				Double resultado = peso / Math.pow(altura, 2);
				LabelResultado.setText(resultado.toString());

			}
		});

	}
}

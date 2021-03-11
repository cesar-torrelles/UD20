package ejercicio7;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class Ejercicio7 extends JFrame implements ActionListener {

	/**
	 * Creamos una clase que hereda de JFrame
	 * 
	 */

	// declaramos los elementos que luego usaremos anidados
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldCantidad;
	private JTextField textFieldResultado;
	private JButton btn1;
	private JToggleButton tglbtnbtn2;
	Double cantidad;
	Double resultado;

	/**
	 * Creamos los elementos con los que interacionaremos con el usuario
	 */
	public Ejercicio7() {

		// creamos el panel de contenido
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		// creamos una etiqueta donde indicaremos la cantidada a convertir
		JLabel LabelCantidad = new JLabel("Cantidad a convertir:");
		LabelCantidad.setBounds(75, 41, 142, 16);
		contentPane.add(LabelCantidad);
		contentPane.setLayout(null);

		// crearemos una etiqueta donde indicaremos el resultado
		JLabel LabelResultado = new JLabel("Resultado");
		LabelResultado.setBounds(75, 74, 116, 16);
		contentPane.add(LabelResultado);

		// crearemos un boton donde realizaremos la accion de la conversion
		btn1 = new JButton("Cambiar");
		btn1.setBounds(80, 150, 137, 82);
		contentPane.add(btn1);
		btn1.addActionListener(this);

		// creamos un togglebutton para indicar si se desea hacer la conversion en un
		// sentido u otro
		tglbtnbtn2 = new JToggleButton("Euros a Pesetas");
		tglbtnbtn2.setBounds(230, 149, 137, 82);

		// indicamos que el togglebutton cambie de nombre cuando lo presionemos
		tglbtnbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (!tglbtnbtn2.isSelected()) {
					tglbtnbtn2.setText("Euros a Pesetas");

				} else if (tglbtnbtn2.isSelected()) {
					tglbtnbtn2.setText("Pesetas a Euros");

				}

			}
		});

		contentPane.add(tglbtnbtn2);

		// creamos un campo de texto donde recogeremos la cantidad
		textFieldCantidad = new JTextField();
		textFieldCantidad.setBounds(230, 36, 130, 26);
		contentPane.add(textFieldCantidad);
		textFieldCantidad.setColumns(10);

		// indicamos un campo de texto donde mostraremos el resultado
		textFieldResultado = new JTextField();
		textFieldResultado.setColumns(10);
		textFieldResultado.setBounds(229, 69, 130, 26);
		contentPane.add(textFieldResultado);
	}

	// le damos accion al boton "cambiar" e indicamos que nos haga la operacion
	// correspondiente en funcion del sentido de la conversion
	public void actionPerformed(ActionEvent e) {

		cantidad = Double.parseDouble(textFieldCantidad.getText());
		System.out.println(cantidad);
		if (!tglbtnbtn2.isSelected()) {

			resultado = cantidad * 166.386;
			textFieldResultado.setText(resultado.toString());

		} else if (tglbtnbtn2.isSelected()) {

			resultado = cantidad / 166.386;
			textFieldResultado.setText(resultado.toString());

		}

	}

}

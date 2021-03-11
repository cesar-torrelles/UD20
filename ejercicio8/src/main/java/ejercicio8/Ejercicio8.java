package ejercicio8;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;

public class Ejercicio8 extends JFrame implements ActionListener {

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
	private JButton btnBorrar;

	

	/**
	 * Creamos los elementos con los que interacionaremos con el usuario
	 */
	public Ejercicio8() {
		
		
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
		
		// creamos el campo de texto para recoger los datos 
				textFieldCantidad = new JTextField();
				textFieldCantidad.setBounds(230, 36, 130, 26);
				contentPane.add(textFieldCantidad);
				textFieldCantidad.setColumns(10);

				//creamos otro campo de texto donde mostraremos el resultado
				textFieldResultado = new JTextField();
				textFieldResultado.setColumns(10);
				textFieldResultado.setBounds(229, 69, 130, 26);
				contentPane.add(textFieldResultado);

		// crearemos un boton donde realizaremos la accion de la conversion
		//indicamos que si el boton es accionado por una tecla (enter o espacio) se realiza la accion de conversion
		//dentro de la accion incluimos un try catch para que no se rompa el codigo al no ingresar valores en la casilla de la cantidad a convertir
		btn1 = new JButton("Cambiar");
		btn1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				try {
				cantidad = Double.parseDouble(textFieldCantidad.getText());
				
				if (!tglbtnbtn2.isSelected()) {

					double resultadoR= cantidad * 166.386;
					 DecimalFormat df = new DecimalFormat("#0.000");	 
					resultado = resultadoR;
					textFieldResultado.setText(df.format(resultado));
					

				} else if (tglbtnbtn2.isSelected()) {

					double resultadoR= cantidad / 166.386;
					 DecimalFormat df = new DecimalFormat("#0.000");	 
					resultado = resultadoR;
					textFieldResultado.setText(df.format(resultado));
					
				}	
				}catch(java.lang.NumberFormatException Excepcion) {
					JOptionPane.showMessageDialog(null,"Has de introducir un numero en el campo 'Cantidad a Convertir'");
				}

				}
		});
		
		
		
		btn1.setBounds(80, 150, 137, 82);
		contentPane.add(btn1);
		btn1.addActionListener(this);

		// creamos un togglebutton para indicar si se desea hacer la conversion en un
		// sentido u otro
		// indicamos que la accion se vea afectada tanto por introduccion de teclado como por click con el raton
		tglbtnbtn2 = new JToggleButton("Euros a Pesetas");
		tglbtnbtn2.setBounds(230, 149, 137, 82);
		
		tglbtnbtn2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				if (!tglbtnbtn2.isSelected()) {
					tglbtnbtn2.setText("Euros a Pesetas");

				} else if (tglbtnbtn2.isSelected()) {
					tglbtnbtn2.setText("Pesetas a Euros");

				}

			}
		});
		
		
		// indicamos que la accion se vea afectada tanto por introduccion de teclado como por click con el raton
		tglbtnbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (!tglbtnbtn2.isSelected()) {
					tglbtnbtn2.setText("Euros a Pesetas");

				} else if (tglbtnbtn2.isSelected()) {
					tglbtnbtn2.setText("Pesetas a Euros");

				}

			}
		});
		
		
		//creamos el boton "borrar" para limpiar los campos de texto
		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(229, 107, 137, 26);
		contentPane.add(btnBorrar);
		contentPane.add(tglbtnbtn2);
		btnBorrar.addKeyListener(new KeyAdapter() {
			@Override
			//indicamos que realice la limpieza cuando sea presionado por tecla y por raton
			public void keyPressed(KeyEvent e) {
				
				textFieldCantidad.setText("");
				textFieldResultado.setText("");
				
			}
		});
		
		//indicamos que realice la limpieza cuando sea presionado por tecla y por raton
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textFieldCantidad.setText("");
				textFieldResultado.setText("");
			}
		});
		

	

		
		
		
	}
	// Finalmente le damos accion al boton "cambiar" e indicamos que nos haga la operacion
	// correspondiente en funcion del sentido de la conversion
	// Añadimos tambien un try catch para evitar que falle al darle al boton y no tener datos introducidos
	public void actionPerformed(ActionEvent e) {

		try {
		cantidad = Double.parseDouble(textFieldCantidad.getText());
		
		if (!tglbtnbtn2.isSelected()) {

			double resultadoR= cantidad * 166.386;
			 DecimalFormat df = new DecimalFormat("#0.000");	 
			resultado = resultadoR;
			textFieldResultado.setText(df.format(resultado));
			

		} else if (tglbtnbtn2.isSelected()) {

			double resultadoR= cantidad / 166.386;
			 DecimalFormat df = new DecimalFormat("#0.000");	 
			resultado = resultadoR;
			textFieldResultado.setText(df.format(resultado));
			
		}	
		}catch(java.lang.NumberFormatException Excepcion) {
			JOptionPane.showMessageDialog(null,"Has de introducir un numero en el campo 'Cantidad a Convertir'");
		}

		}

	

}


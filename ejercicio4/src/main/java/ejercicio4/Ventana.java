/**
 * 
 */
package ejercicio4;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


//creamos una clase llamada Ventana 
public class Ventana implements WindowListener{
	
	//declaramos objeto del tipo de la pantalla creada en la otra clase, donde actualizaremos las acciones
	private Ejercicio4App ventana;
	
	//añadimos parametros
	public Ventana(Ejercicio4App ventana) {
		this.ventana = ventana;
	}

	@Override
	//creamos un metodo que nos indique cuando la ventana ha sido abierta por primera vez
	public void windowOpened(WindowEvent e) {
		ventana.textArea.setText(ventana.textArea.getText() + "\nVentana abierta por Primera vez");
	}

	//creamos un metodo que nos indique cuando la ventana  se esta cerrando
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	//creamos un metodo que nos indique cuando la ventana se ha cerrado
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	//creamos un metodo que nos indique cuando la ventana ha sido minimizada
	public void windowIconified(WindowEvent e) {
		ventana.textArea.setText(ventana.textArea.getText() + "\nVentana minimizada");
		
	}

	@Override
	//creamos un metodo que nos indique cuando la ventana ha sido maximizada
	public void windowDeiconified(WindowEvent e) {
		ventana.textArea.setText(ventana.textArea.getText() + "\nVentana maximizada");
		
	}

	@Override
	//creamos un metodo que nos indique cuando la ventana esta visible en la pantalla del ordenador
	public void windowActivated(WindowEvent e) {
		ventana.textArea.setText(ventana.textArea.getText() + "\nVentana en pantalla");
		
	}

	@Override
	//creamos un metodo que nos indique cuando la ventana no esta visible en la pantalla del ordenador
	public void windowDeactivated(WindowEvent e) {
		ventana.textArea.setText(ventana.textArea.getText() + "\nno hay Ventana en pantalla");
		
	}
}
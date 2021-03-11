package ejercicio2.ejercicio2;

import java.awt.EventQueue;

public class Ejercicio2App {
	
	
	
	/**
	 * Creamos el Main para poder lanzar la App 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio2 frame = new Ejercicio2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}

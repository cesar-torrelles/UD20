package ejercicio3;

import java.awt.EventQueue;

public class Ejercicio3App {
	
	/**
	 * Creamos el Main para poder lanzar la App 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio3 frame = new Ejercicio3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}

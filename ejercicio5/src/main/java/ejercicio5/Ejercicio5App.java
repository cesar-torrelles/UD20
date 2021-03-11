package ejercicio5;

import java.awt.EventQueue;

public class Ejercicio5App {
	
	
	/**
	 * Creamos el Main para poder lanzar la App
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio5 frame = new Ejercicio5();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}

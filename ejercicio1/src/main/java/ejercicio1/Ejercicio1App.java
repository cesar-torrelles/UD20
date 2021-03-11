package ejercicio1;

import java.awt.EventQueue;

public class Ejercicio1App {
	
	
	
	
	/**
	 * Creamos el Main para poder lanzar la App 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio1 frame = new Ejercicio1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}

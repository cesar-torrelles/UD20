package ejercicio6;

import java.awt.EventQueue;

public class Ejercicio6App {
	
	
	
	
	/**
	 * Creamos el Main para poder lanzar la App 
	 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Ejercicio6 frame = new Ejercicio6();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

}

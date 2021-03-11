package ejercicio8;

import java.awt.EventQueue;

public class Ejercicio8App {
	
	
	/**
	 * Creamos el Main para poder lanzar la App
	 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Ejercicio8 frame = new Ejercicio8();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	

}

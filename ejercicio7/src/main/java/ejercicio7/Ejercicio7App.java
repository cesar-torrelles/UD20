package ejercicio7;

import java.awt.EventQueue;

public class Ejercicio7App {

	/**
	 * Creamos el Main para poder lanzar la App
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio7 frame = new Ejercicio7();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}

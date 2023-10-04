package carrera;

import java.util.ArrayList;
import java.util.Random;

public class Equipo implements Runnable {

	private ArrayList<String> integrantes;
	private final Random generate;
	private String nombre;

	public Equipo(ArrayList<String> integrantes, String nombre) {
		this.integrantes = integrantes;
		this.generate = new Random();
		this.nombre = nombre;
	}

	@Override
	public void run() {
		
		long startTime = 0;
		long finishTime = 0;
		
		try {

			startTime = System.currentTimeMillis();
			
			for (String atleta : integrantes) {

				System.out.println("Atleta " + atleta + " esta corriendo su carrera.");
				Thread.sleep(generate.nextInt(3000, 4000));
				System.out.println("Atleta " + atleta + " termino su parte de la carrera");
				
			}
			
			finishTime = System.currentTimeMillis();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("El equipo " + nombre + " termino la carrera en: " + (finishTime - startTime));

	}

}

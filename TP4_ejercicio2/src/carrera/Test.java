package carrera;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		 ExecutorService application = Executors.newCachedThreadPool();

	      ArrayList<String> integrantesEquipo1 = new ArrayList<String>();
	      integrantesEquipo1.add("E1A1");
	      integrantesEquipo1.add("E1A2d");
	      integrantesEquipo1.add("E1A3");
	      
	      ArrayList<String> integrantesEquipo2 = new ArrayList<String>();
	      integrantesEquipo2.add("E2A1"); 
	      integrantesEquipo2.add("E2A2");
	      integrantesEquipo2.add("E2A3");
	      
	      ArrayList<String> integrantesEquipo3 = new ArrayList<String>();
	      integrantesEquipo3.add("E3A1");
	      integrantesEquipo3.add("E3A2");
	      integrantesEquipo3.add("E3A3"); 
	      
	      application.execute( new Equipo(integrantesEquipo1, "Equipo 1")  ); 
	      application.execute( new Equipo(integrantesEquipo2, "Equipo 2") );
	      application.execute( new Equipo(integrantesEquipo3, "Equipo 3") ); 

	      application.shutdown();
		
	}

}

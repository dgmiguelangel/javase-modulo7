package clase12.colecciones.queue.priorityqueue;

import java.time.LocalDate;
import java.util.PriorityQueue;
import java.util.Queue;

public class AppPersona {

	public static void main(String[] args) {
		
		Queue<Persona> personas = new PriorityQueue<Persona>();
		
		Persona p1 = new Persona("juan", "perez", new Documento("DNI", 14785896), LocalDate.of(2001, 10, 8));
		Persona p2 = new Persona("ana", "lopez", new Documento("DNI", 25639854), LocalDate.of(2011, 12, 18));
		Persona p3 = new Persona("ana", "gutierrez", new Documento("DNI", 23578854), LocalDate.of(2021, 5, 8));
		
		personas.add(p1);
		personas.add(p2);
		personas.add(p3);
		
		while(!personas.isEmpty()) {
			System.out.println(personas.poll());
		}
		
	}

}

package clase13.mapas.comparator;

import java.time.LocalDate;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class AppPersona {

	public static void main(String[] args) {

		Map<Integer, Persona> personas = new TreeMap<Integer, Persona>(new OrdenKey());

		Persona p1 = new Persona("juan", "perez", new Documento("DNI", 14785896), LocalDate.of(2001, 10, 8));
		Persona p2 = new Persona("ana", "lopez", new Documento("DNI", 25639854), LocalDate.of(2011, 12, 18));
		Persona p3 = new Persona("ana", "gutierrez", new Documento("DNI", 23578854), LocalDate.of(2021, 5, 8));

		personas.put(1, p1);
		personas.put(3, p3);
		personas.put(2, p2);

		for (Entry<Integer, Persona> p : personas.entrySet()) {
			System.out.println("clave: " + p.getKey() + ", valor: " + p.getValue());
		}

	}

}

package clase13.mapas.comparator;

import java.time.LocalDate;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class AppOrdenNomApe {

	public static void main(String[] args) {

		Map<NomApeKey, Persona> personas = new TreeMap<NomApeKey, Persona>(new OrdenNomApeKey());

		Persona p1 = new Persona("juan", "perez", new Documento("DNI", 14785896), LocalDate.of(2001, 10, 8));
		Persona p2 = new Persona("ana", "lopez", new Documento("DNI", 25639854), LocalDate.of(2011, 12, 18));
		Persona p3 = new Persona("ana", "gutierrez", new Documento("DNI", 23578854), LocalDate.of(2021, 5, 8));

		personas.put(new NomApeKey(p1.getNombre(), p1.getApellido()), p1);
		personas.put(new NomApeKey(p2.getNombre(), p2.getApellido()), p2);
		personas.put(new NomApeKey(p3.getNombre(), p3.getApellido()), p3);

		for (Map.Entry<NomApeKey, Persona> p : personas.entrySet()) {
			System.out.println(p.getValue());
		}

	}

}

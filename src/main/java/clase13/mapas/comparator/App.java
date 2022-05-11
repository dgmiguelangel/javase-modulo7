package clase13.mapas.comparator;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class App {

	public static void main(String[] args) {

		Map<Integer, String> nombres = new TreeMap<Integer, String>(new OrdenKey());

		nombres.put(2, "gonzalo");
		nombres.put(3, "sabrina");
		nombres.put(1, "mariana");
		nombres.put(4, "octavio");
		nombres.put(5, "analia");

		for (Entry<Integer, String> e : nombres.entrySet()) {
			System.out.println("clave: " + e.getKey() + ", valor: " + e.getValue());
		}

	}

}

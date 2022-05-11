package clase13.mapas.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class App {

	public static void main(String[] args) {
		
		Map<Integer, String> nombres = new HashMap<Integer, String>();
		
		nombres.put(2, "gonzalo");
		nombres.put(3, "sabrina");
		nombres.put(1, "mariana");
		nombres.put(4, "octavio");
		nombres.put(5, "analia");
		
		System.out.println(nombres.get(5));
		
		System.out.println(nombres.isEmpty());
		
		System.out.println(nombres.containsKey(6));
		
		System.out.println(nombres.containsValue("gonzalo"));
		
		nombres.remove(5);
		
		System.out.println(nombres.toString());
		
		Iterator<Integer> claves = nombres.keySet().iterator();
		while(claves.hasNext()) {
			Integer key = claves.next();
			System.out.println("clave: " + key + ", valor: " + nombres.get(key));
		}
		
		
		for(Entry<Integer, String> e : nombres.entrySet()) {
			System.out.println("clave: " + e.getKey() + ", valor: " + e.getValue());
		}
		
		nombres.clear();
		
		System.out.println(nombres.isEmpty());		

	}

}

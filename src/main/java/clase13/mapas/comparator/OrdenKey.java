package clase13.mapas.comparator;

import java.util.Comparator;

public class OrdenKey implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2.compareTo(o1);
	}

}

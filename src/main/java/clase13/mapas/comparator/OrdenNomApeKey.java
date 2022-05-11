package clase13.mapas.comparator;

import java.util.Comparator;

public class OrdenNomApeKey implements Comparator<NomApeKey> {

	@Override
	public int compare(NomApeKey o1, NomApeKey o2) {
		int rc = o1.getNombre().compareTo(o2.getNombre());
		if(rc == 0) {
			rc = o1.getApellido().compareTo(o2.getApellido());
		}
		return rc;
	}

}

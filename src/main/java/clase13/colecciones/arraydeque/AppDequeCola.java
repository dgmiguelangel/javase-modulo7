package clase13.colecciones.arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class AppDequeCola {

	public static void main(String[] args) {
		
		Deque<String> nombres = new ArrayDeque<String>();
		
		nombres.add("analia");
		nombres.add("octavio");
		nombres.add("mariana");
		nombres.add("ana");
				
		nombres.offerLast("gerardo");
		
		System.out.println(nombres.toString());
		
		while(!nombres.isEmpty()) {
			System.out.println(nombres.pollFirst());
		}

	}

}

package clase13.colecciones.arraydeque;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class App {

	/*
	 * implementacion de cola
	 */
	public static void main(String[] args) {
		
		Queue<String> nombres = new ArrayDeque<String>();
		
		nombres.add("analia");
		nombres.add("octavio");
		nombres.add("mariana");
		nombres.add("ana");
				
//		nombres.offer("ana");
		
		System.out.println(nombres.toString());
		
		while(!nombres.isEmpty()) {
			System.out.println(nombres.poll());
		}

	}

}

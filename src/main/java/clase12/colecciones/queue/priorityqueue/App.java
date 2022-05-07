package clase12.colecciones.queue.priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class App {

	public static void main(String[] args) {
		
		Queue<String> nombres = new PriorityQueue<String>();
		
		nombres.add("analia");
		nombres.add("octavio");
		nombres.add("mariana");
		nombres.add("ana");
		
		System.out.println(nombres.element());
		
//		nombres.offer("ana");
		
		while(!nombres.isEmpty()) {
			System.out.println(nombres.poll());
		}

	}

}

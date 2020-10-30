package lt.vtmc.questack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class JavaQueue {

	public static void main(String[] args) {
		People people1 = new People(1);
		People people2 = new People(2);
		People people3 = new People(3);
		People people4 = new People(4);
		People people5 = new People(5);

		Queue<People> peoples = new LinkedList<>(); // FIFO ArrayBlockingQueue
		peoples.add(people3);
		peoples.add(people1);
		peoples.add(people2);
		peoples.add(people5);

		System.out.println(peoples);
		peoples.poll();
		System.out.println(peoples);
		System.out.println(peoples.peek());
		System.out.println(peoples);
		Queue<People> otherPeoples = new ArrayBlockingQueue<>(5);
		// TODO
	}

}

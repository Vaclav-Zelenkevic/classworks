package lt.vtmc.generics;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class Bag<E> implements Iterable<E>, Serializable, Comparable<E> {

	ArrayList<E> elements = new ArrayList<>();

	boolean isEmpty() {
		return this.elements.isEmpty();
	}

	Integer size() {
		return this.elements.size();
	}

	void add(E element) {
		this.elements.add(element);
	}

	@Override
	public Iterator<E> iterator() {
		return elements.iterator();
	}

	@Override
	public String toString() {
		return "Bag [elements=" + elements + "]";
	}

	@Override
	public int compareTo(E o) {
		// 1, -1, 0
		return 0;
	}

}

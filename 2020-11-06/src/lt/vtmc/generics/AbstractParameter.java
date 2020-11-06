package lt.vtmc.generics;

public abstract class AbstractParameter<K, V> { // T - type
	private K id;
	private V value;

	public AbstractParameter(K id, V value) {
		this.value = value;
		this.id = id;
	}

	public V getValue() {
		return value;
	}

	public K getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Parameter [id=" + id + ", value=" + value + "]";
	}

}

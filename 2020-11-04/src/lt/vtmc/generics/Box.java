package lt.vtmc.generics;

public class Box<T> { // Grieztai tipizuota!!! JVM nesupras kazkas??? --> Konkretus tipas!!!
	private T id;

	public Box(T id) {
		this.id = id;
	}

	public T getId() {
		return id;
	}

	/*
	 * Conventions for naming space E - element N - number T - type V - value
	 */
}

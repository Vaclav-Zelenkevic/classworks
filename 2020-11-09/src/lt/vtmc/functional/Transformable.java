package lt.vtmc.functional;

@FunctionalInterface
public interface Transformable<T> {
	T transform(T t); // For transformations
}

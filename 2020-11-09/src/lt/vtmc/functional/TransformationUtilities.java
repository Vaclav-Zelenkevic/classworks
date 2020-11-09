package lt.vtmc.functional;

public class TransformationUtilities<T> {
	T transform(T t, Transformable<T> function) {
		return function.transform(t);
	}

	static String kazkas(String str) {
		return str.toUpperCase() + " kazkas";
	}
}

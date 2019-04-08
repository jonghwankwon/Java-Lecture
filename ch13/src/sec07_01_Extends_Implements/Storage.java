package sec07_01_Extends_Implements;

public interface Storage<T> {
	public void add(T item, int index);
	public T get(int index);
}

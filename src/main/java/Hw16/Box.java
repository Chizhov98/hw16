package Hw16;

public class Box<T> {

    private T item;

    public void put(T item) {
        this.item = item;
    }

    public T get() {
         return (T) this.item;
    }
}

package Homework.OOP.MyList;

public class MyList<T> {
    private Object[] elements;
    private int size;

    public MyList() {
        this.elements = new Object[10];
        this.size = 0;
    }

    public void add(T element){
        elements[size++] = element;
    }

    public T get(int idx){
        if(idx < 0 || idx >= size){
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        return (T) elements[idx];
    }

    public int size(){
        return size;
    }
}

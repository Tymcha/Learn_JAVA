package Homeworks.HW9;

import java.util.ArrayList;

public class MyArrayList<E> {
    private int size;
    private E[] elementData;

    public MyArrayList() {
        this(10);
    }

    public MyArrayList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Initial capacity must be non-negative");
        }
        elementData = (E[]) new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (elementData[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(E element) {
        return indexOf(element) != -1;
    }

    public boolean add(E element) {
        ensureCapacity();
        elementData[size++] = element;
        return true;
    }

    public boolean add(E element, int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        ensureCapacity();
        for (int i = size - 1; i >= index; i--) {
            elementData[i + 1] = elementData[i];
        }
        elementData[index] = element;
        size++;
        return true;
    }

    public E remove(int index) {
        if (index > size - 1 || index < 0) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        E element = elementData[index];
        for (int i = index + 1; i < size; i++) {
            elementData[i - 1] = elementData[i];
        }
        size--;
        elementData[size] = null;
        return element;
    }

    public E get(int index) {
        if (index > size - 1 || index < 0) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        return elementData[index];
    }

    private void ensureCapacity() {
        if (size == elementData.length) {
            E[] newArray = (E[]) new Object[2 * elementData.length];
            System.arraycopy(elementData, 0, newArray, 0, size);
            elementData = newArray;
        }
    }
}

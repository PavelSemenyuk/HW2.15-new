package com.example.hw2_15;

public class MyArrayList implements StringList {

    private static final int INITIAL_CAPACITY = 10;
    private String[] elements = new String[6];
    private int size;


    public MyArrayList() {
    }

    public MyArrayList(String[] elements) {
        this.elements = elements;
        this.size = elements.length;
    }

    public MyArrayList(StringList stringList) {
        this.elements = stringList.toArray();
        this.size = stringList.size();
    }

    @Override
    public String add(String item) {
        if (item == null) {
            throw new IllegalArgumentException("Элемент не может быть нулл");
        }
        if (size == elements.length) {
            expandCapacity();
        }
        elements[size] = item;
        size++;
        return item;
    }

    @Override
    public String add(int index, String item) {
        if (item == null) {
            throw new IllegalArgumentException("Элемент не может быть нулл");
        }
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Индекс выход за приделы массива");
        }
        if (size == elements.length) {
            expandCapacity();
        }
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];

        }
        elements[index] = item;
        size++;
        return item;
    }

    @Override
    public String set(int index, String item) {
        if (item == null) {
            throw new IllegalArgumentException("Элемент не может быть нулл");
        }
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Индекс выход за приделы массива");
        }
        String oldItem = elements[index];
        elements[index] = item;
        return oldItem;
    }

    @Override
    public String remove(String item) {
        if (item == null) {
            throw new IllegalArgumentException("Элемент не может быть нулл");
        }
        for (int i = 0; i < size; i++) {
            if (item.equals(elements[i])) ;
            return remove(i);
        }
        throw new IllegalArgumentException("Элемент не найден");
    }



    @Override
    public String remove(int index) {
        if (index<0||index>size){
            throw new IndexOutOfBoundsException("Индекс выход за приделы массива");
        }
        String item = elements[index];
        for (int i = index; i < size-1; i++) {
            elements[i]=elements[i+1];
        }
        elements[size-1]=null;
        size--;
        return item;
    }

    @Override
    public boolean contains(String item) {
        if (item == null) {
            throw new IllegalArgumentException("Элемент не может быть нулл");
        }
        for (int i = 0; i < size; i++) {
            if (item.equals(elements[i]));
            return true;
        }
        return false;
    }

    @Override
    public int indexOf(String item) {
        if (item == null) {
            throw new IllegalArgumentException("Элемент не может быть нулл");
        }
        for (int i = 0; i < size; i++) {
            if (item.equals(elements[i]));
            return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(String item) {
        if (item == null) {
            throw new IllegalArgumentException("Элемент не может быть нулл");
        }
        for (int i = size-1; i < 0; i--) {
            if (item.equals(elements[i]));
            return i;
        } return -1;
    }

    @Override
    public String get(int index) {
        if (index<0||index>size){
            throw new IndexOutOfBoundsException("Индекс выходит за приделы массива");
        }
        return elements[index];
    }

    @Override
    public boolean equals(StringList otherList) {
        if (otherList==null){
            throw new IllegalArgumentException("Другой список не может быть нулл");
        }
        if (otherList.size()!=size){
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!elements[i].equals(otherList.get(i))){
                return false;
            }
        }
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i]=null;
        }
        size=0;
    }

    @Override
    public String[] toArray() {
        String[] array = new String [size];
        for (int i = 0; i < size; i ++) {
            array [i] = elements [i];
        }
        return array;
    }

    private void expandCapacity() {
        String[] newElements = new String[elements.length * 2];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }


}

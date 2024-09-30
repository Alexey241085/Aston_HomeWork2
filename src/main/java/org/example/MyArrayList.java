package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

public class MyArrayList<E> implements MyList<E> {
    private E[] element;
    private int size = 0;


    public MyArrayList() {
        element = (E[]) new Object[0];
    }

    public MyArrayList(Collection<? extends E> collection) {
        this.element = (E[]) collection.toArray();
        this.size = collection.size();
    }

    @Override
    public boolean add(E el) {
        E[] temp = element;
        element = (E[]) new Object[temp.length + 1];
        System.arraycopy(temp, 0, element, 0, temp.length);
        element[element.length - 1] = el;
        return true;
    }

    @Override
    public void remove(int el) {
        E[] temp = element;
        element = (E[]) new Object[temp.length - 1];
        System.arraycopy(temp, 0, element, 0, el);
        int amountAfterEl = temp.length - el - 1;
        System.arraycopy(temp, el + 1, element, el, amountAfterEl);
    }

    @Override
    public E updute(int index, E el) {
        element[index] = el;
        return el;
    }

    @Override
    public int size() {
        return element.length;
    }

    @Override
    public E get(int index) {
        return element[index];
    }

    @Override
    public void addAll(Collection<? extends E> collection) {
        for (E el : collection) {
            add(el);
        }
    }


    public static <E extends Comparable<E>> void bubleSort(MyArrayList<E> list) {
        boolean swapp;
        for (int i = 0; i < list.size() - 1; i++) {
            swapp = false;
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    E temp = list.get(j);
                    list.updute(j, list.get(j + 1));
                    list.updute(j + 1, temp);
                    swapp = true;
                }
            }
            if (!swapp) {
                break;
            }
        }
    }
}




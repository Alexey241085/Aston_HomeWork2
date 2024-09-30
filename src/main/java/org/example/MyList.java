package org.example;

import java.util.Collection;

public interface MyList<E>{

    boolean add(E element);
    void remove(int element);

    E updute(int index, E el);

    int size();
    E get(int index);

    void addAll(Collection<? extends E> collection);
}

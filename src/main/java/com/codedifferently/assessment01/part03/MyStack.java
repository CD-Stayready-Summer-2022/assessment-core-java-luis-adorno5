package com.codedifferently.assessment01.part03;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;

public class MyStack<T>{

    private ArrayList<T> elements;

    public MyStack() {
        this.elements = new ArrayList<>();
    }

    public boolean isEmpty() { return size() == 0; }

    public void push(T i) {
        elements.add(i);
    }

    public T pop() throws EmptyStackException {
        if(isEmpty()) throw new EmptyStackException();
        return elements.remove(elements.size() - 1);
    }

    public T peek() {
        if(isEmpty()) return null;
        return elements.get(size()-1);
    }

    public Integer size(){
        return elements.size();
    }
}

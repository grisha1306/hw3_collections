package com.company.list;

import java.util.Iterator;

public class MyLinkedList<E> implements ILinkedList<E> {

    private Node<E> first;
    private Node<E> last;
    private int size;

    public MyLinkedList() {
        first = new Node<>(null,null,null);
        last = new Node<>(null,null,null);
    }

    private void addLast(E element) {
        if (size == 0) {
            first.setElement(element); //= new Node<E> (element);
            last = first;
        }
        else {
            Node<E> tmp = last;
            last = new Node<E>(tmp,element,null);
            tmp.setNextNode(last);
        }
        size++;
    }


    @Override
    public void add(E element) {
        addLast(element);
    }

    @Override
    public void add(int index, E element) {
        if ( !checkIndex(index))  {
            System.out.println("Out of range" + index);
            return;
        }

        if(size == index)
            addLast(element);
        else {
            if (index == 0) {
                Node<E> tmp = new Node<E>(null, element, first);
                first = tmp;
                size++;
            }
            else {
                Node<E> current = node(index);
                final Node<E> pred = current.getPrevNode();
                final Node<E> newNode = new Node<>(pred, element, current);
                current.setPrevNode(newNode);
                pred.setNextNode(newNode);
                size++;
            }
        }

    }

    @Override
    public void clear() {
        for (Node<E> x = first; x != last; ) {
            Node<E> next = x.getNextNode();
            x.setElement(null);
            x.setNextNode(null);
            x.setPrevNode(null);
            x = next;
        }
        first = last = null;
        size = 0;
    }

    @Override
    public E get(int index) {
        if ( !checkIndex(index))  {
            System.out.println("Out of range");
            return null;
        }
        Node<E> current = node(index);
        return current.getElement();
    }

    @Override
    public int indexOf(E element) {
        int index = 0;
        Node <E> tmp = first;
        if (element == null) {
            while (index < size) {
                if (tmp.getElement() == null )
                    return index;
                tmp = tmp.getNextNode();
                index++;
            }
        }
        else{
                while (index < size) {
                    if (element.equals(tmp.getElement()))
                        return index;
                    tmp = tmp.getNextNode();
                    index++;
                }
            }
        return -1;
    }

    @Override
    public E remove(int index) {
        if ( !checkIndex(index))  {
            System.out.println("Out of range");
            return null;
        }

        Node<E> tmp = node(index);
        E element = tmp.getElement();
        Node<E> prev = tmp.getPrevNode();
        Node<E> next = tmp.getNextNode();
        if (prev == null ) {
            first = next;
        }
        else {
            prev.setNextNode(next);
        }

        if (next == null ) {
            last = prev;
        }
        else {
            next.setPrevNode(prev);
        }

        size--;
        return element;
    }

    @Override
    public E set(int index, E element) {
        if ( !checkIndex(index))  {
            System.out.println("Out of range");
            return null;
        }

        int count = 0;
        Node<E> tmp = first;
        while (count < index) {
            tmp = tmp.getNextNode();
            count++;
        }
        E oldVal = tmp.getElement();
        tmp.setElement(element);
        return oldVal;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object[] toArray() {
        Object[] elementsArray = new Object[size];
        int i = 0;
        for (Node<E> x = first; x != null; x = x.getNextNode()) {
            elementsArray[i] = x.getElement();
            i++;
        }
//        elementsArray[i] = last.getElement();
        return elementsArray;

    }

    @Override
    public <T> T[] toArray(T[] array) {
        int i = 0;
        if(array.length < size) {
            array = (T[]) java.lang.reflect.Array.newInstance(array.getClass().getComponentType(), size);
        }

        Object[] tempArray = array;
        for (Node<E> x = first; x != null; x = x.getNextNode()) {
            tempArray[i] = x.getElement();
            i++;
        }

        if (array.length > size) {
            array[size] = null;
        }

        return array;
    }

    @Override
    public String toString() {
        String str = "";
        str = "MyLinkedList: ";
        for (Node<E> x = first; x != null; x = x.getNextNode()) {
            str += x.getElement() + ", ";
        }
        str = str.substring(0, str.length() - 2);

        return str;
    }

    private boolean checkIndex (int index) {
        if (index >= 0 && index <= size )
            return true;
        else
            return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public E next() {
                return get(index++);
            }
        };
    }

    Node<E> node(int index) {
        if (index < (size >> 1)) {
            Node<E> x = first;
            for (int i = 0; i < index; i++)
                x = x.getNextNode();
            return x;
        } else {
            Node<E> x = last;
            for (int i = size - 1; i > index; i--)
                x = x.getPrevNode();
            return x;
        }
    }

    class Node<E> {

        private Node<E> prevNode;
        private E element;
        private Node<E> nextNode;

        public Node(Node<E> prevNod, E element, Node<E> nextNode) {
            this.prevNode = prevNod;
            this.element = element;
            this.nextNode = nextNode;
        }

        public Node(E element) {
            this.element = element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public void setNextNode(Node<E> nextNode) {
            this.nextNode = nextNode;
        }

        public void setPrevNode(Node<E> prevNode) {
            this.prevNode = prevNode;
        }

        public Node<E> getPrevNode() {
            return prevNode;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNextNode() {
            return nextNode;
        }

    }



}





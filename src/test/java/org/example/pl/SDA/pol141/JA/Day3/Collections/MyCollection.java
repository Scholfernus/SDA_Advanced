package org.example.pl.SDA.pol141.JA.Day3.Collections;

import java.util.Collection;
import java.util.Iterator;

public class MyCollection<E> implements Collection<E> {
    private static final String DELIMITER_REGEPX = "\\|";
    private static final String DELIMITER = "|";
    private String content = "";

    @Override
    public int size() {
        if (content.contains(DELIMITER)){

            return content.split(DELIMITER_REGEPX).length;
        }
        if (content.isEmpty()){
            return 0;
        }
        return 1;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        final String[] strings = content.split(DELIMITER_REGEPX);
        for (var item : strings) {
            if (item.equals(o.toString())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return content.split(DELIMITER_REGEPX);
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        if (content.isEmpty()) {
            content = e.toString();
            return true;
        }else {
            content = content + DELIMITER + e.toString();
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (contains(o)) {
            final String[] strings = content.split(DELIMITER_REGEPX);
            String removed = o.toString();
            String newContent = "";
            for (var item : strings) {
                if (item.equals(o.toString())) {
                    newContent += item + DELIMITER;
                }
            }
            content = newContent.substring(0, newContent.length()-1);
            return true;
        } else {

            return false;
        }
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
    content = "";
    }
}

package com.github.yavin.algorhim.sort;

public abstract class AbstractSort {

    public abstract void sort(Comparable[] a);

    boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    void exch(Comparable[] a, int i, int j) {
        Comparable tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    void show(Comparable[] a) {
        for(Comparable x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

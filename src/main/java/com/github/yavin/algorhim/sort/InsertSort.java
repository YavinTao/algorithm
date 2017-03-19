package com.github.yavin.algorhim.sort;

/**
 * Created by cloud on 2017/2/22.
 */
public class InsertSort extends AbstractSort {

    @Override
    public void sort(Comparable[] a) {
        int N = a.length;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i ; j++) {
                if (less(a[j], a[i])) {
                    exch(a, j, i);
                }
            }
        }
    }

    public static void main(String[] args) {
        Comparable[] a = new Integer[]{3,2,6,1,8};

        AbstractSort s = new InsertSort();
        s.sort(a);
        s.show(a);
    }
}

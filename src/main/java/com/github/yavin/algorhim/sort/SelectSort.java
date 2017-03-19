package com.github.yavin.algorhim.sort;

/**
 * Created by cloud on 2017/2/22.
 */
public class SelectSort extends AbstractSort {

    @Override
    public void sort(Comparable[] a) {
        int  min;
        for(int i = 0; i < a.length; i++) {
            min = i;
            for (int j=i + 1; j < a.length; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exch(a, i, min);
        }
    }

    public static void main(String[] args) {
        Comparable[] a = new Integer[]{3,2,6,1,8};

        AbstractSort s = new LowToMergeSort();
        s.sort(a);
        s.show(a);
    }
}

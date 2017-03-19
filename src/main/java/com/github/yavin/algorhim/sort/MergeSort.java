/*
 * Copyright (c) 2017, TP-Link Co.,Ltd.
 * Author:  taoyang <taoyang@tp-link.com.cn>
 * Created: 2017-03-18
 */
package com.github.yavin.algorhim.sort;

public class MergeSort extends AbstractSort {

    protected Comparable[] aux;

    public void merge(Comparable[] a, int low, int mid, int hi) {
        // a[low] - a[mid], a[mid+1] - a[hi]
        int i = low;
        int j = mid + 1;

        for (int k = low; k <= hi; k++) {
            aux[k] = a[k];
        }

        for (int k = low; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (less(a[i], a[j])) {
                a[k] = aux[i++];
            } else {
                a[k] = aux[j++];
            }
        }
    }

    public void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a, 0, a.length-1);
    }

    private void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = (hi - lo) / 2 + lo;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }

}

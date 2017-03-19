/*
 * Copyright (c) 2017, TP-Link Co.,Ltd.
 * Author:  taoyang <taoyang@tp-link.com.cn>
 * Created: 2017-03-19
 */
package com.github.yavin.algorhim.search;

class BinarySearch {
    int search(Comparable[] a, Comparable k) {
        int N = a.length;

        int lo = 0;
        int hi = N;

        while (hi >= lo) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid].compareTo(k) == 0) {
                return mid;
            } else if (a[mid].compareTo(k) > 0) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Comparable[] a = new Integer[]{1,2,3,4,5,6,7,8};

        System.out.println(new BinarySearch().search(a, 3));
    }
}



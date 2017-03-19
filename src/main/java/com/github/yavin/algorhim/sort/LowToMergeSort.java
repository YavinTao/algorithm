/*
 * Copyright (c) 2017, TP-Link Co.,Ltd.
 * Author:  taoyang <taoyang@tp-link.com.cn>
 * Created: 2017-03-18
 */
package com.github.yavin.algorhim.sort;

public class LowToMergeSort extends MergeSort {

    public void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        int N = a.length;

        for (int i = 1; i < N; i = i*2) { // 子数组大小
            for (int j = 0; j < N - i; j += i*2) {  // 子数组索引
                merge(a, j, j+i -1, Math.min(j + i*2, N -1));
            }
        }
    }
}

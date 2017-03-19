
package com.github.yavin.algorhim;

public class SubarraySum {

    public int getSumOne(int[] a) {
        int N = a.length;

        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                int sum = 0;
                for (int k = i; k < j; k++) {
                    sum += a[k];
                }
                if (sum > max) {
                    max = sum;
                }
            }
        }

        return max;
    }

    public int getSumOnePlus(int[] a) {
        int N = a.length;

        int max = 0;
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = i; j < N; j++) {
                sum += a[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }

        return max;
    }

    public int getSumTwo(int[] a) {
        int N = a.length;

        int max = 0;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += a[i];
            if (sum > max) {
                max = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] a = new int[] {1, 2, -4, 9, 3, 1, -10 , 10};

        SubarraySum subarraySum = new SubarraySum();

        System.out.println(subarraySum.getSumOne(a));
        System.out.println(subarraySum.getSumOnePlus(a));
        System.out.println(subarraySum.getSumTwo(a));
    }

}

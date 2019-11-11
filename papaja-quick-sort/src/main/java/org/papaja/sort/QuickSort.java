package org.papaja.sort;

import java.util.stream.Stream;

public class QuickSort {

    public static void main(String[] args) {
        QuickSort sort = new QuickSort();

        char[] chars = "qweasdzxc".toCharArray();

        sort.sort(chars);

        System.out.println(new String(chars));
    }

    private static void swap(char[] a, int i, int j) {
        char t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static int partition(char[] a, int l, int r) {
        int i = l - 1;

        System.out.println(">>> " + new String(a));

        for (int j = 0; j < r; j++) {
            if (a[j] <= a[r]) {
                i++;
                swap(a, i, j);
            }
        }

        System.out.println("<<< " + new String(a));

        System.out.println("i " + i);
        System.out.println("l " + l);
        System.out.println("r " + r);
        System.out.println("==============");
        swap(a, i + 1, r);

        return i + 1;
    }

    public void sort(char[] a, int l, int r) {
        if (r > l) {
            int index = partition(a, l, r);
            sort(a, l, index - 1);
            sort(a, index + 1, r);
        }
    }

    public void sort(char[] a) {
        sort(a, 0, a.length - 1);
    }
//
//    public void sort(int[] a) {
//        Stream.of(a).map(char.class::cast).toArray(Character[]::new);
//        sort(a, 0, a.length - 1);
//    }
//
//    public char[] toChars(int[] ints) {
//        char[] array = new char[ints.length - 1];
//
//        for (int anInt : ints) {
//            array[i] = char.class.cast(anInt);
//        }
//
//        return array;
//    }

}

package ru.makarov.logic;

import java.util.*;

public class ListUniqSum {
    public static void main(String[] args) {
        int[] a = {3,2,1,-1,5};
        TreeSet<Integer> list = new TreeSet<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                list.add(a[i] + a[j]);
            }
        }
        System.out.println(list);
    }
}

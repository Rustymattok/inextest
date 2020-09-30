package ru.makarov.logic;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class ListUniqSum {
    public static void main(String[] args) {
        int[] a = {3, 2, 3, 5};
        /*
          Bad case:
            O value -> n*n*n
          Mid case:
            O value -> n*n*1
         */
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                    map.put(a[i] + a[j], i);
            }
        }
        /*
          Bad case:
          O value -> n*n*log(n)
          Mid case:
          O value -> n*n*log(n)
         */
        TreeSet<Integer> list = new TreeSet<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                list.add(a[i] + a[j]);
            }
        }

        System.out.println(list);

        for (Map.Entry<Integer, Integer> value : map.entrySet()) {
            System.out.print(value.getKey() + " ");
        }

    }

}

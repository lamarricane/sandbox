package ru.ssau.tk.lamarricane.sandbox.task_2;

import java.util.*;

public class Array_21 {
    static int massive(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : array) {
            if (!map.containsKey(j)) {
                map.put(j, 1);
            } else {
                map.put(j, map.get(j) + 1);
            }
        }
        return Collections.max(map.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
    }
}

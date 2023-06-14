package PackForTask1;

import java.util.ArrayList;
// Реализовать алгоритм сортировки слиянием(метод взять из Интернета)

public class methods {
    /**
     * @param list list of int numbers
     */
    public static void MergeSort(ArrayList<Integer> list) {
        if (list.size() <= 1) {
            return;
        }
        int mid = list.size() / 2;
        ArrayList<Integer> left = new ArrayList<>(list.subList(0, mid));
        ArrayList<Integer> right = new ArrayList<>(list.subList(mid, list.size()));
        MergeSort(left);
        MergeSort(right);
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.size() && j < right.size()) {
            if (left.get(i) < right.get(j)) {
                list.set(k++, left.get(i++));
            } else {
                list.set(k++, right.get(j++));
            }
        }
        while (i < left.size()) {
            list.set(k++, left.get(i++));
        }
        while (j < right.size()) {
            list.set(k++, right.get(j++));
        }
    }
    
    
}

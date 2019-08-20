package sort;

import java.util.LinkedList;
import java.util.List;

/**
 * 快排第二种实现方式
 */
public class QuickSort2 {
    public static List<Integer> quickSort(List<Integer> list) {

        if (list.size()>0) {
            List<Integer> smaller = new LinkedList<Integer>();
            List<Integer> same = new LinkedList<Integer>();
            List<Integer> larger = new LinkedList<Integer>();

            Integer middleValue = list.get(list.size() / 2);
            for (Integer number : list) {
                if (number<middleValue) {
                    smaller.add(number);
                }else if (number>middleValue) {
                    larger.add(number);
                }else {
                    same.add(number);
                }
            }

            quickSort(smaller);
            quickSort(larger);

            list.clear();
            list.addAll(smaller);
            list.addAll(same);
            list.addAll(larger);
        }
        return list;
    }
}

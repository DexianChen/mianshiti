package sort;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@RunWith(JUnit4.class)
public class QuickSort2Test {
    @Test
    public void testQuickSort2() {
        Integer[] a = {5,48,59,65,2,14,5,4,6,45,78,485};

        List<Integer> list = new LinkedList<Integer>();
        for (Integer number : a) {
            list.add(number);
        }

        List<Integer> resultList = QuickSort2.quickSort(list);
        System.out.println(resultList);
    }
}

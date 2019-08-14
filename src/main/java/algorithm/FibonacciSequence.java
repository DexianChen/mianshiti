package algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 斐波那契数列的定义：它的第一项和第二项均为1，以后各项都为前两项之和
 */
public class FibonacciSequence {
    public static void main(String[] args) {
        List<Integer> sequence = new ArrayList<Integer>();
        sequence.add(1);
        sequence.add(1);

        getFibonacciSequence(sequence,20);

        for (Integer integer : sequence) {
            System.out.print(integer + " ");
        }
    }

    private static List<Integer> getFibonacciSequence(List<Integer> sequence, int num){
        for (int i=2; i<num; i++){
            sequence.add(sequence.get(i-2) + sequence.get(i-1));
        }
        return sequence;
    }
}

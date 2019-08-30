package recurrence;

<<<<<<< HEAD
/**
 * @author cdx
 * date: 2019/08/18
 */
public class Recurrence {
    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
     */
    public static int jump(int n) {
        if (n <= 1) {
            return 1;
        }

        return jump(n-1) + jump(n-2);
    }
}

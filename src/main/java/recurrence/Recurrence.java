package recurrence;

/**
 * @author cdx
 * date: 2019/08/18
 */
public class Recurrence {
    public static void main(String[] args) {
        System.out.println(recurrence(100));
    }

    private static int recurrence(int a) {
        if (a<1) {
            return a;
        }
        return recurrence(a-1) + a;
    }
}

package algorithm;

/**
 * 韩信带兵不足百人，3人一行排列多一人，7人一行排列少两人，5人一行正好，本例是计算韩信究竟点了多少兵？
 */
public class DianBing {
    public static void main(String[] args) {
        int num = 100;

        while (num >0){
            if ((num-1)%3==0 && (num+2)%7==0 && num%5==0){
                System.out.println("韩信共点了" + num + "兵");
            }
            num--;
        }
    }
}

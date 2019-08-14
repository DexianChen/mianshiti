package algorithm;

/**
 * 案列说明：主要内容是：公鸡5元一只，母鸡3元一只，小鸡1元三只，问100元怎样可以买100鸡？
 */
public class ChickenTest {

    public static void main(String[] args) {
        int x = 100/5;
        int y;
        int z;

        while(x>=0){
            //计算可购买的母鸡数量
            y = (100-5*x)/3;

            while(y>=0){
                //计算小鸡的数量
                z = (100 - 5*x - 3*y)*3;

                //判断条件
                int num = x + y + z;
                int price = 5*x + 3*y + z/3;
                if (num == 100 && price ==100){
                    System.out.println("买公鸡"+ x + "只，母鸡" + y + "只，小鸡" + z + "只");
                }

                y--;
            }

            x--;
        }
    }
}

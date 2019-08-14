package sort;

/**
 * 冒泡排序
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] a = {2, 9, 4, 8, 6, 3};

        //每次都选出在比较的数组的最值
        for (int i=0; i<a.length-1; i++){

            //已经比较了的不再参与比较
            for (int j=0; j<a.length-1-i; j++){
                if (a[j] > a[j+1]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }

            System.out.println("第" + (i+1) + "次的数组为：");
            for (int num : a) {
                System.out.print(num + ",");
            }
            System.out.println();
        }

        System.out.println();
        for (int num : a) {
            System.out.print(num + ",");
        }
    }
}

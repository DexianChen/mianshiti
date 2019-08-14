package sort;

public class QuickSort1 {
    public static void main(String[] args) {
        int[] num = {3,1,2,5,4};
        quickSort(num);

        for (int i : num) {
            System.out.print(i + " ");
        }
    }

    private static void quickSort(int[] L) {
        Qsort(L,0,L.length-1);
    }

    private static void Qsort(int[] num,int low,int high) {
        int pivot;
        if(low<high) {
            //将num[low,high]一分为二,算出枢轴值pivot,该值得位置固定,不用再变化
            pivot=partition0(num,low,high);

            /*对两边的数组分别排序，因为是递归的，所以每次都会先一分为二，然后再排两边，pivot会一直改变（影响着high位或者low位），
            直到high位等于low位，跳出递归*/
            Qsort(num,low,pivot-1);

            Qsort(num,pivot+1,high);
        }
    }

    /**
     * 选择一个枢轴值(关键字) 把它放到某个位置 使其左边的值都比它小 右边的值都比它大
     * @param num
     * @param low
     * @param high
     * @return
     */
    private static int partition0(int[] num,int low,int high) {
        int pivotkey;
        pivotkey=num[low];

        //顺序很重要，要先从右边找
        while(low<high) {
            //从后往前找到比key小的放到前面去
            while(low<high && num[high]>=pivotkey) {
                high--;
            }
            swap(num,low,high);

            //从前往后找到比key大的 放到后面去
            while(low<high && num[low]<=pivotkey) {
                low++;
            }
            swap(num,low,high);
        }

        // 能跳出循环，证明low=high，交换的情况都是low位与high位交换，交换的是参考值，所以此时low位就是参考值
        return low;
    }

    /**
     * 交换数组的两个位置
     */
    private static void swap(int[] num,int i,int j) {
        int temp=num[i];
        num[i]=num[j];
        num[j]=temp;
    }
}

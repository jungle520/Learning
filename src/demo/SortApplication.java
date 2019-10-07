package demo;

/**
 * Created by wangjiang on 2019/9/5.
 */
public class SortApplication {
    public static void main(String[] args) {
        int[] arr = {6, 9, 1, 4, 5, 8, 7, 0, 2, 3};
//        first(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        //chooseMethod(arr);
//        speedMrthod(arr, 0, 9);
//        for (int num : arr
//                ) {
//            System.out.println(num);
//        }

        insertMethod(arr);
        for (int num : arr
                ) {
            System.out.println(num);
        }

    }


    /*1:冒泡排序
    原理：比较两个相邻的元素，将值大的元素交换至一端。

    思路：依次比较相邻的两个数，将小数放在前面，大数放在后面。
    即在第一趟：首先比较第1个和第2个数，将小数放前，大数放后。
    然后比较第2个数和第3个数，将小数放前，大数放后，
    如此继续，直至比较最后两个数，将小数放前，大数放后。
    重复第一趟步骤，直至全部排序完成。
    时间复杂度 0(n2)
    最理想的状态，刚好是按顺序，时间复杂度为On,
    最坏的情况是都需要交换位置，时间复杂度为On2;
    */
    public static void first(int[] a) {
        int length = a.length;
        int temp = 0;
        for (int j = 0; j < a.length - 1; j++) {
            for (int i = 0; i < a.length - 1 - j; i++) {
                if (a[i] > a[i + 1]) {
                    // change
                    temp = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = temp;
                }
            }
        }
    }

    //选择排序
    public static void chooseMethod(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int k = i;
            for (int j = k + 1; j < arr.length; j++) {
                if (arr[j] < arr[k]) {
                    k = j; //记下目前找到的最小值所在的位置
                }
            }
            //在内层循环结束，也就是找到本轮循环的最小的数以后，再进行交换
            if (i != k) {  //交换a[i]和a[k]
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
            }
            System.out.println("\n" + "---第" + (i + 1) + "轮找到最小数的位置是第" + (k + 1) + "个数-----");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }

    /*
    快速排序
     */

    public static void speedMrthod(int[] a, int low, int high) {
        int start = low;
        int end = high;
        int key = a[low];
        while (end > start) {
//从后往前比较
            while (end > start && a[end] >= key)
//如果没有比关键值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
                end--;
            if (a[end] <= key) {
                int temp = a[end];
                a[end] = a[start];
                a[start] = temp;
            }
//从前往后比较
            while (end > start && a[start] <= key)
//如果没有比关键值大的，比较下一个，直到有比关键值大的交换位置
                start++;
            if (a[start] >= key) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
//此时第一次循环比较结束，关键值的位置已经确定了。左边的值都比关键值小，右边的
            // 值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用
        }
        System.out.println("start " + start + " " + "end " + end + " low" + low + " high" + high);
        for (int num : a
                ) {
            System.out.print(num);
        }
        System.out.println("");
//递归
        if (start > low) speedMrthod(a, low, start - 1);//左边序列。第一个索引位置到关键值索引-1
        if (end < high) speedMrthod(a, end + 1, high);//右边序列。从关键值索引+1 到最后一个
    }


   /*
   插入排序
    */

    public static void insertMethod(int[] arr) {
        int[] arr1 = {6, 9, 1, 4, 5, 8, 7, 0, 2, 3};
        for (int i = 1; i < arr.length; i++) {
//插入的数
            int insertVal = arr[i];//1
//被插入的位置(准备和前一个数比较)
            int index = i - 1;//1
//如果插入的数比被插入的数小
            while (index >= 0 && insertVal < arr[index]) {
//将把 arr[index] 向后移动
                arr[index + 1] = arr[index];
//让 index 向前移动
                index--;
            }
//把插入的数放入合适位置
            arr[index + 1] = insertVal;
            for(int num:arr){
                System.out.print(num+"  ");
            }
            System.out.println(" ");
        }
    }
}

package demo;

import java.lang.reflect.Method;

/**
 * Created by wangjiang on 2019/9/17.
 * 手写各个排序算法
 */
public class Sorted {
    public static void main(String[] args) {
        int[] arr = {6, 9, 1, 4, 5, 8, 7, 0, 2, 3};
        //反射
        try {
            Method[] methods=  Class.forName("demo.Sorted").getMethods();
            for (Method m:methods
                 ) {
                System.out.println(m.getName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //new Sorted().bubbleSorted(arr);
        //chooseSorted(arr);
        speedSorted(arr,0,arr.length-1);
        for (int i:arr
             ) {
            System.out.println(arr[i]);
        }
    }

      //冒泡排序
      public void bubbleSorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>=arr[j+1]){
                    arr[j]=arr[j]+arr[j+1];
                    arr[j+1]=arr[j]-arr[j+1];
                    arr[j]=arr[j]-arr[j+1];
                }
            }
        }
    }

    //选择排序
    public static  void chooseSorted(int[]  arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j])  //比较大小，小的放前面
                {
                    int temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    //快速排序
    public  static void speedSorted(int[] arr,int low, int high){
        int start=low;
        int key=arr[start];
        int end=high;
     while(end>start){
         while(end>start && arr[end]>key){
             end--;
         }
         if(arr[end]<=key){
             int temp= arr[end];
             arr[end]=key;
             key=temp;

         }
         while(end >start && arr[start]<key){
             start++;
         }
         if(arr[start]>=key){
             int temp= arr[start];
             arr[start]=key;
             key=temp;
         }
     }
       //递归调用
        if(start>low) {
            speedSorted(arr,low,start+1);
        }
        if(end<high){
            speedSorted(arr,end+1,high);
        }
    }


    //插入排序
    public  static void insertSort(int[] arr){
        for (int i=1;i<arr.length;i++){
            int key=arr[i];
            int index=i-1;
            while(index>=0 && arr[i]<=arr[index]){
                arr[index+1]=arr[index];
                index--;
            }
            arr[index+1]=key;
        }
    }
}

package quickSort;

import java.util.Arrays;
import java.util.Random;

public class JavaQuickSort {

    private static int[] arr = new int[]{1,3,5,7,9,2,4,6,8,10};
    public static void main(String[] args) {
        arr = randomArray(10);
        System.out.println(Arrays.toString(arr));
        System.out.println("==========================");
        JavaQuickSort quickSort = new JavaQuickSort();
        quickSort.quickSort(0,arr.length-1);
    }

    private void quickSort(int lo,int hi) {
        if(lo>=hi)
            return;
        int mid = partition(lo,hi);
        System.out.println(mid);
        System.out.println(Arrays.toString(arr));
        quickSort(lo,mid-1);
        quickSort(mid+1,hi);
    }

    private int partition(int lo, int hi) {
        int flag = arr[lo];
        int x = lo+1;
        int y = hi;
        while(true){
            while(arr[y]>flag&&y>lo){
                y--;
            }
            while (arr[x]<flag&&x<=hi){
                x++;
            }
            if(x>=y){
                swap(lo,y);
                return y;
            }
            else
                swap(x,y);
        }
    }

    private void swap(int lo, int y) {
        int temp = arr[lo];
        arr[lo] = arr[y];
        arr[y] = temp;
    }

    private static int[] randomArray(int size){
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0;i<size;i++){
            arr[i] = random.nextInt(100);
        }
        return arr;
    }
}

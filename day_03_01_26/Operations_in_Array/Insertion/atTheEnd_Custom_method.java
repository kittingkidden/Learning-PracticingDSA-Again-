package day_03_01_26.Operations_in_Array.Insertion;

public class atTheEnd_Custom_method {
    public static void maain(String[] args){
        int n= 4;
        int[] arr = {10, 20, 30, 40, 0};
        int ele = 50;
        System.out.println("Array before insertion");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        arr[n] = ele;
        System.out.println("\nArray after insertion");
        for (int i = 0; i <= n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

package day_03_01_26.Operations_in_Array.Insertion;
import java.util.Arrays;

public class atBeginning_Custom_method {
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 0};
        int n = 4;
        int element = 50;
        System.out.println("Array before insertion");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        for (int i=n-1;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0] = element;
        System.out.println("\n Array after insertion");
        for (int i=0;i<=n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
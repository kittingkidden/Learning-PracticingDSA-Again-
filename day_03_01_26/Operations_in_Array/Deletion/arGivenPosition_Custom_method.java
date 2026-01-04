package day_03_01_26.Operations_in_Array.Deletion;

public class arGivenPosition_Custom_method {
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40};
        int n = arr.length;
        int pos = 2;
        System.out.println("Array before deletion");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        for (int i = pos; i < n; i++){
            arr[i - 1] = arr[i];
        }
        if (pos <= n){
            n--;
        }
        System.out.println("\nArray after deletion");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

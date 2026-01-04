package day_03_01_26.Operations_in_Array.Deletion;

public class atTheEnd_Custom_method {
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40};
        int n = arr.length;
        System.out.println("Array before dedlletion");
        for (int i = 0;i < n; i++)
            System.out.print(arr[i] + " ");
        n--;
        System.out.println("\nArray after deletion");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}

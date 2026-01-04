package day_03_01_26.Operations_in_Array.Deletion;

public class firstOccurrence_Custom_method {
    public static void main(String[] args){
        int[] arr = {10, 20, 20, 20, 30};
        int n = arr.length;
        int ele = 20;
        System.out.println("Array before deletion");
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        boolean found = false;
        for (int i = 0; i < n; i++){
            if(found){
                arr[i - 1] = arr[i];
            }
            else if (arr[i] == ele){
                found = true;
            }
        }
        if (found == true)
            n--;
        System.out.println("\nArray after deletion");
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}

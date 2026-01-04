package day_03_01_26.Operations_in_Array.Deletion;
import java.util.ArrayList;
import java.util.Arrays;

public class atTheEnd_Builtin_method {
    public static void main(String[] args){
        ArrayList<Integer> arr = new  ArrayList<>(Arrays.asList(10, 20, 30, 40));
        System.out.println("Array before deletion");
        for (int ele : arr)
            System.out.print(ele + " ");
        arr.remove(arr.size() - 1);
        System.out.println("\nArray after deletion");
        for(int ele : arr)
            System.out.print(ele + " ");
    }
}

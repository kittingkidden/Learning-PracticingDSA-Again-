package day_03_01_26.Operations_in_Array.Insertion;
import java.util.ArrayList;
import java.util.Arrays;

public class atGivenPosition_Builtin_method {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10, 20, 30,40));
        int ele = 50;
        int pos = 2;
        System.out.println("Array before insertion");
        for (int i = 0; i < arr.size(); i++)
            System.out.print(arr.get(i) + " ");
        arr.add(pos - 1, ele);
        System.out.println("\n Array after insertion");
        for (int i = 0; i < arr.size(); i++)
            System.out.print(arr.get(i) + " ");   
    }
}

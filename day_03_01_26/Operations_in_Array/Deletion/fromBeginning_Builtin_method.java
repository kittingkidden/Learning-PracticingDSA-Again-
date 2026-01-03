package day_03_01_26.Operations_in_Array.Deletion;
import java.util.ArrayList;
import java.util.Arrays;

public class fromBeginning_Builtin_method {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        System.out.println("Array before deletion");
        for (int i = 0; i < arr.size(); i++)
            System.out.print(arr.get(i) + " ");
        arr.remove(0);
        System.out.println("\nArray fter deletion");
        for (int i = 0; i < arr.size(); i++)
            System.out.print(arr.get(i) + " ");
    }
}

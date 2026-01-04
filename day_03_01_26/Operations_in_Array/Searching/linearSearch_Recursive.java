package day_03_01_26.Operations_in_Array.Searching;

public class linearSearch_Recursive {
    public static int search(int[] arr, int index, int x){
        if(index == arr.length)
            return -1;
        if (arr[index] == x)
            return index;
        return search(arr, index + 1, x);
    }
    public static void main(String[] args){
        int[] arr = {2, 3, 4, 10, 40};
        int x = 10;
        int result = search(arr, 0, x);
        if(result == -1)
            System.out.println("Element is not present in array");
        else 
            System.out.println("Element is present at index " + result);
    }
}

import java.util.*;

public class Array {
    public static void main(String[] args) {
        int arr2 [] = {2,6,8,3,5,4};
        System.out.println("Largest Element in the array" + sort(arr2));
        
        int arr1 [] = {2,6,8,3,10,4};
        System.out.println("Largest Element in the array" + sort(arr1));
    }

    static int sort(int arr[]){
        Array.sort(arr);
    
        return arr[arr.length-1];

    }


    }


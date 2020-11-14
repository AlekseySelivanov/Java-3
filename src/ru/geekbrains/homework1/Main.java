package ru.geekbrains.homework1;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {

    //Task 1:
        Integer arr[] = {1, 2, 3, 4, 5, 6, 7};
        swap(arr,1, 4);
    //Task 2:
        asList(arr);
    }
    public static void swap(Object[] arr, int n1, int n2){
        System.out.println("Task1: "+Arrays.toString(arr));
        Object sw = arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=sw;
        System.out.println("The result of the replacement: "+Arrays.toString(arr));
    }

    public static <T> void asList(T[]arr){
        ArrayList<T> alt = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Task2 and the result of the conversion : "+alt);
    }


}

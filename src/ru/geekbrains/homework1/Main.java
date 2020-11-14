package ru.geekbrains.homework1;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Integer arr[] = {1, 2, 3, 4, 5, 6, 7};
        swap(arr,1, 4);
    }
    public static void swap(Object[] arr, int n1, int n2){
        System.out.println("Task1: "+Arrays.toString(arr));
        Object sw = arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=sw;hj
        System.out.println("The result of the replacement: "+Arrays.toString(arr));
    }
}

/*
PEPCODING LEVEL-1 RECURSION IN ARRAYS 


MAX OF AN ARRAY 
*/
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=maxOfArray(a,0);
        System.out.println(max);
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int max=maxOfArray(arr,idx+1);
        if(max>arr[idx]){
            return max;
        }
        else{
            return arr[idx];
        }
    }

}
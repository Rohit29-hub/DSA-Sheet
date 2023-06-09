package Day_01_05_2023;

import java.util.ArrayList;

public class ReverseElementByKGroups {
    static void swapIng(ArrayList<Integer> arr, int s, int e){
        while(s<e){
            int t = arr.get(s);
            int t1 = arr.get(e);
            arr.set(s,t1);
            arr.set(e,t);
            s++;
            e--;
        }
    }
    static void swapEle(ArrayList<Integer> arr,int k){
        int n = arr.size();
        int newLength = arr.size();
        int newK;
        newK = k;
        int start = 0;
        int end = k-1;
        int step = 0;
        while(n >= k){
            swapIng(arr,start,end);
            start += k;
            end += k;
            n = n - k;
            step++;
        }

        if(newLength % newK != 0){
            swapIng(arr,step*newK,newLength-1);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr =  new ArrayList<>();
        arr.add(5);
        arr.add(6);
        arr.add(8);
        arr.add(9);
        int k = 3;
        swapEle(arr,k);


        for(Integer i : arr){
            System.out.print(i+" ");
        }

    }
}

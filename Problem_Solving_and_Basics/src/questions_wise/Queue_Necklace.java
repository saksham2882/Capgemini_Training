package questions_wise;

import java.util.ArrayDeque;
import java.util.Queue;

public class Queue_Necklace {
    public static Queue<Integer> rotate(int arr[], int k, int n){
        Queue<Integer> q = new ArrayDeque<>();

        for(int i = 0; i < n; i++){
            q.offer(arr[i]);
        }

        int i = 0;
        while(i < k){
            q.offer(q.poll());
            i++;
        }

        return q;
    }

    public static void main(String[] args) {

        int arr[] = {1, 5, 3, 4, 2};
        int k = 3;
        int n = arr.length;

        System.out.println(rotate(arr, k, n));
    }
}

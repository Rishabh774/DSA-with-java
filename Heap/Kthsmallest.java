package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Kthsmallest {
    public static void main(String[] args) {

    }
    public static int kthsmallest(int arr[], int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele :arr){
            pq.add(ele);
            if(pq.size()>k) {
                pq.remove();
            }
        }
        return pq.peek();
    }
}

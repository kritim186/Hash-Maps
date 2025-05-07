import java.util.*;
public class SlidingWindow {
    private static int[] max(int[] arr, int k){

        int n = arr.length;
        Deque<Integer> q = new LinkedList<>();
        int[] ans = new int[n-k+1];
        int idx = 0;

        for(int i = 0; i < n; i++){
            if(!q.isEmpty() && q.peekFirst() <= i-k){
                q.pollFirst();
            }

            while(!q.isEmpty() && arr[q.peekLast()] <= arr[i]){
                q.pollLast();
            }
            q.addLast(i);

            if(i >= k-1){
                ans[idx++] = arr[q.peekFirst()];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        // op = [5, 5, 5, 3]
        int[] a = max(arr, k);
        System.out.println(Arrays.toString(a));
       
    }
}

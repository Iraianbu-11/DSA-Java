
 // To Find Maximum Consecutive 1's in Array
public class MaxOne { 
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,0,1} , count = 0 , max = 0;
        for(int nums : arr){
            if(nums == 1) count++;
            else count = 0;
        max = Math.max(count, max);
        }
    System.out.println(max);
    }
}

/**
 * largest
 */
public class Largest {
    public static void main(String[] args) {
        int arr[] = {1,7,4,3,2220};
        int max = Integer.MIN_VALUE;
        for(int nums : arr){
            if(nums > max){
                max = nums;
            }
        }
    System.out.println("The Largest Element is " + max);
    }
}
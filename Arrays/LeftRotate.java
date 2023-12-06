import java.util.Arrays;

public class LeftRotate {
    public static void rotate(int[] arr, int st , int end){
        while(st<=end){
            int temp = arr[st];
            arr[st]  = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }

    public static void Helper(int[] arr , int k){
        int n = arr.length;
        k%=n;
        rotate(arr, 0, n-k-1);
        rotate(arr, n-k, n-1);
        rotate(arr,0,n-1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7} , k = 3;
        Helper(arr,k);
        System.out.println(Arrays.toString(arr));
    }
}

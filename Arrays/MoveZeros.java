import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int arr[] = {1,0,2,3,0,4,0,1};
        int j = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != 0){
                arr[j] = arr[i];
                j++;
            }
        }
    while(j < arr.length) {
        arr[j++] = 0;
    }
    System.out.println(Arrays.toString(arr));
    }
}

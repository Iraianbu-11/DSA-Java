import java.util.Arrays;

public class Duplicates {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3};
        int j = 0;
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }
    while(j < arr.length - 1) arr[++j] = 0;
     System.out.println(Arrays.toString(arr));
    }
}

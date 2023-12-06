import java.util.Arrays;

public class Union {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {2,3,4,4,5};

        int finalarr[] = new int[5];
        int i=0,j=0,k=0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                finalarr[k++] = arr1[i++];
            }
            else if(arr1[i] == arr2[j]){
                finalarr[k++] = arr2[i++];
            }
            else{
                finalarr[k++] = arr2[j++];
            }
        System.out.println(Arrays.toString(finalarr));
        }
    System.out.println(Arrays.toString(finalarr));
    }
}

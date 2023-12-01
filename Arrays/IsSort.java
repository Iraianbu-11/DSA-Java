public class IsSort {
    public static void main(String[] args) {
        int arr[] = {10,2,30,40,50} , n =arr.length;
        boolean flag = true;
        for(int i = 1 ; i < n ; i++){
            if(arr[i] < arr[i-1]){
                flag = false;
            }
        }
    System.out.println(flag == true ? "Sorted" : "Not Sorted");
    }
}

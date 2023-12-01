public class Second {
    public static int SecondSmall(int[] arr , int n){
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] < small){
                second_small = small;
                small = arr[i];
            }
            else if(arr[i] < second_small && arr[i]!=small){
                second_small = arr[i];
            }
        System.out.println(small + " " + second_small);
        }
        return second_small;
    }
    public static int SecondLarge(int[] arr , int n){
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
         for(int i = 0 ; i < n ; i++){
            if(arr[i] > large){
                second_large = large;
                large = arr[i];
            }
            else if(arr[i] > second_large && arr[i]!=large){
                second_large = arr[i];
            }
        System.out.println(large + " " + second_large);
        }

        return second_large;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 7 ,5};
	    int n = arr.length;
        System.out.println("Second Smallest: " + SecondSmall(arr, n));
        System.out.println("Second Largest: "  + SecondLarge(arr, n));
    }
}

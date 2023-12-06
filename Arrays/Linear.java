public class Linear {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50} , target = 30;
        for(int nums : arr){
            if(target == nums){
                System.out.println("Element Found");
                return;
            }
        }
    System.out.println("Element Not Found");
    }
}

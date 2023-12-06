import java.util.*;
public class TwoSum {
    public static void main(String[] args) {

// Approach 1
        int arr[] = {2,6,5,8,11} , target = 14 , res[] = new int[2];
        Map<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                res[0] = map.get(complement);
                res[1] = i;
            }
        map.put(arr[i] , i);
        }
System.out.println(map);
System.out.println(Arrays.toString(res));

// Approach 2
 Arrays.sort(arr);
 int i = 0 , j = arr.length -1;
 while(i < j){
    int sum = arr[i] + arr[j];
    if(target == sum) {
        System.out.println(i + " " + j);
        break;
    }
    else if(sum < target) i++;
    else j--;
 }
    }
}

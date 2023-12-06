import java.util.Scanner;
// Find the Number of consonant in window size of k
public class Consonants {
    public static boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch =='i' || ch =='o' || ch =='u';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.next().toLowerCase();
        System.out.print("Enter the K:");
        int k = sc.nextInt();
        sc.close();
        int count = 0;
        for(int i = 0 ; i < k ; i++){
            if(!isVowel(str.charAt(i)))  count++;
        }

        System.out.print(count + " ");
        
        for(int i = k ; i < str.length() ; i++){
            char prev = str.charAt(i-k);
            char curr = str.charAt(i);

            if(!isVowel(prev)) count--;
            if(!isVowel(curr)) count++;

            System.out.print(count + " ");
        }
    }
}

/* 
Approach : Dynamic Programming
Find the number of consonant in window size of k

 Input : str = "pineapple" k=3
 Output : 2 1 1 1 2 3 2

 Explanation :

pin - 2
ine - 1
nea - 1
eap - 1
app - 2
ppl - 3
ple - 2

*/
import java.util.Scanner;
public class EqualVC {
    public static boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch =='i' || ch =='o' || ch =='u';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.next().toLowerCase();
        System.out.print("Enter the k: ");
        int k = sc.nextInt();
        sc.close();
        int count = 0 , vowels = 0 , consonant = 0;
        for(int i = 0 ; i < k ; i++){
            if(isVowel(str.charAt(i)))  vowels++;
            if(!isVowel(str.charAt(i))) consonant++;
        } 
         if(vowels == consonant) count++;
       
        for(int i =k; i < str.length() ; i++ ){
            char prev = str.charAt(i-k);
            char curr = str.charAt(i);

            if(isVowel(prev)) vowels--;
            if(!isVowel(prev)) consonant--;

            if(isVowel(curr)) vowels++;
            if(!isVowel(curr)) consonant++;

            if(vowels == consonant) count++;

        }
    System.out.println(count);
    }
}


/* 
Approach : Dynamic Programming
Find the count when equal number of consonant and vowels in window size of k

 Input : havenhelljoysorrow  k = 4
 Output : 5

 Explanation : 
 have - 1
 aven - 1
 venh
 enhe - 1
 nhel
 hell
 ellj
 lljo
 ljoy
 joys
 oyso - 1
 ysor
 sorr
 orro - 1
 rrow

 Total 5

 */

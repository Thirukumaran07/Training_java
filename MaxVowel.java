import java.util.*;

public class MaxVowel {
    public static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }
    public static int maxVowels(String str, int k){
        int max = 0;
        int cvow = 0;
        for(int i = 0; i < str.length(); i++){
            if(isVowel(str.charAt(i)))
                cvow++;
            if(i >= k){
                if(isVowel(str.charAt(i - k)))
                    cvow--;
            }
            max = Math.max(max, cvow);
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();
        System.out.println(maxVowels(str, k));
    }
}
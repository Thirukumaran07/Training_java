import java.util.*;
public class GCD{
    public static int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    public static int DivArr(int nums[], int div[]){
        Arrays.sort(nums);
        int g = div[0];
        for(int i=0;i<div.length;i++){
            g = gcd(g,div[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(g%nums[i]==0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // int a = 15;
        // int b = 70;
        // int Gcd = gcd(a,b);
        // int Lcm = a*b/Gcd;
        // System.out.println(Gcd);
        // System.out.println(Lcm);
        int nums[] = {2,3,4};
        int div[] = {9,6,3,9,15,4,5};
        System.out.println(DivArr(nums,div));
    }
}
import java.util.*;
public class SecLargest{
    public static void secLarge(int a[]){
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        System.out.println(max+" is the maximum number.");
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                smax = max;
                max = a[i];
            }
            else if(a[i]>smax && a[i]!=max){
                smax = a[i];
            }
        }
        System.out.println(max+" is the maximum number.");
        System.out.println(smax+" is the second maximum number");
    }
    public static void main(String args[]){
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = x.nextInt();
        }
        secLarge(a);
    }
}
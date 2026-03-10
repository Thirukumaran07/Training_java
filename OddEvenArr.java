import java.util.*;
public class OddEvenArr{
    public static void oddEveAr(int a[]){
        int st = 0;
        int end = a.length-1;
        while(st<end){
            if(a[st]%2==0){
                st++;
            }
            else if(a[end]%2==1){
                end--;
            }
            if(a[st]%2==1 && a[end]%2==0){
                int temp = a[st];
                a[st] = a[end];
                a[end] = temp;
                st++;
                end--;
            }
        }
        System.out.println();
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = x.nextInt();
        }
        oddEveAr(a);
    }
}
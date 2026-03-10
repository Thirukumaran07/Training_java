import java.util.*;
public class CompatibleArr{
    public static void compArr(int a[], int b[]){
        for(int i=0;i<a.length;i++){
            if(!(a[i]>=b[i])){
                System.out.println("Not Compatible");
                return;
            }
        }
        System.out.println("Compatible");
    }
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int m = x.nextInt();
        if(n!=m){
            System.out.println("Not Compatible");
            return;
        }
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = x.nextInt();
        }
        int b[] = new int[m];
        for(int i=0;i<m;i++){
            b[i] = x.nextInt();
        }
        compArr(a,b);
    }
}
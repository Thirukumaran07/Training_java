import java.util.*;
public class Bus{
    public static void busCount(int a[], int k){
        int sum = 0;
        int bus = 1;
        for(int i=0;i<a.length;i++){
            if(sum+a[i]<=k){
                sum += a[i];
            }
            else{
                bus++;
                sum = a[i];
            }
        }
        System.out.println();
        System.out.println(bus);
    }
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int k = x.nextInt();
        int g[] = new int[n];
        for(int i=0;i<n;i++){
            g[i] = x.nextInt();
        }
        busCount(g, k);
    }
}
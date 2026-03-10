public class Kadanes{
    public static void maxProd(int a[]){
        int minprod = a[0];
        int maxprod = a[0];
        int ans = a[0];
        int c1,c2;
        for(int i=0;i<a.length;i++){
            c1 = minprod*a[i];
            c2 = maxprod*a[i];
            minprod = Math.min(a[i],Math.min(c1,c2));
            maxprod = Math.max(a[i],Math.max(c1,c2));
            ans =Math.max(ans,maxprod);
        }
        System.out.println(ans);
    }
    public static void main(String args[]){
        int n[]={2,3,1,4,5,-6};
        maxProd(n); 
    }
}
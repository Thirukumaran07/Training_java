public class SpecialNum{
    public static void Splnum(int n, int m){
        for(int i=n; i<=m; i++){
            int z=i;
            int sum = 0;
            int prod = 1;
            while(z>0){
                int digit = z%10;
                sum += digit;
                prod *= digit;
                z /= 10;
            }
            if(sum+prod==i){
                System.out.println(i+" is a Special Number");
            }
        }
    } 
    public static void main(String args[]){
        int st = 12;
        int end = 45;
        Splnum(st,end);
    }
}
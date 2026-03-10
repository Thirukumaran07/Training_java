public class StrongNum{
    public static int fact(int n){
        if(n<=1){
            return n;
        }
        return n*fact(n-1);
    }
    public static void strongNum(int n){
        int a=n;
        int sum = 0;
        while(a!=0){
            int temp = a%10;
            a=a/10;
            sum += fact(temp);
        }
        System.out.println(sum);
        System.out.println(sum == n ? "Strong number" : "Not Strong number");

    }
    public static void main(String args[]){
        int n = 145;
        strongNum(n);
    }
}
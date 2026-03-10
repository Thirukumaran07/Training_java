public class SumOfDig {
    //type 2
    static int sumDig(int n){
        int sum=0;
        while(n>0){
            int rem = n%10;
            sum = sum+rem;
            n = n/10;  
        }
        if(sum>=10){
            return sumDig(sum);
        }
        else{
            return sum;
        }
    }
    public static void main(String args[]){
        int n = 23432;
        //type 1
        while(n>=10){
            int s=0;
            while(n>0){
                s += n%10;
                n/=10;
            }
        n=s;
        }
        System.out.println(sumDig(n));
    }
}

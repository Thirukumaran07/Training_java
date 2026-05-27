public class FindWinner{
    public static int findWinner(int a, int k){
        if(a==1)
            return 1;
        return (findWinner(a-1,k)+k-1)%a+1;
    }
    public static void main(String[] args) {
        int n = 5;
        int k = 3;
        System.out.println(findWinner(n,k));
    }
}
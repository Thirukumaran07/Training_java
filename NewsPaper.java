public class NewsPaper {
    public static void main(String[] args) {
        int a = 9900;
        int b = 9905;
        // int c = 20;
        // System.out.println(a * (b - c) - 100);
        // int z = -1234;
        // int sum = z%10 + z/1000;
        // System.out.println(Math.abs(sum));
        // int n = 50;
        // int t = 7;
        // System.out.println("The number of teams is "+t+" and the number of friends remaining is "+(n%t));
        // int gold = 729;
        // int x = 65;
        // int y = 87;
        // int ben = gold*x/100;
        // gold -= ben;
        // int blackB = gold*y/100;
        // gold -= blackB;
        // int pirates = gold/3;
        // System.out.println(ben);
        // System.out.println(blackB);
        // System.out.println(pirates);
        // System.out.println((a>c) ? ((a>b) ? a : b) : ((c>b) ? c: b));
        // System.err.println(a>0 ? "Positive" : a<0 ? "Negative" :"Zero");
        // System.out.println((a&1) == 1 ? "Odd" : "Even");
        System.err.println("Before swapping: a = "+a+" and b = "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.err.println("After swapping: a = "+a+" and b = "+b);
        
    }
}
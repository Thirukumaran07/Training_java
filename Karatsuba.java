public class Karatsuba{
    public static int size(long x){
        int c = 0;
        while(x>0){
            c++;
            x/=10;
        }
        return c;
    }
    public static int karatsuba(int x,int y){
        if(x<10||y<10){
            return x*y;
        }
        int maxSize = Math.max(size(x),size(y));
        int halfSize = maxSize/2;
        int powerOf10 = (int)(long)Math.pow(10,halfSize);
        int a = (x/powerOf10);
        int b = (x%powerOf10);
        int c = (y/powerOf10);
        int d = (y%powerOf10);
        int ac = karatsuba(a,c);
        int bd = karatsuba(b,d);
        int abcd = karatsuba(a+b,c+d);
        int e = abcd - ac - bd;
        return ac*(int)Math.pow(10,2*halfSize) + e*powerOf10 + bd;
    }
    public static void main(String[] args) {
        int a = 12345;
        int b = 99876;
        System.out.println(karatsuba(a, b));
    }
}
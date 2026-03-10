public class Functions {
    static int sum(int a, int b){
        return a+b;
    }
    static void sub(int a, int b){
        System.out.println(a-b);
    }
    static int mul(){
        int a = 11;
        int b = 11;
        return a*b;
    }
    static void div(){
        int a = 11;
        int b = 11;
        System.out.println(a/b);
    }
    public static void main(String[] args){
        System.out.println(sum(2,11));
        sub(12,11);
        System.out.println(mul());
        div();
    }
}

public class QuadEqn{
    static void findRoots(int a, int b, int c){
        double d = b*b-4*a*c;
        if(d<0){
            System.out.println("No roots");
        }
        else if(d==0){
            System.out.println("One root: "+(-b/(2*a)));
        }
        else{
            System.out.println("Two roots: "+(-b+Math.sqrt(d))/(2*a)+" and "+(-b-Math.sqrt(d))/(2*a));
        }
    }
    public static void main(String[] args){
        int a = 1;
        int b = -3;
        int c = 2;
        findRoots(a, b, c);
    }
}
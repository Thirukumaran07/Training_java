
import java.util.InputMismatchException;

public class Arithmetic{
    public static void checkDiv(int n,int m){
        try{
            System.out.println("Result: "+n/m);
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException: "+e.getMessage());
        }
        catch(InputMismatchException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Operation Completed");
        }
    }
    public static void main(String args[]){
        int n = 120;
        int m = 0;
        checkDiv(n,m);
    }
}
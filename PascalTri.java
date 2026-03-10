import java.util.*;
public class PascalTri{
    public static void pascalTriangle(int n){
        for(int i=0;i<n;i++){
            int num = 1;
            for(int j=0;j<=i;j++){
                System.out.print(num+" ");
                num = num*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n = 5;
        pascalTriangle(n);
    }
}
import java.util.*;
public class PairContainer{
    public static void pair(int a[]){
        Arrays.sort(a);
        int i=0;
        int j=a.length-1;
        while(i<j){   
            System.out.println(a[i]+" "+a[j]);
            i++;
            j--;
        }
        if(i==j){
            System.out.println(a[i]+" "+0);
        }
    }
    public static void main(String args[]){
        int a[] = {12,23,43,56,76,87};        
        pair(a);
    }
} 
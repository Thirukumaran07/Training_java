import java.util.Scanner;
import java.util.Random;

public class Swap {
    public static void main(String args[]){
        Scanner x = new Scanner(System.in);
        int a = 12;
        int b = 11;
        System.out.println("Before swapping");
        System.out.println(a);
        System.out.println(b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swapping");
        System.out.println(a);
        System.out.println(b);
        System.out.println("\"Add char and integer\"");
        char z = 20;
        System.out.println(a+z);
        System.out.println(a+'A');
        System.out.println("\u001B[40mHello \u001B[39mWorld");
        /*30 black
        31 red
        32 green 
        33 yellow
        34 blue
        35 pink/purple 
        36 cayn
        37 white
        38 maroon 
        39 white*/
        System.out.println("Hello"+'a');
        String w[] = {"hhhhhh","iiiiiii","oooooooo","sssssss","ttttttttt"};
        Random r = new Random();
        System.out.println(w[r.nextInt(w.length)]);
        int n[] = {12,32,56,34,22};
        Random e = new Random();
        System.out.println(n[e.nextInt(n.length)]);
    }
}

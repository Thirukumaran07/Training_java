import java.util.Random;


public class RandomElement {
        public static void main(String[] args) {
                String w[] = {"hhhhhh","iiiiiii","oooooooo","sssssss","ttttttttt"};
                Random r = new Random();
                System.out.println(w[r.nextInt(w.length)]);
                int n[] = {12,32,56,34,22};
                Random e = new Random();
                System.out.println(n[e.nextInt(n.length)]);
        }
}

public class GuessNum{
    public static void guessNum(int n){
        do { 
            if(n==32){
                System.out.println("Congratulations !");
            }
            else{
                System.out.println("You entered the wrong Number"); 
                return;
            }
        } while (n!=32);
    }
    public static void main(String args[]){
        int n = 323;
        guessNum(n);
    }
}
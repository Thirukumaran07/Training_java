class ForwardThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Forward: " + i);
        }
    }
}
class ReverseThread extends Thread {
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println("Reverse: " + i);
        }
    }
}
public class Revv{
    public static void main(String[] args) {
        ForwardThread t1 = new ForwardThread();
        ReverseThread t2 = new ReverseThread();
        t1.start();
        t2.start();
    }
}

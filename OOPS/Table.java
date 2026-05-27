class Table5Thread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
    }
}
class Table7Thread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("7 x " + i + " = " + (7 * i));
        }
    }
}
public class Table {
    public static void main(String[] args) {
        Table5Thread t1 = new Table5Thread();
        Table7Thread t2 = new Table7Thread();
        t1.start();
        t2.start();
    }
}
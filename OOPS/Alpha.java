class AlphabetTask implements Runnable {
    char start, end;

    AlphabetTask(char s, char e) {
        start = s;
        end = e;
    }

    public void run() {
        for (char c = start; c <= end; c++) {
            System.out.println(Thread.currentThread().getName() + ": " + c);
        }
    }
}

public class Alpha {
    public static void main(String[] args) {

        AlphabetTask t1 = new AlphabetTask('A', 'M');
        AlphabetTask t2 = new AlphabetTask('N', 'Z');

        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);

        th1.start();
        th2.start();
    }
}
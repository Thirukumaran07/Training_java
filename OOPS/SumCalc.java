class SumTask implements Runnable {
    int start, end;
    SumTask(int s, int e) {
        start = s;
        end = e;
    }
    public void run() {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum = sum + i;
        }
        System.out.println("Sum = " + sum);
    }
}
public class SumCalc{
    public static void main(String[] args) {
        SumTask t1 = new SumTask(1, 50);
        SumTask t2 = new SumTask(51, 100);
        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        th1.start();
        th2.start();
    }
}

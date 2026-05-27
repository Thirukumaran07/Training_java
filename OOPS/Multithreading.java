class Counter{
    int count = 0;
    synchronized void increment(){
        count++;
    }
}
class MyThread extends Thread{
    Counter c;
    MyThread(Counter c){
        this.c = c;
    }
    public void run(){
        for(int i=0;i<1000;i++){
            c.increment();
        }
    }
}
public class Multithreading{
    public static void main(String[] args) {
        Counter c = new Counter();
        MyThread t1 = new MyThread(c);
        MyThread t2 = new MyThread(c);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(c.count);
    }
}
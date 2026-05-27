import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class Odd extends Thread{
    public void run(){
        for(int i=0;i<20;i++){
            if(i%2==1)
            System.out.println(i+" "+Thread.currentThread().getName()+" Priority: " + Thread.currentThread().getPriority());
        }
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
class Even extends Thread{
    public void run(){
        for(int i=0;i<20;i++){
            if(i%2==0)
            System.out.println(i+" "+Thread.currentThread().getName()+" Priority: " + Thread.currentThread().getPriority());
        }
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class OddEvenThread{
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(3);
        for(int i=0;i<3;i++){
            ex.execute(new Odd());
            ex.execute(new Even());
        }
    }
}
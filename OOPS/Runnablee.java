
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class whatsapp implements Runnable{
    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println("Whatsapp by "+Thread.currentThread().getName()+" Priority: " + Thread.currentThread().getPriority());
        try{
            Thread.sleep(4000);
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}}
class insta extends whatsapp implements Runnable{
    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println("Insta by "+Thread.currentThread().getName()+" Priority: " + Thread.currentThread().getPriority());
            try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }}
} 
class facebook extends whatsapp implements Runnable{
    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println("facebook by "+Thread.currentThread().getName()+" Priority: " + Thread.currentThread().getPriority());
            try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }}
} 

public class Runnablee{
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(3);
        for(int i=0;i<3;i++){
            ex.execute(new whatsapp());
            ex.execute(new insta());
            ex.execute(new facebook());
        }
    }
}
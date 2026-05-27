class A extends Thread{
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println("A");
        }
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println("B");
        }
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
class C extends Thread{
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println("C");
        }
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
public class ABCThread{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        try {
            a.start();
            a.join();
            b.start();
            b.join();
            c.start();
            c.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
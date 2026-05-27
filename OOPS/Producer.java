class Buffer{
    int data;
    boolean available = false;
    public synchronized void produce(int value){
        while(available){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        data = value;
        System.out.println("Producer:"+value);
        available = true;
        notifyAll();
    }
    public synchronized void consume(){
        while(!available){
            
        }
    }
}
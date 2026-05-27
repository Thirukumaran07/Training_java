class Bank{
    private int bal;
    public void dep(int amt){
        bal+=amt;
    }
    public int get(){
        return bal;
    }
}
public class Encap
{
	public static void main(String[] args) {
	    Bank b=new Bank();
	    b.dep(1000);
		System.out.println(b.get());
		b.dep(100);
		System.out.println(b.get());
	}
}
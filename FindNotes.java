public class FindNotes{
    public static void notes(int n){
        System.out.println(n/2000);
        n%=2000;
        System.out.println(n/500);
        n%=500;
        System.out.println(n/200);
        n%=200;
        System.out.println(n/100);
    }
    public static void main(String[] args){
        int n = 2800;
        notes(n);
    }
}
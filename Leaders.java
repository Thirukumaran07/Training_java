public class Leaders{
    public static void leader(int a[]){
        int max = a[a.length-1];
        System.out.print(max+" ");
        for(int i=a.length-2;i>=0;i--){
            max = a[i];
            System.out.print(max+" ");
        }
    }
    public static void main(String args[]){
        int a[] = {16,17,4,3,5,2};
        leader(a);
    }
}
public class BlockWeight{
    public static void weight(int a[]){
        int l = 0;
        int r = a.length-1;
        int ls = 0;
        int rs = 0;
        while(l<r){
            ls+=a[l++];
            rs+=a[r--];
        }
        if(ls==rs){
            System.out.println(l);
        }   
        else{
            System.out.println(-1);
        }
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,6,3,2};
        weight(a);
    }
}
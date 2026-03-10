public class MajorityEle{
    public static void majority(int a[]){
        int n = a.length;
        int count = 0;
        int candidate = 0;
        for(int i=0;i<n;i++){
            if(count==0){
                candidate = a[i];
            }
            if(a[i]==candidate){
                count++;
            }
            else{
                count=0;
            }

        }
            for(int num:a){
                if(num==candidate){
                    count++;
                }
            }
            if(count>n/2){
                System.out.println(candidate);
            }
            else{
                System.out.println(-1);
        }
    }
    public static void main(String args[]){
        int n[] = {23,12,23,4,54,6,56};
        majority(n);
    }
}
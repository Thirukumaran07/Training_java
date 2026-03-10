public class SortColors{
    //dutch national flag
    public static void sortCol(int arr[]){
        int low = 0;
        int high = arr.length-1;
        int mid = 0;
        while(mid<=high){
            if(arr[mid]==0){
                int temp1 = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp1;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp2 = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp2;
                high--;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        int a[] = {0,1,3,0,3,1};
        sortCol(a);
    }
}
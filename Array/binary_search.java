package Array;

public class binary_search {
    public static void main(String[] args) {
        int n[] = {2,4,6,8,10,12,14};
        int key = 14;
        int start = 0;
        int end = n.length-1;
       while(start<=end){
        int mid = (start+end)/2;
        if(n[mid]==key){
           System.out.println(mid);
        }
        if(n[mid]<key){
            start =  mid+1;
        }else{
            end = mid -1;
        }
       }
       

    }
}

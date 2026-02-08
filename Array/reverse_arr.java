package Array;

public class reverse_arr {
    public static void main(String[] args) {
        int n[] ={2,3,4,5,6,7,8,9,10};
        int st = 0;
        int end = n.length-1;
        while(st<end){
            int temp = n[end];
            n[end]=n[st];
            n[st]= temp;
            st++;
            end--;
        }
        for(int i =0; i<n.length; i++){
            System.out.print(n[i]+" ");
        }
    }
}

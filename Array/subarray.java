package Array;

public class subarray {
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        int ts = 0;
        int sum = 0;
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i<number.length; i++){
            int start = i; 
            for(int j = i; j<number.length; j++){
                int end = j;
                for(int k = start; k<=end;k++){
                    System.out.print(number[k]+" ");
                    sum+=number[k];
                }
                System.out.println("sum of "+sum);
                ts++;
                if(sum<minSum){
                    minSum = sum;
                }
                if(sum > maxSum){
                    maxSum=sum;
                }
                System.out.println();
            }
            System.out.println();
        }
       System.out.println("Total subarrays = " + ts);
        System.out.println("Minimum sum = " + minSum);
        System.out.println("Maximum sum = " + maxSum);
    }
}

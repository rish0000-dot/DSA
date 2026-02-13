package Array;

public class max_subarray {
    public static void main(String[] args) {
        int sub[] = {1,-2,6,-1,3};
        int currSum = 0; 
        int maxSum = Integer.MIN_VALUE;
        for(int i =0; i<sub.length; i++){
            int start = i;
            currSum = 0;
            for(int j = i; j<sub.length; j++){
                int end = j;
                for(int k = start; k<=end; k++){
                    currSum+=sub[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("total "+maxSum);
    }
}

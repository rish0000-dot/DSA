package Array;

public class largest {
    public static int largestNumber(int number[]){
        int num = Integer.MIN_VALUE;
        for(int i =0; i<number.length;i++){
            if(num<number[i]){
                num = number[i];
            }
        }
        return num;
    }
    public static void main(String[] args) {
        int number[] = {1,2,6,3,4,2};
        System.out.println(largestNumber(number));

    }
}

package Questions;

import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        for(int i = 2; i<=n-1; i++){   // for(inti =2; i<=Math.sqrt(n); i++) optimize 
            if(n%i==0){
                isPrime = false;
            }
        }
        if(isPrime == true){
            System.out.println("Prime");
        }else {
            System.out.println("Not Prime");
        }

    }
}

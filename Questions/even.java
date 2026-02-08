package Questions;

import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // if(n%2==0){
        //     System.out.println("Even");
        // }else{
        //     System.out.println("Odd");
        // }

        // help of ternary oprator
        String type = ((n%2)==0)?"even":"odd";
        System.out.println(type);
       
    }
}

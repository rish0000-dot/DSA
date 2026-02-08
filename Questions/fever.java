package Questions;
import java.util.*;
public class fever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        if(temp>100){
            System.out.println("Fever");
        }else{
            System.out.println("Not Fever");
        }
    }
}

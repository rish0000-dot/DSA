package Array;

public class kadanes_subarrayy {
    public static void main(String[] args) {
        
    
    int num[] = {-2,-3,-4,-1,-2,-1,-5,-3};
    int cs=0;
    int ms = Integer.MIN_VALUE;
    int max = Integer.MIN_VALUE;  // for all negative number 
    for(int i =0; i<num.length; i++){
        max = Math.max(max, num[i]); // for all negative no  compare 
        cs = cs+num[i];
        if(cs<0){
            cs =0;
            
        }
         ms = Math.max(cs, ms);

    }
    if(ms==0){   // ->
        ms =max;
    }
    System.out.println(ms);
}

}

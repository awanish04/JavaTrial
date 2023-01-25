package basicsofJava;
import java.lang.*;

public class swapping {
    public static void main(String[] args){
        int a=70;
        int b=87;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+" "+b);


    }
}

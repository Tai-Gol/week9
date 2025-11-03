package lambda;

import java.util.Scanner;

interface Square{
    boolean function(int n);
}
public class Task18 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();

        Square d=(x)->{
            for (int i = 0; i < x; i++) {
                if(i*i==x){
                    return true;
                } else if (i*i>x) {
                    return false;
                }
            }
            return false;
        };

        System.out.println(d.function(n));
    }
}

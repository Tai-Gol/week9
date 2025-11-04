package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Prime{
    boolean func(int x);
}
public class Task9 {
    public static void main(String[]args){


        Scanner input=new Scanner(System.in);
        System.out.print("number: ");
        int l= input.nextInt();



        Prime check=(x -> {
            boolean state = false;
            if (x==2){
                return true;
            }
            for (int i = 1; i < x; i++) {
                if (x%i==0){
                    state=false;
                    break;
                }else{
                    if(i==x-1){
                        state=true;
                    }
                }
            }

            return state;
        });

        System.out.println(check.func(l));
    }
}

package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//interface Prime{
//    boolean func(int x);
//}
public class Task21 {
    public static void main(String[]args){


        Scanner input=new Scanner(System.in);
        System.out.print("number: ");
        int l= input.nextInt();



        Prime check=(x -> {
            if (x==2){
                return true;
            }
            boolean state = false;
            for (int i = 2; i < x; i++) {
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

        int sum=0;

        for (int i=0; i<=l;i++){

            if (check.func(i)){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}

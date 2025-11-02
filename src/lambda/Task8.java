package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Fact{
    int func(int x);
}
public class Task8 {
    public static void main(String[]args){


        Scanner input=new Scanner(System.in);
        System.out.print("number: ");
        int l= input.nextInt();



        Fact factorial=(x -> {
            int sum=0;
            for (int i = 0; i <= x; i++) {
                if (i==0||i==1){
                    sum=1;
                }
                sum=sum*i;
            }
            return sum;
        });

        System.out.println(factorial.func(l));
    }
}

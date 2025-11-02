package lambda;

import java.util.ArrayList;
import java.util.Scanner;

@FunctionalInterface
interface Functional {
    int operation(int a, int b);
}
interface OneParam{
    void operation(String line);
}


public class Task1To3 {
    public static void main (String[] args){
        Scanner input=new Scanner(System.in);
        int a= input.nextInt();
        int b= input.nextInt();

        ArrayList<Integer> arr=new ArrayList<>();


        Functional add=(x,y) -> x+y;
        System.out.println("task 1 -> "+add.operation(a,b));

        System.out.print(" task 2-> ");
        String s = "";
        OneParam isEmpty=(x)-> System.out.println(x.isEmpty());
        isEmpty.operation(s);

        System.out.println("task 3-> ");
        String c = input.next();
        OneParam swichCase=(x)-> {if(x.toLowerCase()==x){
            System.out.println(x.toUpperCase());}else{
            System.out.println(x.toLowerCase());
        }
        };
        swichCase.operation(c);


    }
}

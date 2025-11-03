package lambda;

import java.util.ArrayList;
import java.util.Scanner;

interface Mult{
    void sortA(ArrayList<Integer> c);
}
public class Task12 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner input=new Scanner(System.in);
        System.out.print("length of the initial array: ");
        int l= input.nextInt();
        System.out.println("fill the array:");

        for (int i=0; i<l;i++){
            Integer t = input.nextInt();
            arr.add(t);
        }


        MaxMin calc=(x)->{
            int len=x.size();
            int sum=0;
            int mult=1;
            for (int n: x){
               sum+=n;
               mult*=n;
            }
            System.out.println("sum value: "+sum+"\nmult value: "+mult);
        };

        calc.sortA(arr);

    }
}

package lambda;

import java.util.ArrayList;
import java.util.Scanner;

interface MaxMin{
    void sortA(ArrayList<Integer> c);
}
public class Task11 {
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
           int max=x.getFirst();
           int min=x.getFirst();
           for (int i=0;i<len;i++){
               if (x.get(i)>max){
                   max=x.get(i);
               }
               if (x.get(i)<min){
                   min=x.get(i);
               }
           }
            System.out.println("max value: "+max+"\nmin value: "+min);
        };

        calc.sortA(arr);

    }
}

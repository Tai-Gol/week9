package lambda;

import java.util.ArrayList;
import java.util.Scanner;

public class Task19 {
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
            int indmin=0;
            int indmax=0;
            int min=x.getFirst();
            for (int i=0;i<len;i++){
                if (x.get(i)>max){
                    max=x.get(i);
                    indmax=i;
                }
                if (x.get(i)<min){
                    min=x.get(i);
                    indmin=i;
                }
            }
            x.remove(indmax);
            x.remove(indmin);
            int secondMax=x.getFirst();
            int secondMin=x.getFirst();
            for (int i=0;i<x.size();i++){
                if (x.get(i)>secondMax){
                    secondMax=x.get(i);
                }
                if (x.get(i)<secondMin){
                    secondMin=x.get(i);
                }
            }

            System.out.println("second max value: "+secondMax+"\nsecond min value: "+secondMin);
        };

        calc.sortA(arr);

    }
}

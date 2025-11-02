package lambda;

import java.util.ArrayList;
import java.util.Scanner;

interface Func{
    Double avrg(ArrayList<Double> x);
}

public class Task6 {
    public static void main(String[] args){
        ArrayList<Double> arr = new ArrayList<>();
        Scanner input=new Scanner(System.in);
        System.out.print("length of the initial array: ");
        int l= input.nextInt();
        System.out.println("fill the array:");

        for (int i=0; i<l;i++){
            Double t = input.nextDouble();
            arr.add(t);
        }

        Func avr=(x -> {
            double sum=0;
            for(double n:x){
                sum+=n;
            }
            return sum/x.size();
        });

        System.out.println(avr.avrg(arr));

    }
}

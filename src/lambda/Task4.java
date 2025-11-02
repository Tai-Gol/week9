package lambda;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {
    public static void main (String[] args){
        ArrayList<Integer> arr=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        System.out.print("length of the initial array: ");
        int l= input.nextInt();
        System.out.println("fill the array:");

        for (int i=0; i<l;i++){
            int t = input.nextInt();
            arr.add(t);
        }

        ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer> even=new ArrayList<>();

        arr.forEach((x)->{if(x%2==0){
        even.add(x);}else {
            odd.add(x);
        }
        });

        System.out.println("Odd numbers: "+odd);
        System.out.println("Even numbers: "+even);

    }

}

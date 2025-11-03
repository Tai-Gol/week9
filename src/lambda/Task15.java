package lambda;

import java.util.ArrayList;
import java.util.Scanner;

public class Task15 {
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
            int sumodd=0;
            int sumEven=0;
            int mult=1;
            for (int n: x){
                if (n%2==0){
                    sumEven+=n*n;
                }else{
                    sumodd+=n*n;
                }

            }
            System.out.println("sum of odd value: "+sumodd+"\nsum of even value: "+sumEven);
        };

        calc.sortA(arr);

    }
}

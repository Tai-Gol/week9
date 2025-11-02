package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface ArrOp{
    ArrayList<Integer> func(ArrayList<Integer> x);
}
public class Task7 {
    public static void main(String[]args){

        ArrayList<Integer> arr = new ArrayList<>();
        Scanner input=new Scanner(System.in);
        System.out.print("length of the initial array: ");
        int l= input.nextInt();
        System.out.println("fill the array:");

        for (int i=0; i<l;i++){
            Integer t = input.nextInt();
            arr.add(t);
        }

        ArrOp duplicate=(x -> {
            for (int i = 0; i < x.size(); i++) {
                List<Integer> sub=x.subList(i+1,x.size());
                if(sub.contains(x.get(i))){
                    x.remove(i);
                    i--;
                }
            }
            return x;
        });

        System.out.println(duplicate.func(arr));
    }
}

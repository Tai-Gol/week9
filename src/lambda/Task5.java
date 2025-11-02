package lambda;

import java.util.ArrayList;
import java.util.Scanner;

interface strOnePar{
    void sort(ArrayList<String> l);
        }

public class Task5 {
    public static void main(String[] args){
        ArrayList<String> arr=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        System.out.print("length of the initial array: ");
        int l= input.nextInt();
        System.out.println("fill the array:");

        for (int i=0; i<l;i++){
            String t = input.next();
            arr.add(t);
        }

        arr.sort(null);

        System.out.println(arr);
    }
}

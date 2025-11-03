package lambda;

import java.util.ArrayList;
import java.util.Scanner;
interface Whatever{
    void function(String key, ArrayList<String> arr);
}
public class Task16 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        Scanner input=new Scanner(System.in);
        System.out.print("length of the initial array: ");
        int l= input.nextInt();
        System.out.println("fill the array:");

        for (int i=0; i<l;i++){
            String t = input.next();
            arr.add(t);
        }
        System.out.println("type the key word:");
        String key = input.next();

        Whatever f =(x,lis)->{
            System.out.println(lis.contains(x));
        };

        f.function(key,arr);


    }
}

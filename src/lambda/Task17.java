package lambda;

import java.util.ArrayList;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        System.out.print("length of the initial array: ");
        int l= input.nextInt();
        System.out.println("fill the array:");

        for (int i=0; i<l;i++){
            String t = input.next();
            arr.add(t);
        }

        strOnePar aough=(x)->{
            int len=x.size();
            String min=x.get(0);
            String max=x.get(0);
            for(String w:x){
                if(w.length()>max.length()){
                    max=w;
                }
                if (w.length()<min.length()){
                    min=w;
                }
            }
            System.out.println("Longest word: "+max+"\nSmallest word: "+min);
        };
        
        aough.sort(arr);
    }
}

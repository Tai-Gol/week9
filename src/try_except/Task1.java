package try_except;

public class Task1 {
    public static void main(String[] args) {
            int a=0;
            int b=5;
            int answ=0;
            try {
               answ = b/a;
               System.out.println(answ);
            }catch (ArithmeticException e){
                System.out.println("You cannot devide by zero");
            }
        }
}

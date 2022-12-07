
import java.util.Scanner;


public class Fibonacciçeşitleri65_116 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in) ;
       int f2 ;
        System.out.println("Fibonacci sayısını giriniz : ");
        f2 = input.nextInt();
        double ao = ((1+Math.sqrt(5))/2) ;
        int f1 = (int)(f2/ao) ;
        int f3 = (int)(f2*ao) ;
        System.out.print(f1);
        System.out.print(",");
        System.out.print(f2);
        System.out.print(",");
        System.out.print(f3);

    }
    
}

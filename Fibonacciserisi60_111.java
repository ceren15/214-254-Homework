
import java.util.Scanner;
//Fibonacci dizisi

public class Fibonacciserisi60_111 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Terim sayısını giriniz : ");
        int n=oku.nextInt();
        int T1=1,T2=1,T3;
        System.out.println(T1);
        System.out.println(T2);
        for (int i =1 ; i <= n-2; i++) {
            T3=T1+T2;
            System.out.println(T3);
            T1=T2;
            T2=T3;
        }
    }
    
}

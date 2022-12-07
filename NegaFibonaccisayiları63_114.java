
import java.util.Scanner;


public class NegaFibonaccisayiları63_114 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("Terim sayısını giriniz : ");
        int n=oku.nextInt();
        double f3;
        double f1 =1;
        double f2 =-1;
        System.out.println(f1);
        System.out.println(f2);
        for (int i = 1; i <= n-2; i++) {
            f3 =f1-f2;
            System.out.println(f3);
            f1=f2;
            f2=f3;
        }
        
    }
    
}


import java.util.Scanner;


public class Tribonacciserisi64_115 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Terim sayısını giriniz : ");
        int n=oku.nextInt();
        int T1=1,T2 =1,T3 =2,T4;
        System.out.println(T1);
        System.out.println(T2);
        System.out.println(T3);
        for (int i = 1; i <= n-3; i++) {
            T4 =T1+T2+T3;
            System.out.println(T4);
            T1=T2;
            T2=T3;
            T3=T4;
        }
    }
    
}

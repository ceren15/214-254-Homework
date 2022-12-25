
import java.util.Scanner;
//Klavyeden girilen n. dereceden polinomun x=b için değerini hesaplama.

public class Dizipolinomhesaplama72_7_13 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Polinomun derecesini giriniz : ");
        int n=oku.nextInt();
        double a[]=new double[n+1];
        double b,t;
        for (int i = 0; i <a.length; i++) {
            System.out.print("x^^"+ i+" nin katsayısı : ");
            a[i]=oku.nextDouble();
        }
        System.out.println();
        System.out.print("Hesaplanacak x değeri : ");
        b=oku.nextDouble();
        t=a[0];
        for (int i = 1; i <=a.length-1; i++) {
            t+=a[i]*Math.pow(b, i);
           
        }
         System.out.print(t);
    }
    
}

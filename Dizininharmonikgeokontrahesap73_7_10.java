
import java.util.Scanner;
//SORR!!!!

public class Dizininharmonikgeokontrahesap73_7_10 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Dizinin uzunluğunu giriniz : ");
        int n=oku.nextInt();
        int a[]=new int[n];
        double T=0,C=1,HT=0,T2=0;
        for (int i = 0; i <a.length; i++) {
            System.out.print((i+1)+" ini elemanı : ");
            a[i]=oku.nextInt();
        }
        for (int i = 0; i <a.length; i++) {
            T+=a[i];
            C*=a[i];
            HT+=1/a[i];
            T2+=Math.pow(a[i], 2);
        }
        double AO=T/n;
        double GO=Math.pow(C, 1/n);
        double HO=n/HT;
        double KHO=T2/T;
        System.out.println("Dizinin aritmatik ortalaması : "+AO);
        System.out.println("Dizinin geometrik ortalaması : "+GO);
        System.out.println("Dizinin harmonik ortalaması : "+HO);
        System.out.println("Dizinin kontraharmonik ortalaması : "+KHO);
        
    }
    
}


import java.util.Scanner;

public class Lnxhesap20_71 {
    //Ln(x) hesaplama
    /*
    1.Başla
    2.Kullanıcıdan terim sayısını (x) al.
    3.T=0,i=0
    4.Eğer i>x-1 ise 8. adıma git.
    5.i++
    6.T+=1/(2*i+1)*(2*i+2)
    7.Git 4. adıma
    8.Yaz T
    9.Bitir.
    */

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("Terim sayısını giriniz : ");//n değeri
        int x=oku.nextInt();
        double T=0;
        for (double i=0; i<=x-1; i++) {
            T=T+1/((2*i+1)*(2*i+2));
        }
        System.out.println("L(" +x+")= " +T);  
    }
    
}

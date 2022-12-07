
import java.util.Scanner;
//Altın üçgen
/*
1.Başla
2.Kullanıcıdan kısa kenarı al.
3.b=a*(1+5^^1/2)/2
4.Yaz a ve b
5.Bitir.
*/

public class Altınüçgen33_84 {

    public static void main(String[] args) {
        Scanner oku=new Scanner (System.in);
        System.out.print("Kısa kenarı giriniz : ");
        double a=oku.nextDouble();
        
        double b=a*(1+(Math.pow(5, 0.5)))/2;
        System.out.println(a);
        System.out.println(b);
    }
    
}


import java.util.Scanner;
//Binom açılımı kullanarak e^^x değerini hesaplama
/*
1.Başla
2.Kullanıcıdan x değeri ve n değerlerini al.
3.sonuc=1+x/n^^n
4.Yaz sonuc+x
5.Bitir.
*/

public class Binomex24_75 {
    
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("exp(x)=lim(1+x/n)^^n");
        System.out.println("x değerini giriniz : ");
        double x=oku.nextDouble();
        System.out.println("n değerini giriniz: ");
        double n=oku.nextDouble();
        
        double sonuc=Math.pow((1+x/n), n);
        System.out.printf("e üzeri x : " +sonuc+x);
                
    }
    
}

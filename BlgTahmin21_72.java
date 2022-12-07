
import java.util.Scanner;

//Bilgisayardan belirlenen 1 ile 99 arasındaki bir sayıyı kullanıcının tahmin sonucu bulması
/*
1.Başla
2.BS,Tahmin,s=0
3.Bilgisayardan 1 ile 99 arasında sayı ürettirme
4.Kullanıcıdan Tahmin al
5.s++
6.Eğer Tahmin>BS ise
7.Yaz Daha küçük bir sayı giriniz.
8.Eğer Tahmin<BS ise 
9.Yaz Daha büyük bir sayı giriniz.
10.Yaz s
11.Bitir.
*/
public class BlgTahmin21_72 {

    public static void main(String[] args) {
        int BS,Tahmin,s=0;
        Scanner oku=new Scanner(System.in);
        BS=(int) (Math.random()*98)+1;//(Math.random()*max-min)+1 rastgele sayı belirleme
        do {            
            System.out.print("Tahmininiz: ");
            Tahmin=oku.nextInt();
            s++;//Tahmin sayısını belirleme
            if (Tahmin>BS) {
                System.out.println("Daha küçük bir sayı giriniz.");
            }
            if (Tahmin<BS) {
                System.out.println("Daha büyük bir sayı giriniz.");
           
            }
        } while (Tahmin!=BS);
        System.out.println(s+ " Tahminde bulundunuz: ");

    }
    
}


import java.util.Scanner;


public class Teksayilarıntoplamı4 {
    /*
    1.Başla
    2.Kullanıcıdan sayı al.
    3.toplam=0 , S=1
    4.Eğer S>N ise adım 7.adıma git.
    5.Eğer girilen sayı 2 ile bölünemiyorsa yaz toplam=toplam+S 
    6.s=s+2
    7.yaz toplam
    8.Dur.
    */

    public static void main(String[] args) {
      Scanner oku= new Scanner(System.in);
      System.out.println("Bir sayı giriniz.");
        int N=oku.nextInt();
        int toplam=0;
        int S=1;
        
         while (S<=N){
            if(N%2!=0){
            toplam=toplam+ S;
            }
            S=S+2;
        }
        System.out.println("Toplam:" +toplam);
        
        
        
        
        
        
        
        
        
        
    }
    
}


import java.util.Scanner;


public class Böle3ve4ebilen5 {
    /*
    1.Başla.
    2.Kullanıcıdan iki sayı al.
    3.Eğer sayı1>=sayi2 ise git 4. adıma.
    4.Eğer sayilar 3 ile 4 e bölünüyorsa yaz 3 ile 4 e bölünen sayılar.
    5.Bitir.
    */

    public static void main(String[] args) {
    Scanner oku=new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz.");
        int sayi1=oku.nextInt();
        System.out.println("İkinci sayıyı giriniz.");
        int sayi2=oku.nextInt();
        
        for(int S=sayi1; S<sayi2; S++){
        if(S%3==0 || S%4==0){
          System.out.println(S+ " 3 ile 4 e bölüne bilen sayılar.");
            
        }
    }        
 }
    
}

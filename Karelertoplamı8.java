
import java.util.Scanner;
//(1^^2)+(2^^2)+(3^^2)+(4^^2)+(5^^2)+.....
public class Karelertoplamı8 {
    /*
    1.Başla.
    2.kareyi tanımla
    3.i=1
    4.Eğer sayı>i ise 7. adıma git.
    5.i=i+1
    6.toplam=toplam+i*i
    7.Yaz sayının karesi
    8.Bitir.
    */


    public static void main(String[] args) {
       Scanner oku = new Scanner(System.in);
        int kare;
        
        System.out.print("Bir sayi giriniz: ");
        int sayi = oku.nextInt();
        int toplam=0;
        for(int i = 1; i <= sayi; i++)
        {
            toplam+=i*i;
            
             System.out.println(" sayısının karesi = " + toplam);
        }
    
    }
}


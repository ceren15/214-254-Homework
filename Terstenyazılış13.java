
import java.util.Scanner;
/*
GİRİLEN SAYININ TERSTEN YAZILIŞI
1.Başla.
2.Kullanıcıdan bir sayi al.
3.Eğer sayi>0 ise yaz sayi%10
4.sayi/=10
5.3.Adıma git.
6.Yaz girdiğiniz sayının tersten yazılışı.
7.Bitir.
*/

public class Terstenyazılış13 {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        
        System.out.print("Girdiğiniz sayinin tersten yazılısı = ");
        while(sayi > 0) {
            
            System.out.print(sayi % 10);
           sayi/=10;
        }
   
    }
    
}

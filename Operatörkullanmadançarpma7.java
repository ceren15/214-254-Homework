
import java.util.Scanner;


public class Operatörkullanmadançarpma7 {
    /*
    1.Başla.
    2.Kullanıcıdan iki sayı al.
    3.toplam=0
    4.i=0
    5.Eğer sayi2<=i ise 7. adıma git.
    6.toplam=toplam+sayi1
    7.yaz sayi 1 +sayi2 =
    8.Bitir.
    */
        
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        int toplam = 0;
        
        System.out.print("Bir sayi giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("Bir sayi giriniz:");
        int sayi2 = scan.nextInt();
        
        for(int i = 0; i < sayi2; i++)
        {
            toplam += sayi1;
        }
        System.out.println(sayi1 + "X" + sayi2 + "= " + toplam);
        
        
        
        
        
        
        
        
    }
    
}

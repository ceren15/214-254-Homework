
import java.util.Scanner;
/*
1.Başlan
2.Kullanıcıdan üst sınır (n) al
3.sayi=1
4.sayi<=n iken toplam=0
5.i=1
6.Eğer i>=sayi ise git
7.Eğer sayi%i==0 ise toplam+=i
8.Git 6.adıma
9.Eğer toplam==sayi ise yaz sayi
10.s++
11.Git 4.adıma
12.Bitir.
*/

public class Mükemmelsayilistesi41_92 {
//Mükemmel sayı listesi
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("Üst sınır giriniz: ");
        int n=oku.nextInt();
        int sayi=1;
        while (sayi<=n){
        
        int toplam = 0;
        for (int i = 1 ; i < sayi ; i++) {
	if(sayi %i == 0)  
		toplam += i;
        }
        if (toplam == sayi) 
	System.out.println(sayi + " mükemmel bir sayidir");
	 sayi++;
        }
    }
    
}

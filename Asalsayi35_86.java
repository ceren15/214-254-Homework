
import java.util.Scanner;

public class Asalsayi35_86 {
//Asal sayılar
    /*
    1.Başla
    2.Kullanıcıdan üst sınır (sayi) al
    3.i=2
    4.Eğer i>sayi ise git 9. adıma
    5.kontrol=0,j=2
    6.Eğer j>=i ise git 9. adıma
    7.Eğer i%j==0 ise yaz kontrol=1,break
    8.Git 6.adıma
    9.Eğer kontrol==0 ise yaz i
    10.Bitir.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
       
        for(int i=2;i<=sayi;i++)
        {
            int kontrol = 0;
            for (int j = 2; j < i; j++)
            {
               if (i % j == 0)
                {
                    kontrol = 1;
                    break;
                } 
            }
                
            if(kontrol==0)
            {
                System.out.print(i+" ");
               
            }
        }
    }
}

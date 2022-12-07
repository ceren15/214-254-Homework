
import java.util.Scanner;
/*
1.Başla
2.Kullanıcıdan sayı al
3.t=0,i=1
4.Eğer i>=s-1 ise git 9.adıma git
5.i++,t+=i
6.Git 4. adıma
7.Eğer s==t ise yaz Mükemmel sayıdır.
8.Değilse Yaz Mükemmel sayı değildir.
9.Bitir.
*/

public class Mükemmelsayi40_91 {
    
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int s=oku.nextInt();
        int t=0;
        for (int i =1; i < s-1; i++) {
            if (s%i==0) {
                t+=i;
            }
        }
        if (s==t) {
            System.out.println("Mükemmel sayıdır.");
        }else{
            System.out.println("Mükemmel sayı değildir.");
        }
    }
    
}

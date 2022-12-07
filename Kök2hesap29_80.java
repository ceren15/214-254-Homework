
import java.util.Scanner;

//Karakök(2) ifadesini sonsuz bir işleme geçirme.
/*
1.Başla
2.Kullanıcıdan bölüm sayısını al
3.t=1,i=1
4.Eğer i>=n ise 8.adıma git
5.i++
6.t=2+1/t
7.Git 4.adıma
8.Yaz 1+1/t
9.Bitir.
*/
public class Kök2hesap29_80 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Bölüm sayınısını giriniz : ");
        int n=oku.nextInt();
        double t=1;
        for (int i = 1; i < n;i++) {
            t=2+1/t;
        }
          System.out.println(+ 1+1/t);
 
    }
    
}

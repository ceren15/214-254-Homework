
import java.util.Scanner;
//Kök(3) ifadesini sonsuz işleme dökme.
/*
1.Başla
2.Kullanıcıdan bölüm sayısını al
3.t=1,i=1
4.Eğer i>=n-1 ise 8.adıma git
5.i++
6.t=1+1/(2+1/t)
7.Git 4.adıma
8.Yaz 1+1/t
9.Bitir.
*/

public class Kök3hesap30_81 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("Bölüm sayısı : ");
        int n=oku.nextInt();
        double t=1;
        
        for (int i = 1; i < n-1; i++) {
            t=1+1/(2+1/t);
        }
        System.out.println(1+1/t);
    }
    
}

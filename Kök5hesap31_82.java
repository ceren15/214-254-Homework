
import java.util.Scanner;

//Kök(5) ifadesini sonsuz işleme dökme.
/*
1.Başla
2.Kullanıcıdan bölüm sayısını al.
3.t=1,i=1
4.Eğer i>=n ise
5.i++
6.t=4+1/t
7.Git 4.adıma git
8.Yaz 2+1/t
9.Bitir.
*/
public class Kök5hesap31_82 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("Bölüm sayısı : ");
        int n=oku.nextInt();
        double t=1;
        for (int i = 1; i < n; i++) {
            t=4+1/t;
        }
        System.out.println(2+1/t);
    }
    
}

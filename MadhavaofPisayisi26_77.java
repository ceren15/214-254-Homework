
import java.util.Scanner;
//Madhava of Scangamagrama seri toplamıyla Pi sayısını bulma
/*
1.Başla
2.Kullanıcıdan terim sayısını (n) al
3.t=0,k=0
4.Eğer k>n ise 8. adıma git
5.k++
6.t+=-1^^k/((2*k+1)*(3^^k))
7.Git 4. adıma
8.Yaz Kök12*t
9.Bitir.
*/
public class MadhavaofPisayisi26_77 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("Terim sayısını giriniz : ");
        double n=oku.nextDouble();
        double t=0;
        for (int k=0;k<=n-1;k++) {
            t+=Math.pow(-1, k)/((2*k+1)*(Math.pow(3, k)));
        }System.out.println(Math.sqrt(12)*t);
    }
    
}

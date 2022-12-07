
import java.util.Scanner;
// 2 ve 3 verildiğinde 8 , 17 çıkıyor.
//Leyland sayılar
/*
1.Başla
2.Kullanıcıdan ilk saysıyı (x) al
3.Kullanıcıdan ikinci sayıyı (y) al.
4.i=2
5.Eğer i>x ise git 9. adıma
6.i++
7.j=2
8.Eğer j<=y ise j++
9.Yaz i^^j+j^^i
10.Git 8. adıma
11.Git 5. adıma
12.Bitir.
*/
public class Leylandsayilar44_95 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz : ");
        int x =oku.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        int y=oku.nextInt();
        for (int i = 2; i <= x; i++) {
            for (int j = 2; j <= y; j++) {
                System.out.println(Math.pow(i, j)+Math.pow(j, i));
            }
        }
    }
    
}

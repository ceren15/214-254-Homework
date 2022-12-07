
import java.util.Scanner;
//Fermat Sayılarr.
/*
1.Başla
2.Kullanıcıdan terim sayısını (n) al
3.i=0
4.Eğer i>n-1 ise git 8. adıma 
5.i++
6.Yaz 2^^((2^^i)+1)
7.Git 4. adıma
8.Bitir.
*/
public class Fermatsayilar43_94 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Terim sayısı : ");
        int n=oku.nextInt();
        for (int i = 0; i <= n-1; i++) {
            System.out.println(Math.pow(2, (Math.pow(2, i)))+1);
        }
    }
    
}

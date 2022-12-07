
import java.util.Scanner;
//Cullen Sayılarr.
/*
1.Başla
2.Kullanıcıdan terim sayısını (n) al
3.i=1
4.i>n ise git 8. adıma
5.i++ 
6.yaz i*2^^i+1
7.Git 4. adıma
8.Bitir.
*/
public class Cullensayilar42_93 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Terim sayısı : ");
        int n=oku.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i*Math.pow(2, i)+1);
        }
    }
    
}

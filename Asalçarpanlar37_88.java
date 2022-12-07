
import java.util.Scanner;
//Klavyeden girilen sayının asal çarpanları
/*
1.Başla
2.Kullanıcıdan pozitif bir sayı al
3.a,b=2
4.a>1 iken Eğer a%b==0 ise yaz b
5.a/=b
6.Değilse b+=1
7.Git 4. adım
8.Bitir.
*/

public class Asalçarpanlar37_88 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Pozitif bir sayı : ");
        int a,b=2;
        a=oku.nextInt();
        while (a>1) {            
            if (a%b==0) {
                System.out.println(b);
                a=a/b;
            }else{
                b=b+1;
            }
        }
    }
    
}

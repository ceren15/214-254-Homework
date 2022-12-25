
import java.util.Scanner;
/*
KOMBİNASYON
1.Başla
2.Kullanıcıdan n ve r olan iki sayı al.
3.f1=1,f2=1,f3=1
4.i=1
5.Eğer i>n ise git 8. adıma.
6.i=i+1
7.f1*=i
8.Eğer i<=r ise f2*=i
9.Eğer i<=n-r ise f3*=i
10.Yaz sonuç
11.Bitir.
*/

public class Kombinasyon11 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("n= ");
        int n=oku.nextInt();
        System.out.println("r= ");
        int r=oku.nextInt();
        int f1=1;
        int f2=1;
        int f3=1;
        
        for(int i=1; i<=n; i++){
            f1*=i;
            if(i<=r){
                f2*=i;
            }
            if(i<=n-r){
                f3*=i;
            }
            
            
            }
        System.out.println("Sonuc=" +f1/(f2*f3));
              
    }
    
}

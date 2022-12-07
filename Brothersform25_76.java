
import java.util.Scanner;
//Formülle e değeri hesaplama
/*
1.Başla
2.Kullanıcıdan terim sayısını (N) al.
3.T=0,k=0,fkt=1
4.Eğer k>N ise 11. adıma git 
5.k++
6.temp=2*k+1,i=1
7.Eğer i>temp ise 10.adıma git
8.i++
9.fkt*=i
10.Git 4. adıma
11.Yaz T
12.Bitir
*/
public class Brothersform25_76 {

    public static void main(String[] args) {
      Scanner oku=new Scanner(System.in);
        System.out.println("Terim sayısını giriniz : ");
        double N=oku.nextDouble();
        double T=0;
        for (int k = 0; k <= N; k++) {
            int temp=2*k+1;
            double fkt=1;
            for (int i =1; i <= temp; i++) {
                fkt*=i;
            }
              T+=(double)(temp+1)/fkt;
        }
        System.out.println("e= " +T);
    }
}

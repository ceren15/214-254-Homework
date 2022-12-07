
import java.util.Scanner;

//Sin(X) Fonlsiyonu
/*
1.Başla
2.Kullanıcıdan açi (derece),(X) değereini ve Terim sayısını (N) al.
3.T=0,F=1,İ=1,j=1
4.Eğer i>N ise 10. adıma git. 
5.i++
6.Eğer j>2*i-1 ise 9.adıma git.
7.F*=j
8.T+=(-1^^i-1)*(x^^2*i-1)/F
9.Git adım 4'e
10.Yaz T
11.Bitir.
*/
public class Sinxfonk19_70 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("Açıyı (derece) giriniz: ");
        double X=oku.nextInt();
        System.out.println("Terim sayısını giriniz: ");
        int N =oku.nextInt();
        double T=0,F=1;
        X=Math.toRadians(X);
        
        for(int i=1;i<=N;i++){
            for(int j=1;j<=2*i-1;j++){
                F*=j;
            }
            T+=(((Math.pow(-1, i-1)))*((Math.pow(X, 2*i-1))))/F;
        }
        System.out.println("Seri açılımı ile hesaplanan değer : " +T);
        System.out.println("Komutla hesaplanan değer : "+Math.sin(X));
    }
    
}

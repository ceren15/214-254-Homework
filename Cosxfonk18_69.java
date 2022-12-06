
import java.util.Scanner;
public class Cosxfonk18_69 {
//Cos(X) Fonksiyonu
    /*
    1.Başla
    2.Kullanıcıdan açı değerini (derece),(x) ve Terim sayısını al.
    3.T=1,F=1,I=1,J=1
    4.Eğer I<=N ise 6. adıma git.
    5.I++
    6.Eğer J<=2*I ise
    7.j++,F=F*J
    8.T=T+(-1^^I)*(X^^2*I)/F
    9.Git adım 4'e.
    10.yaz T
    11.Bitir.
    */
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("Açı değerini (derece) giriniz : ");
        double X=oku.nextInt();
        System.out.println("Terim sayısını giriniz : ");
        int N =oku.nextInt();
        double T=1,F=1;
        X=Math.toRadians(X);//Math ifadesi ile Derece cinsinden ölçülen değeri radyana çevirme.
        
        for (int I=1;I<=N-1;I++) { //I değerini 1 den N-1 e kadar birer birer arttırırız.
            for (int J=1;J<=2*I;J++) {//J değerini 1 den J-1 e kadar birer birer arttırırız.
              F=F*J; // 2*I değerinin faktöriyelini aldık.
            }
            T=T+((Math.pow(-1, I))*(Math.pow(X, 2*I)))/F;//seri açılımı ile hesaplama
        }
        
        System.out.println("Seri açılımı ile hesaplanan değer : " +T);
        System.out.println("Komutla hesaplanan değer : " +Math.cos(X));
    }
    
}

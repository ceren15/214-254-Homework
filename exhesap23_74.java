
import java.util.Scanner;

//Seri açarak e^^x hesaplama
/*
1.Başla
2.Kullanıcıdan terim sayısı (N) ve Hesaplanacak (x) değerlerini al.
3.t=1,f=1,i=1
4.Eğer i>=N ise 9. adıma git.
5.i++
6.f*=i
7.t+=Math.pow(x,i)/f
8.Git 4. adıma
9.Yaz t
10.Bitir.
*/
public class exhesap23_74 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("Terim sayısını giriniz : ");
        int N=oku.nextInt();
        System.out.println("Hesaplanacak x değerini giriniz : ");
        double x=oku.nextDouble();
        double t=1,f=1;
        
        for (int i=1;i<N;i++){
            f*=i;
            t+=Math.pow(x, i)/f;
        }
        System.out.println("Seri açılımı ile e üzeri x değeri : " +t);
        System.out.println("Komutla e üzeri x değeri : " +Math.exp(x));

    }
    
}

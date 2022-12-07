
import java.util.Scanner;

//1,6,38,140 gibi tam bölenlerinin harmonik ortalaması tamsayı pozitif tamsayılara Orea sayısı denir
public class Oresayisi52_103 {

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int n ;
        double s = 0 , t = 0 ;  //tam bölenlerinin sayısını bulmak için s, paydadaki işlem için t
        System.out.println("Bir tam sayı girin");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n%i==0)  {  //bu döngüde tam bölenler bulunur
                s++ ; //tam bölenler sayılır
                t = t + (double)1/i ;  //payda kısmı işlemler birbiri üzerine eklenerek devam eder böylece t ile son sonuç yani paydadaki toplam bulunur
            }
        }
         double ho = s/t ;  //harmonik ortalama için yapılması gereken işlem 
               if (ho - (int)ho == 0 ) {  //harmonik ortalamanın tam sayı olup olmadığı kontrol edilir
                    System.out.println( n+ " Ore sayısıdır");
                }
                  else {
                       System.out.println(n+ " Ore sayısı değil");
    }
  }
}
       
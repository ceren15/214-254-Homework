
import java.util.Scanner;
public class Chenasali38_89 {

    public static void main(String[] args) { 
        Scanner input = new Scanner (System.in);
           int s = 0 ;
        System.out.println("Bir n sayısı giriniz");
           int n = input.nextInt();
           int x = n+2 ;  //Chen asalı olması için sayının iki fazlasının da asal olması gerekir. Burada sayının iki fazlasını bir değişkene atadık
        for (int i = 2 ; i<n ; i++){ //for döngüsü ile asallığını döngü içinde kontrol ederiz 
           if (x % i == 0){  //asallık kuralı sağlanıyor mu koşulu sağlanır
              s++ ; 
            }
        }
        if (s==0){
            System.out.println("Girdiğiniz sayı Chen asalıdır.");
        }else {
            System.out.println("Girdiğiniz sayı Chen asalı değildir.");
        }
    }
}

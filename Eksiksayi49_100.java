
import java.util.Scanner;
//Klavyeden 15 sayısı girildiğinde eksiklik miktarı 6 olur.

public class Eksiksayi49_100 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("Pozitif bir sayı giriniz :");
        int s=oku.nextInt();
        int t=0;
        for (int i = 1; i <= s; i++) {
            if (s%i==0) {
                t+=i;
            }
        }
        if (t<2*s) {
            System.out.println("Eksik sayıdır ve eksiklil miktarı = ");
            System.out.println(2*s-t);
        }else{
            System.out.println("Eksik sayı değildir.");
        }
    }
    
}

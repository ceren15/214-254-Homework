
import java.util.Scanner;
//220 ve 284 dost sayılardır.

public class Dostsayilar46_97 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("Pozitif bir sayı giriniz : ");
        int a =oku.nextInt();
        System.out.println("Pozitif bir sayı giriniz : ");
        int b=oku.nextInt();
        double ta=0,tb=0;
        
        for (int i = 1; i < a-1; i++) {
            if (a%i==0) {
                ta+=i;
            }
        }
        for (int i = 1; i < b-1; i++) {
            if (b%i==0) {
                tb+=i;
            }
        }
        if (ta==b && tb==a) {
            System.out.println("Dost sayılardır.");
        }else{
            System.out.println("Dost sayılar değildir. ");
        }
    }
    
}

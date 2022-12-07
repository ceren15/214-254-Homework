
import java.util.Random;
import java.util.Scanner;
//Bilgisayarın ürettiği rastgele büyük harfin, en fazla 10 denemede tahmin edilme oyunu programı.

public class Harftahmin22_73 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);
        char z ;
        int x = rnd.nextInt(25) + 65;
        for(int i = 1 ; i <=10  ; i++)
            {
                z = input.next().charAt(0);
                if(z == ((char)x))
            {
                System.out.println("Harika "+i+". adimda bildiniz");
               System.exit(0);
            }
        }
        System.out.println("Üzgünüm bilemediniz...");

    }
}

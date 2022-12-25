
import java.util.Random;
import java.util.Scanner;


public class Klavydenrastgeleharf75_7_28 {

    public static void main(String[] args) {
        //YENİDEN BAKK OLMADII
        //Klavyeden küçük harflerle girilen bir cümlenin harflerini rastgele büyüklükte yeniden yazdıran program.

        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen cümle giriniz : ");
        String txt=input.nextLine();
        for (int i = 0; i <txt.length(); i++) {
            System.out.println(Character.toUpperCase(txt.charAt(i)));
            Random rastgele = new Random();
            int sayi=rastgele.nextInt(10);
            if (sayi%2==0) {
                System.out.println(Character.toLowerCase(i+1));
            }else{
                System.out.println(Character.toUpperCase(i+1));
            }
 
        }
        
    }
    
}

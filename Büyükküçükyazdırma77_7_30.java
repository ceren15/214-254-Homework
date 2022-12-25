
import java.util.Scanner;


public class Büyükküçükyazdırma77_7_30 {

    public static void main(String[] args) {
        
        //Klavyeden küçük harflerle girilen bir kelimenin harflerini iki büyük harf iki küçük harf şeklinde yazdıran program.
        
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen bir kelime giriniz : ");
        String txt=input.nextLine();
        int sayac=0;
        for (int i = 0; i <txt.length(); i++) {
            int r=sayac%4;
            if (r<2){
                System.out.println(Character.toUpperCase(txt.charAt(i)));
            }else{
                System.out.println(txt.charAt(i));
            }
            sayac++;
        }
    }
    
}

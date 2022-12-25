
import java.util.Scanner;


public class İkisayininkareleritop16 {
//Girilen pozitif bir sayının , iki sayının kareleri toplamı şeklinde yazılımı.
    public static void main(String[] args) {
      Scanner oku=new Scanner(System.in);
        System.out.println("Pozitif bir sayı giriniz.");
        int sayi=oku.nextInt();
        for(int a=0;a<=sayi;a++){
            for(int b=0;b<=sayi;b++){
                if(a*a+b*b==sayi){
                    System.out.println(a+"-"+b);
                }
               
            }
        }
    }
    
}

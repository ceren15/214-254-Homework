
import java.util.Scanner;
/*
FONKSİYON 
*/

public class Fonksiyon12 {

    public static void main(String[] args) {
        /*
        1.Başla.
        2.X değerini gir.
        3.fx=X*X-5*X+3
        4.Eğer fx<0 ise yaz -1
        5.Eğer fx=0 ise yaz 0
        6.Eğer fx>0 ise yaz 1
        7.dur.
        */
        Scanner oku=new Scanner(System.in);
        System.out.println("Bir x değer giriniz.");
        int x=oku.nextInt();
        double fx=x*x-5*x+3;
        if(fx<0){
            System.out.println("fx= -1");
        }
        if(fx==0){
            System.out.println("fx= 0");
        }
        if(fx>0){
            System.out.println("fx= 1");
        }











    }
    
}

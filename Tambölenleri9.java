
import java.util.Scanner;

public class Tambölenleri9 {
    /*
    1.Başla.
    2.Kullanıcıdan pozitif bir a sayısı al.
    3.i=1
    4.Eğer i>a ise 9.adıma git.
    5.i=i+1
    6.Eğer a%i==0 ise 8.adıma git.
    7.4.Adıma git.
    8.Yaz i 
    9.Dur.
    */

    public static void main(String[] args) {
        Scanner oku=new Scanner (System.in);
        System.out.println("Pozitif bir tam sayı: ");
        int a=oku.nextInt();
        System.out.println(a+" tam sayının tam bölenleri: ");
        for(int i=1; i<=a; i++){
            if(a%i==0){
                System.out.println("" +i);
                        
                   
            }
        }
         
        
    }
    
}

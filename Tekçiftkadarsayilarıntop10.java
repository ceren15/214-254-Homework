
import java.util.Scanner;
/*
1 DEN GİRİLEN SAYIYA KADAR KARELER TOPLAMI
*/

public class Tekçiftkadarsayilarıntop10 {
    /*
    HOCAYA ALGORİTMASINI SOR.!!!
    */

  
    public static void main(String[] args) {
       Scanner oku=new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int n=oku.nextInt();
        int t1=0;
        int t2=0;
        int t3=0;
        
        for(int i=1; i<=n; i++){
            t1+=i;
        } 
        for(int i=1; i<=n; i+=2){
            t2+=i;
        }
        for(int i=2; i<=n; i+=2){
            t3+=i;
        }
        System.out.println("1 den "+n+" e kadar sayıların toplamı:" +t1);
        System.out.println("1 den "+n+" e kadar tek sayıların toplamı:" +t2);
        System.out.println("2 den "+n+" e kadar çift sayıların toplamı:" +t3);
               
        
        
        
        
        
    }
    
}

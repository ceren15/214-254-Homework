
import java.util.Scanner;


public class Bağdaşıksayilar48_99 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        int a,b,a0,b0,a1,b1;
        System.out.println("İlk sayıyı giriniz : ");
        a=oku.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        b=oku.nextInt(); 
      
        while(a>9&&b>9){
            a1 =a/10;
            a0=a%10;
            b1 =b/10;
            b0=b%10;
            if ((a1==b1) && (a0+b0 ==10)) {
                System.out.println("Bağdaşık sayılardır.");
            }else{
                System.out.println("Bağdaşık sayı değillerdir.");
            }
            break;
        }
        
    }
    
}

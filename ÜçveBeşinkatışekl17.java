
import java.util.Scanner;


public class ÜçveBeşinkatışekl17 {
//Girilen tamsayı için 3(a) ve 5(b) in katlarını bulma.
    public static void main(String[] args) {
       Scanner oku=new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int S=oku.nextInt();
        for(int a=0;a<=S/3;a++){
            for(int b=0;b<=S/5;b++){
                if(3*a+5*b==S){
                    System.out.println(a+"-"+b);
                }
            }
        }
    }
    
}

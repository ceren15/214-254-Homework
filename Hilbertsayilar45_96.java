
import java.util.Scanner;

//4*k+1 sayılar hilbert sayılardır.
public class Hilbertsayilar45_96 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("Pozitif bir sayı giriniz : ");
        int s=oku.nextInt();
        if ((s-1)%4==0) {
            System.out.println("Hilbert Sayısıdır.");
        }else{
            System.out.println("Hilbert Sayısı değiidir.");
        }
    }
    
}

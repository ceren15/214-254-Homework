
import java.util.Scanner;


public class Floydüçgeni68_119 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Satır sayısını giriniz : ");
        int n=oku.nextInt();
        int s=1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.printf(" " +s);
                s++;
            }
            System.out.println("  ");
        }
        
    }
    
}

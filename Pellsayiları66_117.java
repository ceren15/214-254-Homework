
import java.util.Scanner;


public class Pellsayiları66_117 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Terim sayısını giriniz : ");
        int n=oku.nextInt();
        int P1=0,P2=1,P3;
        System.out.println(P1);
        System.out.println(P2);
        for (int k = 1; k <=n-2; k++) {
            P3=2*P2+P1;
            System.out.println(P3);
            P1=P2;
            P2=P3;
        }
    }
    
}


import java.util.Scanner;


public class Dobinskiformülü70_121 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Terim sayısını giriniz : ");
        int n=oku.nextInt();
        double e=2.71;
        for (int i = 1; i <= n; i++) {
            double t=0,f=1;
            for (int j = 1; j <= 100; j++) {
                f=f*j;
                t+=Math.pow(j, i/f);
            }
            System.out.println(t/e);
        }
    }
    
}

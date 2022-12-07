
import java.util.Scanner;


public class Euleriansayilar57_108 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz : ");
        int m=oku.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        int n=oku.nextInt();
        double f1=1,f2=1,f3=1,c;
        double t=Math.pow((n+1), m);
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= m+1; k++) {
                f1*=k;
            }
            for (int k = 1; k <= i; k++) {
                f2*=k;
            }
            for (int k = 1; k <=m+1-i; k++) {
                f3*=k;
            }
            c =f1/(f2*f3);
            t+=Math.pow(-1, i)*c*Math.pow(n+1-i, m);
        }
        System.out.println(t);
    }
    
}

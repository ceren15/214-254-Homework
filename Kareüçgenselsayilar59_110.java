
import java.util.Scanner;


public class Kareüçgenselsayilar59_110 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("Terim sayısını giriniz : ");
        int n=oku.nextInt();
        double k0=0,k1=1,k2;
        System.out.println(k1);
        for (int i = 1; i <= n-1; i++) {
            k2 =34*k1-k0+2;
            System.out.println(k2);
            k0=k1;
            k1=k2;
        }
    }
    
}

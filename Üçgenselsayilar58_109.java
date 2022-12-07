
import java.util.Scanner;


public class Üçgenselsayilar58_109 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Terim sayısını giriniz : ");
        int n=oku.nextInt();
        int u;
        for (int i = 1; i <=n; i++) {
            u =i*(i+1)/2;
            System.out.println(u);
        }
    }
    
}

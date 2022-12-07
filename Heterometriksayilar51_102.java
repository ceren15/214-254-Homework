
import java.util.Scanner;


public class Heterometriksayilar51_102 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.print("Adet sayısını giriniz : ");
        int n=oku.nextInt();
        for (int a = 1; a <=n; a++) {
            System.out.println(a *(a +1));
        }
    }
    
}

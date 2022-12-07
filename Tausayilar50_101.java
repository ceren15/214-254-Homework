
import java.util.Scanner;

//Sınavda soruldu.
public class Tausayilar50_101 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("Pozitif bir sayı giriniz : ");
        int N=oku.nextInt();
        int s;
        for (int i = 1; i <= N; i++) {
            s=0;
            for (int j = 1; j <= i; j++) {
                if (i%j==0) {
                    s+=1;
                }
            }
            if (i%s==0) {
                System.out.println(i);
            }
        }
    }
    
}


import java.util.Scanner;


public class Matris_Simetrik88_8_23 {

    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        System.out.println("Satır sayısını giriniz : ");
        int N=input.nextInt();
        int [][]A=new int[N][N];
        
        for (int i = 0; i <N; i++) {
            for (int j = 0; j <N; j++) {
                System.out.println(i+" inci satır "+j+" inci sütun ");
                A[i][j]=input.nextInt();
            }
        }
        int kontrol=1;
        for (int i = 0; i <N; i++) {
            for (int j = 0; j <N; j++) {
                if (A[i][j]!=A[j][i]) {
                kontrol=0;
                }
            }
        }
        if (kontrol==1) {
            System.out.println("Matris simetriktir.");
        }
        else{
            System.out.println("Simetrik değildir.");
        }
    }
}

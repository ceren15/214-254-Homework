
import java.util.Scanner;


public class Matris_Farkli_Satir_Toplami84_8_16 {

    public static void main(String[] args) {
        //Klavyeden girilen NxN tipindeki A matrisinin sondan bir önceki satır ve sütundaki elemanların toplamını hesaplayan program.
        Scanner input=new Scanner(System.in);
        System.out.print("Satır sayısını giriniz : ");
        int N =input.nextInt();
        int [][]A=new int[N][N];
        
        for (int i = 0; i <N; i++) {
            for (int j = 0; j <N; j++) {
                System.out.println(i+" inci satır "+ j +" inci sütun ");
                A[i][j]=input.nextInt();
            }
        }
        int toplam=0;
        for (int i = 0; i <N-1; i++) {
                toplam+=A[i][N-2]+A[N-2][i];
        }
        System.out.println("Toplam ");
        System.out.println(toplam-A[N-2][N-2]);
    }
}

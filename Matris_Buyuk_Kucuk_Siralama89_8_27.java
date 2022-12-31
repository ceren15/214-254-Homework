
import java.util.Scanner;


public class Matris_Buyuk_Kucuk_Siralama89_8_27 {

    public static void main(String[] args) {
        //Klavyeden girilen NxN tipindeki A matrisinin her bir satır elemanlarını kendi aralarında küçükten büyüğe doğru sıralayan program.aa
        Scanner input=new Scanner(System.in);
        System.out.println("Satır sayısını giriniz : ");
        int N=input.nextInt();
        int [][]A=new int[N][N];
        int [][][]B=new int[N][N][N];
        for (int i = 0; i <N; i++) {
            for (int j = 0; j <N; j++) {
                System.out.println(i+" inci satır "+j +" inci sütun ");
                A[i][j]=input.nextInt();
            }
        }
        
        for (int i = 0; i <N; i++) {
            for (int j = 0; j <N; j++) {
                B[i][i][j]=A[i][j];
            }
        }
        
        for (int i = 0; i <N; i++) {
            for (int j = 0; j <N; j++) {//Kitapta N-1 diye geçiyor!!!
                for (int k = j; k <N; k++) {
                    if (B[i][i][k]<B[i][i][j]) {
                        int temp=B[i][i][j];
                        B[i][i][j]=B[i][i][k];
                        B[i][i][k]=temp;
                    }
                }
            }
        }
        
        System.out.println();
        for (int i = 0; i <N; i++) {
            for (int j = 0; j <N; j++) {
                System.out.println(B[i][i][j]);
            }
        }
    }
}

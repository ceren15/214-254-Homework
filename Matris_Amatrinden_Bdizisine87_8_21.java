
import java.util.Scanner;


public class Matris_Amatrinden_Bdizisine87_8_21 {

    public static void main(String[] args) {
        //Klavyeden girilen NxN tipindeki A matrisinin her bir sütun elemanları çarpımından N elemanlı B dizisini oluşturan program..
        Scanner input=new Scanner(System.in);
        System.out.println("Satır sayısını giriniz : ");
        int N=input.nextInt();
        int [][]A=new int[N][N];
        int [] B=new int[N];
        for (int i = 0; i <N; i++) {
            for (int j = 0; j <N; j++) {
                System.out.println(i+" inci satır "+j +" inci sütun ");
                A[i][j]=input.nextInt();
            }
        }
        for (int i = 0; i <N; i++) {
            B[i]=1;
            for (int j = 0; j <N; j++) {
                B[i]=B [i]*A[j][i];//Sütunları alt alta çarptığımız için ters yazdık.
            }
            System.out.println(B[i]);
        }
    }
}
